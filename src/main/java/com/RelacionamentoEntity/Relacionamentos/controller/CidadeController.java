package com.RelacionamentoEntity.Relacionamentos.controller;

import com.RelacionamentoEntity.Relacionamentos.model.CidadeModel;
import com.RelacionamentoEntity.Relacionamentos.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CidadeController {

    @Autowired
    CidadeService cidadeService;

    @GetMapping(path = "/cidades")
    public Iterable<CidadeModel> buscaTudo(){
        return cidadeService.buscaTudo();
    }

    @GetMapping(path = "/cidades/{codigo}")
    public Optional<CidadeModel> buscaId(@PathVariable Integer codigo){
        return cidadeService.buscaId(codigo);
    }

    @PostMapping(path = "/cidades")
    @ResponseStatus(HttpStatus.CREATED)
    public CidadeModel cadastraCidade (@RequestBody CidadeModel cidadeModel){
        return cidadeService.cadastraCidade(cidadeModel);
    }

    @PutMapping(path = "cidades/{codigo}")
    public CidadeModel alteraCidade(@ RequestBody CidadeModel cidadeModel){
        return cidadeService.alteraCidade(cidadeModel);
    }

    @DeleteMapping(path = "cidades/{codigo}")
    public void deletaCidade(@PathVariable Integer codigo){
        cidadeService.deletaCadCidade(codigo);
    }
}

