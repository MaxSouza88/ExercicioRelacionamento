package com.RelacionamentoEntity.Relacionamentos.service;

import com.RelacionamentoEntity.Relacionamentos.model.CidadeModel;
import com.RelacionamentoEntity.Relacionamentos.model.EstadoModel;
import com.RelacionamentoEntity.Relacionamentos.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    EstadoRepository estadoRepository;

    public List<EstadoModel> buscaTudo(){
        return estadoRepository.findAll();
    }

    public Optional<EstadoModel> buscaId(Integer codigo){
        return estadoRepository.findById(codigo);
    }

    public EstadoModel cadastraEstado(EstadoModel estadoModel){

        estadoModel.getCodigo();
        estadoModel.getNomeEstado();

        return estadoRepository.save(estadoModel);
    }

    public EstadoModel alteraEstado(EstadoModel estadoModel){

        estadoModel.getCodigo();
        estadoModel.getNomeEstado();

        return estadoRepository.save(estadoModel);
    }

    public void deletaCadEstado (Integer codigo){
        estadoRepository.deleteById(codigo);
    }


}
