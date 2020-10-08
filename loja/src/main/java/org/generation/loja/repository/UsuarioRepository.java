package org.generation.loja.repository;

import java.util.List;

import org.generation.loja.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
public List <Usuario>  findAllByNomeContainingIgnoreCase(String nome);

}
