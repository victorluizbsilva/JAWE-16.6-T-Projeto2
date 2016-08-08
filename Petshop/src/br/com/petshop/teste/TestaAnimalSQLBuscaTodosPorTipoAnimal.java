package br.com.petshop.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.petshop.DAOImpl.AnimalDAOImpl;
import br.com.petshop.modelo.Animal;

public class TestaAnimalSQLBuscaTodosPorTipoAnimal {
	
	public static void main(String[] args) {
		
		AnimalDAOImpl animalDaoImpl1 = new AnimalDAOImpl();
		
		List<Animal> animais = new ArrayList<>();
		
		
		animais= animalDaoImpl1.buscaAnimalPorTipoAnimal(1);
		System.out.println("Tipo animal 1");
		for (Animal animal1 : animais) {
			System.out.println(animais.get(animais.indexOf(animal1)).getNomeAnimal());	
		}
		
		System.out.println("");
		
		AnimalDAOImpl animalDaoImpl2 = new AnimalDAOImpl();
		animais= animalDaoImpl2.buscaAnimalPorTipoAnimal(2);
		System.out.println("Tipo animal 2");
		for (Animal animal1 : animais) {
			System.out.println(animais.get(animais.indexOf(animal1)).getNomeAnimal());	
		}
	
	System.out.println("");
		
		AnimalDAOImpl animalDaoImpl3 = new AnimalDAOImpl();
		animais= animalDaoImpl3.buscaAnimalPorTipoAnimal(3);
		System.out.println("Tipo animal 3");
		for (Animal animal1 : animais) {
			System.out.println(animais.get(animais.indexOf(animal1)).getNomeAnimal());	
		}
	
		
	}
		
	
	}
