package br.com.petshop.teste;

import br.com.petshop.DAOImpl.AnimalDAOImpl;

public class TestaAnimalSQLremove {
	
	public static void main(String[] args) {
		
		AnimalDAOImpl animalDaoImpl = new AnimalDAOImpl();
		
		animalDaoImpl.removeAnimal(11);

	}
		
	
	}
