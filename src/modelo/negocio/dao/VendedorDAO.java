package modelo.negocio.dao;

import java.util.List;

import modelo.negocio.entidades.Departamento;

public interface VendedorDAO {
	void insert(VendedorDAO obj);
	void atualizar(VendedorDAO obj);
	void deletarPorID(Integer obj);
	Departamento acharPorId(Integer id);
	List<VendedorDAO> acharTodos();

}
