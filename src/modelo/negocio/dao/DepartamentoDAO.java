package modelo.negocio.dao;

import java.util.List;

import modelo.negocio.entidades.Departamento;

public interface DepartamentoDAO {
	
	void insert(Departamento obj);
	void atualizar(Departamento obj);
	void deletarPorID(Integer obj);
	Departamento acharPorId(Integer id);
	List<Departamento> acharTodos();
	
	

}
