package br.com.tarz.academia.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tarz.academia.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, String> {
	
	Aluno findById(long id);

}
