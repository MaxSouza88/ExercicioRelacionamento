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
@Table(name = "estado")
public class EstadoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(name = "estado")
    private String nomeEstado;

    @JsonIgnore
    @OneToMany(mappedBy = "estadoModel",cascade = CascadeType.ALL)
    private List<CidadeModel> cidades = new ArrayList<>();


}
