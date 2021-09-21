package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	//Insere um Departamento no BD
	void insert(Department obj);
	
	//Atualiza um departamento
	void update(Department obj);
	
	//Deleta um departamento pelo Id
	void deleteById(Integer id);
	
	//Acha um departamento pelo Id
	Department findById(Integer id);
	
	//Retorna uma lista com todos os departamentos
	List<Department> findAll();
}
