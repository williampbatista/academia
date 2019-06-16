package br.com.tarz.academia.service;

import java.text.ParseException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tarz.academia.model.Aluno;
import br.com.tarz.academia.repository.AlunoRepository;
import br.com.tarz.academia.resource.AlunoResource;

@Service
public class AlunoService {

	@Autowired
	AlunoRepository ar;

	@SuppressWarnings("deprecation")
	public void salvarAluno(AlunoResource alunoResource) throws ParseException {
		Date dataFim = new Date();
		dataFim.setMonth(1);
		alunoResource.getMatricula().setDataInicio(new Date());
		alunoResource.getMatricula().setDataFim(dataFim);
		Aluno a = new Aluno(alunoResource);
		ar.save(a);
	}

}
