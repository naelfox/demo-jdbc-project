package modelo.negocio.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import modelo.negocio.dao.VendedorDAO;
import modelo.negocio.entidades.Departamento;
import modelo.negocio.entidades.Vendedor;

public class VendedorDaoJDBC implements VendedorDAO{
	
	private Connection conn;
	
	public VendedorDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(VendedorDAO obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(VendedorDAO obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarPorID(Integer obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vendedor acharPorId(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT seller.*,department.Name as DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id "
					+"WHERE seller.Id = ?");
			st.setInt(1, id);
			rs = st.executeQuery();
			if(rs.next()) {
				Departamento dep = instantianteDepartment(rs);
				Vendedor obj = instantiateVendedor(rs, dep);
				return obj;
			}
			return null;
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally{
			DB.fecharStatements(st);
			DB.fecharResultSet(rs);
		}
	}

	private Vendedor instantiateVendedor(ResultSet rs, Departamento dep) throws SQLException {
		Vendedor obj = new Vendedor();
		obj.setId(rs.getInt("Id"));
		obj.setNome(rs.getString("Email"));
		obj.setSalario(rs.getDouble("BaseSalary"));
		obj.setDataAniversario(rs.getDate("BirthDate"));
		obj.setDepartament(dep);
		return obj;
	}

	private Departamento instantianteDepartment(ResultSet rs) throws SQLException {
		Departamento dep = new Departamento();
		dep.setId(rs.getInt("DepartmentId"));
		dep.setName(rs.getString("DepName"));
		return null;
	}

	@Override
	public List<VendedorDAO> acharTodos() {
		
		return null;
	}

	
	
}
