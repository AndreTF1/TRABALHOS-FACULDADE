package pjAula2;

/**
 * Classe de Modelagem Conceitual Cliente
 * @author André Tomazoni Fatinatti
 * @data 20/02/2024
 */
public class Cliente {
	
	//Atributos
	private String nome;
	private float telefone;
	private String email;
	
	//Métodos
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public float getTelefone() {
		return telefone;
	}
	public void setTelefone(float telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
