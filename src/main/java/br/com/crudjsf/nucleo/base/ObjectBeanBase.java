package br.com.crudjsf.nucleo.base;

import java.util.List;

public interface ObjectBeanBase<T> {

	// Get Method to Objects List
	public List<T> getObjectList();
	// Add Method to Object
	public String addObject();
	// Search Method to Object by id
	public Object findObjectById(long id);
	// Update Method Object by id 
	public void UpdateObjectById(long id);
	// Remove Method To Object
	public void removeObjectById(long id);
	
}
