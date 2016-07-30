package br.com.petshop.teste;

import br.com.petshop.util.ConnectionFactory;

public class TestaConnetion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ConnectionFactory cFactory = new ConnectionFactory();
		cFactory.getConnection();	
		
//		System.out.println("");
//		
//		ConnectionFactorytesteerror cFactoryError = new ConnectionFactorytesteerror();
//		cFactoryError.getConnection();	
		System.out.println("ok");
	}

}
