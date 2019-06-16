package br.com.tarz.academia.model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

import br.com.tarz.academia.resource.AlunoResource;

@Entity
public class Aluno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6981136660345178997L;
	@Id
	@GeneratedValue
	private long id;
	@NotEmpty
	private String nome;
	private int status;
	private Date data;

	@OneToOne(optional = false, cascade = CascadeType.ALL)
	private Matricula matricula;

	public Aluno() {
		super();
	}

	public Aluno(AlunoResource aluno) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		this.nome = aluno.getNome();
		this.data = format.parse(aluno.getData());
		this.matricula = aluno.getMatricula();
	}

	public Aluno(long id, @NotEmpty String nome, int status, Date data, Matricula matricula) {
		super();
		this.id = id;
		this.nome = nome;
		this.status = status;
		this.data = data;
		this.matricula = matricula;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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
