package br.com.crudjsf.lembrete;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.crudjsf.nucleo.base.ObjectBeanBase;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 03/12/2021
 * */

//ManagedBean
@ManagedBean
@SessionScoped
public class LembreteBean implements ObjectBeanBase<Lembrete>{
	
	private Lembrete lembrete;
	private LembreteMapper lembreteMapper;
	
	// Post builder
	@PostConstruct
	public void init() {
		lembrete = new Lembrete();
		lembreteMapper = LembreteMapper.getInstance();
	}

	// Get attribute method
	public Lembrete getLembrete() {
		return lembrete;
	}
	
	// Implements Methods of the interface ObjectBeanBase
	@Override
	public List<Lembrete> getObjectList() {
		// Returning the Lembretes list
		return lembreteMapper.getLembretes();
	}
	
	// Add object
	@Override
	public String addObject() {		
		// Adding object with Mapper class 
		lembreteMapper.addObject(lembrete);
		lembrete = new Lembrete();
		// Setting message to "Success" 
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Lembrete adicionado com sucesso!"));
		context.getExternalContext().getFlash().setKeepMessages(true);
		// Redirect to index
		return "index.xhtml?faces-redirect=true";
	}

	// TODO ...
	@Override
	public Object findObjectById(long id) {
		return null;
	}

	// TODO ...
	@Override
	public void UpdateObjectById(long id) {
		
	}

	// TODO ...
	@Override
	public void removeObjectById(long id) {
		
	}

}
