package com.RelacionamentoEntity.Relacionamentos.repository;

import com.RelacionamentoEntity.Relacionamentos.model.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository <EnderecoModel, Integer> {
}
