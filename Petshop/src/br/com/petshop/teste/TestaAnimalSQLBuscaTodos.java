package br.com.petshop.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.petshop.DAOImpl.AnimalDAOImpl;
import br.com.petshop.modelo.Animal;

public class TestaAnimalSQLBuscaTodos {
	
	public static void main(String[] args) {
		
		AnimalDAOImpl animalDaoImpl = new AnimalDAOImpl();
		
		List<Animal> animais = new ArrayList<>();
		
		
		animais= animalDaoImpl.buscaAnimalTodos();
		System.out.println("");
		for (Animal animal1 : animais) {
			System.out.println(animais.get(animais.indexOf(animal1)).getNomeAnimal());	
		}
		

	}
		
	
	}
