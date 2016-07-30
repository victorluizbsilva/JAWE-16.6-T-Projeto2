package br.com.peteshop.DAO;

import java.util.List;

import br.peteshop.modelo.Pessoa;

public interface PessoaDAO {
	public void insere (Pessoa pessoa);
	public void remove (Integer idPessoa);
	public Pessoa busca (Integer idPessoa);
	public Pessoa busca (String cpf);
	public List<Pessoa> buscaTodos ();

}
