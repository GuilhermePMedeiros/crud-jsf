package br.com.crudjsf.nucleo.base;

import br.com.crudjsf.lembrete.Lembrete;

public interface ObjectMapperBase <T> {

	// Add Object Method
	public void addObject(T t);
	// Search Object Method by id 
	public Lembrete findObjectById(long id);
	// Update Object Method by id
	public void UpdateObjectById(long id);
	// Remove Object Method by id
	public void removeObjectById(long id);
	
}
