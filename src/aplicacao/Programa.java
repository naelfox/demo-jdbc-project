package aplicacao;



import modelo.negocio.dao.DaoFabrica;
import modelo.negocio.dao.VendedorDAO;

import modelo.negocio.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		VendedorDAO vendedorDao = DaoFabrica.criarVendedorDao();
		Vendedor vendedor = vendedorDao.acharPorId(3);
		System.out.println(vendedor);
		
		
		
	}

}
