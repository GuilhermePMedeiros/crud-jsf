package br.com.crudjsf.lembrete;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.crudjsf.nucleo.base.ObjectDaoBase;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 03/12/2021
 * */

public class LembreteDao extends ObjectDaoBase<Lembrete> {

	// Attributes
	private Lembrete lembrete;
	private List<Lembrete> lembretes;
	private static LembreteDao unicaInstancia;
	
	//Builder
	private LembreteDao() {
		Instant agora = LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();

        Lembrete lembrete = new Lembrete();
        lembrete.setId(1L);
        lembrete.setTitulo("Falar com henrique");
        lembrete.setDescricao("Dizer: oi!");
        lembrete.setDtCadastro(Date.from(agora));
        lembrete.setDtInicio(Date.from(agora));

		lembretes = new ArrayList<Lembrete>();
		
		addObject(lembrete);
	}
	
	//Singleton pattern method
	public static synchronized  LembreteDao  getInstance() {
		if (unicaInstancia == null)
			unicaInstancia = new LembreteDao();
 
		return unicaInstancia;
	}

	
	//Gets
	public Lembrete getLembrete() {
		return lembrete;
	}
	
	public List<Lembrete> getLembretes() {
		return lembretes;
	}

	//Implements extends Methods
	@Override
	public void addObject(Lembrete lembrete) {
		lembretes.add(lembrete);
	}
	
	@Override
	public Lembrete findObjectById(long id) {
		return null;
	}

	@Override
	public void UpdateObjectById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObjectById(long id) {
		// TODO Auto-generated method stub
		
	}
		
}
