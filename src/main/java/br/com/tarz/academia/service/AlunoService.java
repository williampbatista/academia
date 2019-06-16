package br.com.tarz.academia.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.tarz.academia.converter.AlunoConverter;
import br.com.tarz.academia.entity.Aluno;
import br.com.tarz.academia.repository.AlunoRepository;
import br.com.tarz.academia.resource.AlunoResource;

@Component
public class AlunoService {

	@Autowired
	AlunoRepository ar;

	public AlunoResource salvarAluno(AlunoResource alunoResource)   {
		Date dataFim = new Date();
		dataFim.setMonth(1);
		alunoResource.getMatricula().setDataInicio(new Date());
		alunoResource.getMatricula().setDataFim(dataFim);
		Aluno aluno = ar.save(AlunoConverter.toEntity(alunoResource));
		alunoResource.setId(aluno.getId());
		return alunoResource;
	}

}
