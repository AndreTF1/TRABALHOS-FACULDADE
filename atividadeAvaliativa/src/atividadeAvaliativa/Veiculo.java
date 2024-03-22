package atividadeAvaliativa;

public class Veiculo {
private String placa;
private String fabricante;
private String modelo;
private int anoFabricacao;
private float valor;
private String dataCompra;

public String getPlaca() {
	return placa;
	}

public void setPlaca(String placa) {
	this.placa = placa;
	}

public String getFabricante() {
	return fabricante;
	}

public void setFabricante(String fabricante) {
	this.fabricante = fabricante;
	}

public String getModelo() {
	return modelo;
	}

public void setModelo(String modelo) {
	this.modelo = modelo;
	}

public float getValor() {
	return valor;
	}

public void setValor(float valor) {
	this.valor = valor;
	}


public String getDataCompra() {
	return dataCompra;
	}

public void setDataCompra(String datacompra) {
	this.dataCompra = datacompra;
	}

public void setAnoFabricacao(int anoFabricacao) {
	this.anoFabricacao = anoFabricacao;
	}

public int getAnoFabricacao() {
	return anoFabricacao;
	}
public Veiculo(String placa, String modelo,
		int anoFabricacao, float valor, String fabricante, String dataCompra) {
	this.placa = placa;
	this.fabricante = fabricante;
	this.modelo = modelo;
	this.anoFabricacao = anoFabricacao;
	this.valor = valor;
	this.dataCompra = dataCompra;
	}
}
