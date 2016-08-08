package br.com.petshop.teste;

import br.com.petshop.DAOImpl.AnimalDAOImpl;
import br.com.petshop.modelo.Animal;

public class TestaAnimalSQL {
	
	public static void main(String[] args) {
			Animal animal1 = new Animal();
		
		animal1.setNomeAnimal("Jurema");
		animal1.setIdDono(1);
		animal1.setIdTipoAnimal(2);
		
		AnimalDAOImpl animalDaoImpl = new AnimalDAOImpl();
		
		animalDaoImpl.insereAnimal(animal1);

	}
		
	
	}
