package com.starwars.springsw.controller;

import com.starwars.springsw.model.UsuarioModel;
import com.starwars.springsw.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController()
@RequestMapping(path = "/api/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;

	@GetMapping()
	public ResponseEntity consultarTodos(){
		return ResponseEntity.ok(repository.findAll());
	}

	@PostMapping()
	public ResponseEntity<UsuarioModel> salvar(@RequestBody final UsuarioModel usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(usuario));
	}

	@GetMapping(path = "/{codigo}")
	public ResponseEntity consultar(@PathVariable("codigo") final Long codigo){

		Optional<UsuarioModel> usuarioModelOptional = repository.findById(codigo);
		if(usuarioModelOptional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		UsuarioModel usuarioModel = usuarioModelOptional.get();

		return ResponseEntity.ok(usuarioModel);

//		return repository.findById(codigo)
//				.map(usuario -> ResponseEntity.ok().body(usuario))
//				.orElse(ResponseEntity.notFound().build());
	}
}
