package br.com.crudjsf.lembrete;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 03/12/2021
 * */

//ManagedBean
@ManagedBean
@SessionScoped
public class LembreteService {
	
	//Attributes 
	private Lembrete lembrete;
	private LembreteDao lembreteDao;
	
	//Post builder
	@PostConstruct
	public void init() {
		lembrete = new Lembrete();
	}
	
	public Lembrete getLembrete() {
	    return lembrete;
	}
	
	public List<Lembrete> getLembretes() {
	    return null;
	}
	
	public String adicionar() {
	    return null;	        
	}
	
	public String editar() {
	    return null;
	}
	
	public String remover() {
	    return null;
	}
	
	public void lembretePorId() {
	
	} 
	
}
