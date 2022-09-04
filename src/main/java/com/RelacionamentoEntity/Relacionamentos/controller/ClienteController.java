package com.RelacionamentoEntity.Relacionamentos.controller;

import com.RelacionamentoEntity.Relacionamentos.model.ClienteModel;
import com.RelacionamentoEntity.Relacionamentos.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping(path = "/clientes") //busca todos clientes
    public Iterable<ClienteModel> buscarTodosClientes(){
        return clienteService.buscaTudo();
    }

    @GetMapping(path = "/codigo/{codigo}") //busca clientes por codigo de cadastro
    public Optional<ClienteModel> buscaId(@PathVariable Integer codigo){
        return clienteService.buscaId(codigo);
    }

    @PostMapping(path = "/clientes") //cadastra cliente
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteModel cadastraCliente (@RequestBody ClienteModel clienteModel){
        return clienteService.cadastraCliente(clienteModel);
    }

    @PutMapping(path = "clientes/{codigo}") //altera cadastro buscando por codigo
    public ClienteModel alteraCadastro(@ RequestBody ClienteModel clienteModel){
        return clienteService.alteraCadCliente(clienteModel);
    }

    @DeleteMapping(path = "clientes/{codigo}")
    public void deletaCliente(@PathVariable Integer codigo){
        clienteService.deletaCadCliente(codigo);
    }
}
