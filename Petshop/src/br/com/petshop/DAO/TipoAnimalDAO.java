package br.com.petshop.DAO;

import java.util.List;

import br.com.petshop.modelo.TipoAnimal;

public interface TipoAnimalDAO {
	public void insere (TipoAnimalDAO tipoAnimal);
	public void remove (Integer idTipoAnimal);
	public TipoAnimal busca (Integer idTipoAnimal);
	public List<TipoAnimal> buscaTodos ();
	
	
}
