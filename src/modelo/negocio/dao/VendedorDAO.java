package modelo.negocio.dao;

import java.util.List;

import modelo.negocio.entidades.Vendedor;

public interface VendedorDAO {
	void insert(VendedorDAO obj);
	void atualizar(VendedorDAO obj);
	void deletarPorID(Integer obj);
	Vendedor acharPorId(Integer id);
	List<VendedorDAO> acharTodos();

}
