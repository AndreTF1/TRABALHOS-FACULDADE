package pjAula7;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe de Modelagem Conceitual de Produto
 * @author André Tomazoni Fatinatti
 * @data 26/03/24
 */

public class TesteList {
	public static void main(String[] args) {
		
		//Implementacao de um elemento List
		List<Produto> lista = new ArrayList<Produto>();
		
		lista = Robo.gerarLista();
		
		/*System.out.println(lista.size());
		
		long limite = 24_116_400_000l;
		long inicio = System.currentTimeMillis();
		long acumula = 0l;
		
		for(long i = 0; i < limite; i++) {
			acumula += i;
		}
		
		System.out.println("Tempo "+ (System.currentTimeMillis() - inicio));*/
		
		/*for(Produto p : lista) {
			System.out.println("Codigo " + p.getCodigo() + 
					" Descricao " + p.getDescricao() + 
					" Quantidade " + p.getQuantidade() +
					(p.isStatus()? " Ativo" : "Inativo"));
		}*/
		
		lista.stream().forEach(p -> System.out.println(p));	
		lista.stream()
			.filter(p -> p.getDescricao().contains("666"))
			.forEach(p -> System.out.println(p));
	}
}
