package com.starwars.springsw.repository;


import com.starwars.springsw.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel,Integer> {
}
