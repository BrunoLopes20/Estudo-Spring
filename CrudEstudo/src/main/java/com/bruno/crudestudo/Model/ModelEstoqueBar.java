package com.bruno.crudestudo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Estoque")
public class ModelEstoqueBar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "TIPO", length = 50, nullable = false)
    private String tipo;

    @Column(name = "NAME", length = 50, nullable = false)
    private String nomeProduto;

    @Column(name = "QTD", length = 50, nullable = false)
    private Long quantidade;

}
