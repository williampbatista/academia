package br.com.tarz.academia.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Matricula implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4120244113968456902L;
	@Id
	@GeneratedValue
	private long id;
	private Date dataInicio;
	private Date dataFim;
	private int plano;

	public Matricula() {
		super();
	}

	public Matricula(long id, @NotEmpty Date dataInicio, @NotEmpty Date dataFim, @NotEmpty int plano) {
		super();
		this.id = id;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.plano = plano;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public int getPlano() {
		return plano;
	}

	public void setPlano(int plano) {
		this.plano = plano;
	}

}
