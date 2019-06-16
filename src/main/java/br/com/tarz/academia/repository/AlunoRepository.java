package br.com.tarz.academia.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tarz.academia.entity.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, String> {
	
	Aluno findById(long id);

}
