package pessoaFisica;
/**
 * @autor Heitor Moreira
 * @data 06/02/2024
 * Classe de Modelagem conceitual de Produto
 */
public class Produto {
	
	//Atributos
	int codigo;
	String descricao;
	float quantidade;
	
	//M�todo
	public void incluir(int id, String nome, float valor) {
		codigo = id;//atividade de inclus�o
		descricao = nome;//atividade de inclus�o
		quantidade = valor;//atividade de inclus�o
	}
	
	
	public void excluir() {
		//.....
	}
	
	public static void main(String[] args) {
		System.out.println("Ol� mundo");
	}
}
