package com.RelacionamentoEntity.Relacionamentos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cidades")
public class CidadeModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(name = "cidade")
    private String nomeCidade;

    @ManyToOne // Muitos para um.
    @JoinColumn(name = "nomeEstado",referencedColumnName = "codigo")
    private EstadoModel estado;

}
