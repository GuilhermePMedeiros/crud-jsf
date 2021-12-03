package br.com.crudjsf.lembrete;

import java.util.Date;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 03/12/2021
 * */

public class Lembrete {
	
	// Attributes
	private long id;
	private String titulo;
	private String descrição;
	private Date dtCadastro;
	private Date dtInicio;
	
	// Builds 
	public Lembrete() {
		
	}
	
	public Lembrete(long id) {
		super();
		this.id = id;
	}

	public Lembrete(long id, String titulo) {
		super();
		this.id = id;
		this.titulo = titulo;
	}

	public Lembrete(long id, String titulo, String descrição) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descrição = descrição;
	}

	public Lembrete(long id, String titulo, String descrição, Date dtCadastro) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descrição = descrição;
		this.dtCadastro = dtCadastro;
	}

	public Lembrete(long id, String titulo, String descrição, Date dtCadastro, Date dtInicio) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descrição = descrição;
		this.dtCadastro = dtCadastro;
		this.dtInicio = dtInicio;
	}


	//Gets and Sets
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public Date getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}
	
	//toString method 	
	@Override
	public String toString() {
		return "Lembrete [id=" + id + ", titulo=" + titulo + ", descrição=" + descrição + ", dtCadastro=" + dtCadastro
				+ ", dtInicio=" + dtInicio + "]";
	}
	
}
