package pessoaFisica;
/**
 * @autor André Tomazoni Fatinatti
 * @data 06/02/2024
 * Classe de Modelagem conceitual de Produto
 */
public class Produto {
	
	//Atributos
	int codigo;
	String descricao;
	float quantidade;
	
	//Método
	public void incluir(int id, String nome, float valor) {
		codigo = id;//atividade de inclusão
		descricao = nome;//atividade de inclusão
		quantidade = valor;//atividade de inclusão
	}
	
	
	public void excluir() {
		//.....
	}
	
	public static void main(String[] args) {
		System.out.println("Olá mundo");
	}
}
