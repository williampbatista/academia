package br.com.tarz.academia.resource;

import java.io.Serializable;
import java.sql.Date;

import br.com.tarz.academia.entity.Matricula;

public class AlunoResource implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8565695382723300284L;
	private Long id;
	private String nome;
	private Date data;
	private Matricula matricula;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

}
