package br.com.petshop.DAO;

import java.util.List;

public interface Animal {
	public void insere (Animal animal);
	public void remove (Integer idAnimal);
	public Animal busca (Integer idAnimal);
	public List<Animal> buscaTodos ();
	public List<Animal> buscaPorTipoAnimal (Integer idTipoAnimal);
	public List<Animal> buscaPorTipoDono (Integer idPessoa);
	public List<Animal> buscaPorTipoDono (String cpf);
}
