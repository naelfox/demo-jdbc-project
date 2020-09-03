package modelo.negocio.dao;

import db.DB;
import modelo.negocio.dao.impl.VendedorDaoJDBC;

public class DaoFabrica {
	public static VendedorDAO criarVendedorDao() {
		return new VendedorDaoJDBC(DB.getConexao());
	}

}
