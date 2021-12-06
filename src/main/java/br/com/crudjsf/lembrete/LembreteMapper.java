package br.com.crudjsf.lembrete;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.crudjsf.nucleo.base.ObjectMapperBase;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 03/12/2021
 * */

public class LembreteMapper implements ObjectMapperBase<Lembrete> {

	// Attributes
	private Lembrete lembrete;
	private List<Lembrete> lembretes;
	private static LembreteMapper unicaInstancia;
	
	//Builder
	private LembreteMapper() {
		Instant agora = LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();

        Lembrete lembrete = new Lembrete();
        lembrete.setTitulo("Falar com henrique");
        lembrete.setDescricao("Dizer: oi!");
        lembrete.setDtCadastro(Date.from(agora));
        lembrete.setDtInicio(Date.from(agora));

		lembretes = new ArrayList<Lembrete>();
		
		addObject(lembrete);
	}
	
	//Singleton pattern method
	public static synchronized  LembreteMapper  getInstance() {
		if (unicaInstancia == null)
			unicaInstancia = new LembreteMapper();
 
		return unicaInstancia;
	}

	
	//Gets attributes methods
	public Lembrete getLembrete() {
		return lembrete;
	}
	

	public List<Lembrete> getLembretes() {
		return lembretes;
	}

	//Implements extends methods
	// Add Object
	@Override
	public void addObject(Lembrete lembrete) {
		//Set id value for next number. 
		lembrete.setId(lembretes.size() + 1l);
		// get current date and instant 
		Instant agora = LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        Date hoje = Date.from(agora);
        //Set Date in DtCadastro attributes 
        lembrete.setDtCadastro(hoje);
		//adding lembrete in List
		lembretes.add(lembrete);
	}
	
	// Finding Object
	@Override
	public Lembrete findObjectById(long id) {
		try {
			for (Lembrete lembrete : lembretes) {
				if (lembrete.getId() == id) {
					return lembrete;
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Update object TODO ...
	@Override
	public void UpdateObjectById(long id) {
		
	}

	// Remove object
	@Override
	public void removeObjectById(long id) {
		try {
            // Removing object of the list
            lembretes.remove(findObjectById(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
		
}
