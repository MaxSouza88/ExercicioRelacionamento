package com.RelacionamentoEntity.Relacionamentos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "enderecos")
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(name = "logradouro")
    private String logradouro;

    @ManyToOne // Muitos para um.
    @JoinColumn(name = "cliente_id",referencedColumnName = "codigo")
    private ClienteModel cliente;
}
