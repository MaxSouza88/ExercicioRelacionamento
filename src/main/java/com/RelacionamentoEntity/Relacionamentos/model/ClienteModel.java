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
@Table(name = "clientes")
public class ClienteModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(name = "nome_cliente")
    private String nomeCliente;

    //OneToMany = 1 para todos. Uma relacao para muitos.
    @JsonIgnore //evita recursividade nas buscas
    @OneToMany (mappedBy = "clienteModel", cascade = CascadeType.ALL) //cascade, é um recurso de exclusao. Se exclui cliente, exclui também o endereço.
    private List<EnderecoModel> enderecos = new ArrayList<>();

}
