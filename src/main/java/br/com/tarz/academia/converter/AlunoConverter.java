package br.com.tarz.academia.converter;

import br.com.tarz.academia.entity.Aluno;
import br.com.tarz.academia.resource.AlunoResource;

public class AlunoConverter {
	
	public static Aluno toEntity(AlunoResource resource) {
		Aluno aluno = new Aluno();
		aluno.setMatricula(resource.getMatricula());
		aluno.setNome(resource.getNome());
		aluno.setData(resource.getData());
		return aluno;
	}
	
	public static AlunoResource toResource(Aluno aluno) {
		AlunoResource resource = new AlunoResource();
		resource.setId(aluno.getId());
		resource.setMatricula(aluno.getMatricula());
		resource.setNome(aluno.getNome());
		resource.setData(aluno.getData());
		return resource;
	}

}
