package com.starwars.springsw.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "usuario")
public class UsuarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@Column(nullable = false,length = 50)
	private String nome;

	@Column(nullable = false,length = 10)
	private String login;

	@Column(nullable = false,length = 10)
	private String senha;
}
