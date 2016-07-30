package br.com.peteshop.DAO;

import java.util.List;

import br.peteshop.modelo.TipoAnimal;

public interface TipoAnimalDAO {

	public void insere (TipoAnimalDAO tipoAnimal);
	public void remove (Integer idTipoAnimal);
	public TipoAnimal busca (Integer idTipoAnimal);
	public List<TipoAnimal> buscaTodos ();
}
