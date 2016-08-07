package br.com.petshop.util;

public class SQL {
	
   //PESSOA (TABELA "CLIENTE")
   public static final String INSERE_PESSOA = "INSERT CLIENTE (NOME,CPF, TELEFONE, EMAIL) VALUES(?,?,?,?)";
   public static final String REMOVE_PESSOA = "DELETE FROM CLIENTE WHERE CLIENTE_ID = ?";
   public static final String BUSCA_PESSOA = "SELECT * FROM CLIENTE WHERE CLIENTE_ID = ?";
   public static final String BUSCA_PESSOA_POR_CPF = "SELECT * FROM CLIENTE WHERE CPF = ?";
   public static final String BUSCA_PESSOA_TODOS = "SELECT * FROM CLIENTE";
   
   //ANIMAL
   public static final String INSERE_ANIMAL = "INSERT ANIMAL (NOME, ID_DONO, ID_TIPO_ANIMAL) VALUES(?,?,?)";
   public static final String REMOVE_ANIMAL = "DELETE FROM ANIMAL WHERE ANIMAL_ID = ?";
   public static final String BUSCA_ANIMAL = "SELECT * FROM ANIMAL WHERE ANIMAL_ID = ?";
   public static final String BUSCA_ANIMAL_POR_DONO = "SELECT * FROM ANIMAL WHERE ID_DONO = ?";
   public static final String BUSCA_ANIMAL_POR_TIPO_ANIMAL = "SELECT * FROM ANIMAL WHERE ID_TIPO_ANIMAL = ?";
   public static final String BUSCA_ANIMAL_TODOS = "SELECT * FROM ANIMAL";


   //TIPO_ANIMAL
   public static final String INSERE_TIPO_ANIMAL = "INSERT TIPO_ANIMAL (TIPO) VALUES(?)";
   public static final String REMOVE_TIPO_ANIMAL = "DELETE FROM TIPO_ANIMAL WHERE TIPO_ANIMAL_ID = ?";
   public static final String BUSCA_TIPO_ANIMAL = "SELECT * FROM TIPO_ANIMAL WHERE ANIMAL_ID = ?";
   public static final String BUSCA_TIPO_ANIMAL_TODOS = "SELECT * FROM TIPO_ANIMAL";

   
}
