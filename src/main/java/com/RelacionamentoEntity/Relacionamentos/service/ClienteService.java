package com.RelacionamentoEntity.Relacionamentos.service;

import com.RelacionamentoEntity.Relacionamentos.model.ClienteModel;
import com.RelacionamentoEntity.Relacionamentos.repository.ClienteRepository;
import com.RelacionamentoEntity.Relacionamentos.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<ClienteModel> buscaTudo(){
        return clienteRepository.findAll();
    }

    public Optional<ClienteModel> buscaId(Integer codigo){
        return clienteRepository.findById(codigo);
    }

    public ClienteModel cadastraCliente (ClienteModel clienteModel){

        clienteModel.getCodigo();
        clienteModel.getNomeCliente();

        return clienteRepository.save(clienteModel);
    }

    public ClienteModel alteraCadCliente (ClienteModel clienteModel){

        clienteModel.getCodigo();
        clienteModel.getNomeCliente();

        return clienteRepository.save(clienteModel);
    }

    public void deletaCadCliente (Integer codigo){
        clienteRepository.deleteById(codigo);
    }

}
