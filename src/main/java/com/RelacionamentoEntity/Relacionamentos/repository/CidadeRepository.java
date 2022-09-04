package com.RelacionamentoEntity.Relacionamentos.repository;

import com.RelacionamentoEntity.Relacionamentos.model.CidadeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<CidadeModel,Integer>{
}
