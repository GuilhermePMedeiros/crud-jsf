package br.com.crudjsf.lembrete;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.crudjsf.nucleo.base.ObjectServiceBase;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 03/12/2021
 * */

//ManagedBean
@ManagedBean
@SessionScoped
public class LembreteService extends ObjectServiceBase<Lembrete>{
	
	private Lembrete lembrete;
	private LembreteDao lembreteDao;
	
	//Post builder
	@PostConstruct
	public void init() {
		lembrete = new Lembrete();
		lembreteDao = LembreteDao.getInstance();
	}

	public Lembrete getLembrete() {
		return lembrete;
	}
	
	@Override
	public List<Lembrete> getObjectList() {
		return lembreteDao.getLembretes();
	}

	@Override
	public Lembrete findObjectById() {
		return null;
	}

	@Override
	public String addObject() {		
		return "home";
	}

	@Override
	public String UpdateObjectById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removerObjectById() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
