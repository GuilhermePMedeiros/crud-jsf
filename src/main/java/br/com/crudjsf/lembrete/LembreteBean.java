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
	
	// Attributes
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

	// Finding object
	@Override
	public void findObjectById() {
		// Returning lembrete object...
		lembrete = lembreteMapper.findObjectById(lembrete.getId());
		// If lembrete not exits, execute...   
		if (lembrete == null || lembrete.getId() == 0) {
			// Returning error message	
			FacesMessage message = new FacesMessage("Lembrete não encontrado.");
	        message.setSeverity(FacesMessage.SEVERITY_ERROR);
	        FacesContext.getCurrentInstance().addMessage(null, message);
	        // Inserting new value, because the object can't to be empty.
	        lembrete = new Lembrete();		
		}
	}

	// Update object TODO
	@Override
	public String UpdateObjectById() {
		return "";
	}

	// Remove object
	@Override
	public String removeObjectById() {
		// Removing lembrete object...
		lembreteMapper.removeObjectById(lembrete.getId());
		// Inserting new value, because the object can't to be empty.
		lembrete = new Lembrete();
		// Returning success message
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Lembrete removido com sucesso!"));
        context.getExternalContext().getFlash().setKeepMessages(true);
        // redirecting page
        return "index.xhtml?faces-redirect=true";
	}

}
