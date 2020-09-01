package modelo.negocio.dao;

import java.util.List;

import modelo.negocio.entidades.Departamento;

public interface Vendedor {
	void insert(Vendedor obj);
	void atualizar(Vendedor obj);
	void deletarPorID(Integer obj);
	Departamento acharPorId(Vendedor id);
	List<Vendedor> acharTodos();

}
