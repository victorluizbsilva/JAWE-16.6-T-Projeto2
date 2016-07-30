package br.com.petshop.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	//ja q não muda, criemos constante
	private static final String URL_BANCO = "jdbc:mysql://localhost:3306/PetShop";
	private static final String USUARIO_APLICACAO = "root";
	private static final String SENHA_APLICACAO = "";
	
	
	public Connection getConnection(){
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL_BANCO,USUARIO_APLICACAO,SENHA_APLICACAO);
			System.out.println("Conectado com sucesso.");
			//con = DriverManager.getConnection("url","root",""); 
			//getConnection DO DRIVER (driver manager)!!!
			//URL (endereço), "usuário", e "senha"
			//se mudar o banco... virar oracle por exemplo.... so muda o driver...
			
		} catch (SQLException e) {
			//
			//System.err.println("Erro ao conectar.");
			
			
    //    Util util = new Util();
    //    Util.trataErro(ConstantesSistema.MSG_ERRO_CONNECTION_0001, e);
			
			e.printStackTrace();
		}
		
		
		return con;
		
		
	}
	
}
