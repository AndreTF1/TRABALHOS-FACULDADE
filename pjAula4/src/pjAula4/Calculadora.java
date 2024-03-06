package pjAula4;

/*
 * Exemplo de sobrecarga de métodos
 * André Tomazoni Fatinatti
 * @data 05/03/24
 */

public class Calculadora {
	
	//Métodos
	public long soma(long v1, long v2) {
		return v1 + v2;
	}
	
	public long soma(int a, int b) {
		return a + (a*b);
	}
	
	public long soma(String a, String b) {
		return Long.parseLong(a) + Long.parseLong(b);
	}
	
	public long soma(int a, int b, int c) {
		return a + b + c;
	}
	
	public long soma(String a, int b) {
		return Long.parseLong(a) + b;
	}
	
	public long soma(int a, String b) {
		return a + Long.parseLong(b);
	}
	
	public long soma(Integer ... valores) {
		long resultado = 0;
		for(Integer i : valores) { //for(i = 0; i < valores.length; i++)
			resultado = resultado + i;
		}
		return resultado;
	}
	
	public long soma(String ... valores) {
		long resultado = 0;
		for(String i : valores) { //for(i = 0; i < valores.length; i++)
			resultado += Long.parseLong(i);
		}
		return resultado;
	}
}
