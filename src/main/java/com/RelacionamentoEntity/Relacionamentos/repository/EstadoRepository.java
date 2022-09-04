package com.RelacionamentoEntity.Relacionamentos.repository;

import com.RelacionamentoEntity.Relacionamentos.model.EstadoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<EstadoModel,Integer> {
}
