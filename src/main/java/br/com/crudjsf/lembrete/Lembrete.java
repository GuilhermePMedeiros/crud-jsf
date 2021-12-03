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
	private String descri��o;
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

	public Lembrete(long id, String titulo, String descri��o) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descri��o = descri��o;
	}

	public Lembrete(long id, String titulo, String descri��o, Date dtCadastro) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descri��o = descri��o;
		this.dtCadastro = dtCadastro;
	}

	public Lembrete(long id, String titulo, String descri��o, Date dtCadastro, Date dtInicio) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descri��o = descri��o;
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

	public String getDescri��o() {
		return descri��o;
	}

	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
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
		return "Lembrete [id=" + id + ", titulo=" + titulo + ", descri��o=" + descri��o + ", dtCadastro=" + dtCadastro
				+ ", dtInicio=" + dtInicio + "]";
	}
	
}
