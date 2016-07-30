package br.com.petshop.modelo;

public class Animal {

	private Integer animal_id;
	private String nomeAnimal;
	private Integer id_dono;
	private Integer id_tipo_animal;
	
	public Integer getAnimal_id() {
		return animal_id;
	}
	public void setAnimal_id(Integer animal_id) {
		this.animal_id = animal_id;
	}
	public String getNomeAnimal() {
		return nomeAnimal;
	}
	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}
	public Integer getId_dono() {
		return id_dono;
	}
	public void setId_dono(Integer id_dono) {
		this.id_dono = id_dono;
	}
	public Integer getId_tipo_animal() {
		return id_tipo_animal;
	}
	public void setId_tipo_animal(Integer id_tipo_animal) {
		this.id_tipo_animal = id_tipo_animal;
	}
	
	
}
