package br.com.petshop.DAO;

import java.util.List;

import br.com.petshop.modelo.Cliente;

public interface ClienteDAO {
	public void insere (Cliente pessoa);
	public void remove (Integer idPessoa);
	public Cliente busca (Integer idPessoa);
	public Cliente busca (String cpf);
	public List<Cliente> buscaTodos ();
	
}
