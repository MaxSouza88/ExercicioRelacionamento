package com.RelacionamentoEntity.Relacionamentos.controller;

import com.RelacionamentoEntity.Relacionamentos.model.CidadeModel;
import com.RelacionamentoEntity.Relacionamentos.model.EstadoModel;
import com.RelacionamentoEntity.Relacionamentos.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EstadoController {

    @Autowired
    EstadoService estadoService;

    @GetMapping(path = "/estado")
    public Iterable<EstadoModel> buscaTudo(){
        return estadoService.buscaTudo();
    }

    @GetMapping(path = "/estado/{codigo}")
    public Optional<EstadoModel> buscaId(@PathVariable Integer codigo){
        return estadoService.buscaId(codigo);
    }

    @PostMapping(path = "/estado")
    @ResponseStatus(HttpStatus.CREATED)
    public EstadoModel cadastraCidade (@RequestBody EstadoModel estadoModel){
        return estadoService.cadastraEstado(estadoModel);
    }

    @PutMapping(path = "estado/{codigo}")
    public EstadoModel alteraEstado(@ RequestBody EstadoModel estadoModel){
        return estadoService.alteraEstado(estadoModel);
    }

    @DeleteMapping(path = "estado/{codigo}")
    public void deletaEstado(@PathVariable Integer codigo){
        estadoService.deletaCadEstado(codigo);
    }

}
