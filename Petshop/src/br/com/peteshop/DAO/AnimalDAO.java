package br.com.peteshop.DAO;

import java.util.List;

import br.peteshop.modelo.Animal;

public interface AnimalDAO {

	public void insere (Animal animal);
	public void remove (Integer idAnimal);
    public Animal busca (Integer idAnimal);
	public List<Animal> buscaTodos ();
	public List<Animal> buscaPorTipoAnimal (Integer idTipoAnimal);
	public List<Animal> buscaPorTipoDono (Integer idPessoa);
	public List<Animal> buscaPorTipoDono (String cpf);
}
