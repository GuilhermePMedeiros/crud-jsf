package br.com.crudjsf.nucleo.base;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 03/12/2021
 * */

public abstract class ObjectDaoBase<T>{
	
	//
	public abstract void addObject(T t);
	//
	public abstract Object findObjectById(long id);
	//
	public abstract void UpdateObjectById(long id);
	//
	public abstract void removeObjectById(long id);
	
	
	
}
