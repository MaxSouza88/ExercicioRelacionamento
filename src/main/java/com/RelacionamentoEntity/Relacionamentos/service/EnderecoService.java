package com.RelacionamentoEntity.Relacionamentos.service;

import com.RelacionamentoEntity.Relacionamentos.model.EnderecoModel;
import com.RelacionamentoEntity.Relacionamentos.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {


    @Autowired
    EnderecoRepository enderecoRepository;

    public List<EnderecoModel> buscaTudo(){
        return enderecoRepository.findAll();
    }

    public Optional<EnderecoModel> buscaId( Integer codigo){
        return enderecoRepository.findById(codigo);
    }

    public EnderecoModel cadastraEndereco (EnderecoModel enderecoModel){

        enderecoModel.getCodigo();
        enderecoModel.getLogradouro();
        enderecoModel.getCliente();

        return enderecoRepository.save(enderecoModel);

    }

    public EnderecoModel alteraEndereco (EnderecoModel enderecoModel){

        enderecoModel.getCodigo();
        enderecoModel.getLogradouro();
        enderecoModel.getCliente();

        return enderecoRepository.save(enderecoModel);

    }

    public void deletaEndereco(Integer codigo){
        enderecoRepository.deleteById(codigo);
    }
}
