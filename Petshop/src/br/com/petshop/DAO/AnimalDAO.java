package br.com.petshop.DAO;

import java.util.List;

import br.com.petshop.modelo.Animal;

public interface AnimalDAO {
	public void insereAnimal (Animal animal);
	public void removeAnimal (Integer idAnimal);
	public Animal buscaAnimal (Integer idAnimal);
	public List<Animal> buscaAnimalTodos ();
	public List<Animal> buscaAnimalPorTipoAnimal (Integer idTipoAnimal);
	public List<Animal> buscaAnimalPorTipoDono (Integer idPessoa);
	}
