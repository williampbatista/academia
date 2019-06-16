package br.com.tarz.academia.resource;

import br.com.tarz.academia.model.Matricula;

public class AlunoResource {

	private String nome;
	private String data;
	private Matricula matricula;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

}
