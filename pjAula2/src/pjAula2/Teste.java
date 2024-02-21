package pjAula2;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Cliente [] agenda = new Cliente[5];
		
		//Entrada de dados
		for(int i = 0; i < 5 ; i++) {
			Scanner digito = new Scanner(System.in);
			Cliente elemento = new Cliente();
			
			System.out.println("Informe o nome: ");
			elemento.setNome(digito.next());
			System.out.println("Informe o telefone: ");
			elemento.setTelefone(digito.nextFloat());
			System.out.println("Informe o email: ");
			elemento.setEmail(digito.next());
			
			agenda[i] = elemento;
			digito.close();
		}
		
		//Saida de dados
		for(int i = 0; i < 5 ; i++) {
			System.out.println("Nome " + agenda[i].getNome() + "Telefone " + agenda[i].getTelefone() + "Email " + agenda[i].getEmail());
		}
	}
}

