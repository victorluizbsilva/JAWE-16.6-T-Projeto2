package br.com.petshop.modelo;

public class Animal {

	private Integer animalId;
	private String nomeAnimal;
	private Integer idDono;
	private Integer idTipoAnimal;

		public Integer getAnimalId() {
			return animalId;
		}
		public void setAnimalId(Integer animalId) {
			this.animalId = animalId;
		}
		public String getNomeAnimal() {
			return nomeAnimal;
		}
		public void setNomeAnimal(String nomeAnimal) {
			this.nomeAnimal = nomeAnimal;
		}
		public Integer getIdDono() {
			return idDono;
		}
		public void setIdDono(Integer idDono) {
			this.idDono = idDono;
		}
		public Integer getIdTipoAnimal() {
			return idTipoAnimal;
		}
		public void setIdTipoAnimal(Integer idAnimal) {
			this.idTipoAnimal = idAnimal;
		}
	
}