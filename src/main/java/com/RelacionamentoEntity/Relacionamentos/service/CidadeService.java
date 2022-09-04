package com.RelacionamentoEntity.Relacionamentos.service;

import com.RelacionamentoEntity.Relacionamentos.model.CidadeModel;
import com.RelacionamentoEntity.Relacionamentos.model.ClienteModel;
import com.RelacionamentoEntity.Relacionamentos.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {

  @Autowired
    CidadeRepository cidadeRepository;

  public List<CidadeModel> buscaTudo(){
    return cidadeRepository.findAll();
  }

  public Optional<CidadeModel> buscaId(Integer codigo){
    return cidadeRepository.findById(codigo);
  }

  public CidadeModel cadastraCidade(CidadeModel cidadeModel){

    cidadeModel.getCodigo();
    cidadeModel.getNomeCidade();

    return cidadeRepository.save(cidadeModel);
  }

  public CidadeModel alteraCidade(CidadeModel cidadeModel){

    cidadeModel.getCodigo();
    cidadeModel.getNomeCidade();

    return cidadeRepository.save(cidadeModel);
  }

  public void deletaCadCidade (Integer codigo){
    cidadeRepository.deleteById(codigo);
  }

}
