package br.com.petshop.teste;

import br.com.petshop.DAOImpl.AnimalDAOImpl;
import br.com.petshop.modelo.Animal;

public class TestaAnimalSQLBuscaUmAnimal {
	
	public static void main(String[] args) {
		
		AnimalDAOImpl animalDaoImpl = new AnimalDAOImpl();
		
		Animal animal1 = new Animal();
		
		animal1= animalDaoImpl.buscaAnimal(1);
		System.out.println("");
		System.out.println(animal1.getAnimalId());

	}
		
	
	}
