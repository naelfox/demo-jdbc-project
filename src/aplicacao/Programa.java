package aplicacao;

import java.util.Date;

import modelo.negocio.entidades.Departamento;
import modelo.negocio.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
	
		
		
		Departamento obj = new Departamento(1, "livros");
		System.out.println(obj);
		Vendedor vendedor = new Vendedor(21, "bob", "bob@gmail.com", new Date(), 3000.0, obj);
		System.out.println(vendedor);
		
	}

}
