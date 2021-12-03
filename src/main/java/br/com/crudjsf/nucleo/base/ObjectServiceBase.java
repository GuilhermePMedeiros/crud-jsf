package br.com.crudjsf.nucleo.base;

import java.util.List;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 03/12/2021
 * */

//@ ManagedBean
//@ SessionScoped
public abstract class ObjectServiceBase<T> {
	
	public abstract List<T> getObjectList();
	
	public abstract Object findObjectById();
	
	public abstract String addObject();
	
	public abstract String UpdateObjectById();
	
	public abstract String removerObjectById();
	
}
