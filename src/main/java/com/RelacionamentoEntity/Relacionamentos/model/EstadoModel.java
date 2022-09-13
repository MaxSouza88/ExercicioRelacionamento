package com.RelacionamentoEntity.Relacionamentos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "estados")
public class EstadoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(name = "estado_id")
    private String nomeEstado;

    @JsonIgnore
    @OneToMany(mappedBy = "estado",cascade = CascadeType.ALL)
    private List<CidadeModel> cidadeModel = new ArrayList<>();


}
