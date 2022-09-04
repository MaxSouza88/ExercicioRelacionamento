package com.RelacionamentoEntity.Relacionamentos.controller;

import com.RelacionamentoEntity.Relacionamentos.model.ClienteModel;
import com.RelacionamentoEntity.Relacionamentos.model.EnderecoModel;
import com.RelacionamentoEntity.Relacionamentos.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService;

    @GetMapping(path = "/enderecos") //busca todos enderecos
    public List<EnderecoModel> buscarTodosClientes(){
        return enderecoService.buscaTudo();
    }

    @GetMapping(path = "/enderecos/{codigo}") //busca enderecos por codigo de cadastro
    public Optional<EnderecoModel> buscaId(@PathVariable Integer codigo){
        return enderecoService.buscaId(codigo);
    }

    @PostMapping(path = "/enderecos") //cadastra cliente
    @ResponseStatus(HttpStatus.CREATED)
    public EnderecoModel cadastraCliente (@RequestBody EnderecoModel enderecomodel){
        return enderecoService.cadastraEndereco(enderecomodel);
    }

    @PutMapping(path = "enderecos/{codigo}") //altera cadastro buscando por codigo
    public EnderecoModel alteraCadastro(@ RequestBody EnderecoModel enderecomodel){
        return enderecoService.alteraEndereco(enderecomodel);
    }

    @DeleteMapping(path = "enderecos/{codigo}")
    public void deletaEndereco(@PathVariable Integer codigo){
        enderecoService.deletaEndereco(codigo);
    }
}
