package br.com.petshop.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.petshop.DAO.AnimalDAO;
import br.com.petshop.modelo.Animal;
import br.com.petshop.util.ConnectionFactory;
import br.com.petshop.util.SQL;

public class AnimalDAOImpl implements AnimalDAO {
	private Connection con;

	//construtor
	public AnimalDAOImpl() {
		super();
		this.con =new ConnectionFactory().getConnection();
		// resumiu as 2 linhas do connection factory em uma linha so...
	}

	@Override
	public void insereAnimal(Animal animal) {
		// TODO Auto-generated method stub


		try {
			PreparedStatement stmt = con.prepareStatement(SQL.INSERE_ANIMAL);

			stmt.setString(1, animal.getNomeAnimal());
			stmt.setInt(2, animal.getIdDono());
			stmt.setInt(3, animal.getIdTipoAnimal());

			stmt.execute();
			stmt.close();
			System.out.println("insert (animal) -> sucesso");

		} catch (SQLException e) {
			// lembrar de "tratar erro"
			e.printStackTrace();
		}




	}

	@Override
	public void removeAnimal(Integer idAnimal) {
		// TODO Auto-generated method stub

		try {
			PreparedStatement stmt = con.prepareStatement(SQL.REMOVE_ANIMAL);
			stmt.setInt(1, idAnimal);

			stmt.execute();
			stmt.close();
			System.out.println("remove -> sucesso");

		} catch (SQLException e) {
			// lembrar de "tratar erro"
			e.printStackTrace();
		}


	}

	@Override
	public Animal buscaAnimal(Integer idAnimal) {
		// TODO Auto-generated method stub
		Animal animal1 = new Animal();

		try {
			PreparedStatement stmt = con.prepareStatement(SQL.BUSCA_ANIMAL);
			stmt.setInt(1, idAnimal);

			ResultSet rs = stmt.executeQuery();


			if (rs.next()){
				//contato1.setId(rs.getInt("contato_id"));
				animal1.setNomeAnimal(rs.getString("nome"));
				animal1.setIdDono(rs.getInt("id_dono"));
				animal1.setIdTipoAnimal(rs.getInt("id_tipo_animal"));

			}
			rs.close();
			stmt.close();
			con.close();


		} catch (Exception e) {
			// TODO: handle exception
			//	Util.trataErro(util.MSG_ERRO_DAO_0002, e);
			e.printStackTrace();
		}

		System.out.println("Busca UM Animal -> sucesso*");
		System.out.println(animal1.getNomeAnimal());
		System.out.println("");
		return animal1;
	}


	@Override
	public List<Animal> buscaAnimalTodos() {
		// TODO Auto-generated method stub
		List<Animal> animais = new ArrayList<>();

		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement(SQL.BUSCA_ANIMAL_TODOS);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Animal animal1 = new Animal();
				animal1.setAnimalId(rs.getInt("Animal_ID"));
				animal1.setNomeAnimal(rs.getString("NOME"));
				animal1.setIdDono(rs.getInt("ID_DONO"));
				animal1.setIdTipoAnimal(rs.getInt("ID_TIPO_ANIMAL"));

				animais.add(animal1);
			}

			rs.close();
			stmt.close();
			con.close();


		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Busca Todos... OK");
		return animais;
		
		
	}


	@Override
	public List<Animal> buscaAnimalPorTipoAnimal(Integer idTipoAnimal) {
		// TODO Auto-generated method stub
		List<Animal> animais = new ArrayList<>();

		
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement(SQL.BUSCA_ANIMAL_POR_TIPO_ANIMAL);
			stmt.setInt(1, idTipoAnimal);			
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Animal animal1 = new Animal();
				animal1.setAnimalId(rs.getInt("Animal_ID"));
				animal1.setNomeAnimal(rs.getString("NOME"));
				animal1.setIdDono(rs.getInt("ID_DONO"));
				animal1.setIdTipoAnimal(rs.getInt("ID_TIPO_ANIMAL"));

				animais.add(animal1);
			}

			rs.close();
			stmt.close();
			con.close();


		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Busca Todos (por tipo de animal)... OK");
		return animais;
		
		
	}

	@Override
	public List<Animal> buscaAnimalPorTipoDono(Integer idPessoa) {
		// TODO Auto-generated method stub
		List<Animal> animais = new ArrayList<>();

		
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement(SQL.BUSCA_ANIMAL_POR_TIPO_ANIMAL);
			stmt.setInt(1, idPessoa);			
			
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Animal animal1 = new Animal();
				animal1.setAnimalId(rs.getInt("Animal_ID"));
				animal1.setNomeAnimal(rs.getString("NOME"));
				animal1.setIdDono(rs.getInt("ID_DONO"));
				animal1.setIdTipoAnimal(rs.getInt("ID_TIPO_ANIMAL"));

				animais.add(animal1);
			}

			rs.close();
			stmt.close();
			con.close();


		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Busca Todos (por dono)... OK");
		return animais;
		
		
	}

	}
