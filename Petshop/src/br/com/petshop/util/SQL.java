package br.com.petshop.util;

public class SQL {
   public static final String INSERE = "INSERT PESSOA (CLIENTE_ID,NOME,CPF, TLEFONE, EMAIL) VALUES(?,?,?,?)";
   public static final String REMOVE = "DELETE FROM CONTATO WHERE CLIENTE_ID = ?";
   public static final String BUSCA_CLIENTE = "SELECT * FROM CLIENTE";
   public static final String BUSCA_CPF = "SELECT * FROM PESSOA  WHERE CPF = ?";
   public static final String BUSCA_TODOS = "SELECT * FROM CLIENTE";
   
   
}
