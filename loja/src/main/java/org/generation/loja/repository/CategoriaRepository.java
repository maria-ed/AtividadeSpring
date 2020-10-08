package org.generation.loja.repository;

import java.util.List;

import org.generation.loja.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
		public List<Categoria> findAllByNomeContainingIgnoreCase (String nome);

	}
