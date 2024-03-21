package atividadeAvaliativa;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class frmCadastroVeiculos extends JFrame implements ActionListener {
	
	JButton btCadastrar, btLimpar, btAlterar, btExcluir,btPesquisar,btSair;
	JTextField txtPlaca, txtModelo, txtAnoFabricacao, txtValor, txtDataCompra;
	JLabel lbPlaca, lbFabricante, lbModelo, lbAnoFabricacao, lbValor, lbDataCompra;
	JComboBox selectFabricante;
	JPanel pnCampos, pnBotoes, pnGrid;
	
	int indexdovetor = 0;
	Veiculo[] vetores = new Veiculo[10];
	

	public frmCadastroVeiculos() {
		super("Controle de veiculos -  Cadastro de Frota");
		setSize(520, 220);
		setLayout(new BorderLayout());

		btCadastrar = new JButton("Cadastrar");
		btAlterar = new JButton("Alterar");
		btExcluir = new JButton("Excluir");
		btPesquisar = new JButton("Pesquisar");
		btLimpar = new JButton("Limpar");
		btSair = new JButton("Sair");

		String marca[] = { null, "Hyundai", "Ford", "Honda", "Chevrolet", "Renault", 
				"Peugeot", "Volksvagen", "Fiat", "Mercedes", "BMW", "Ferrari", "Audi"};

		txtPlaca = new JTextField(10);
		txtModelo = new JTextField(10);
		selectFabricante = new JComboBox(marca);
		txtAnoFabricacao = new JTextField(10);
		txtValor = new JTextField(10);
		txtDataCompra = new JTextField(10);

		lbPlaca = new JLabel("  Placa:");
		lbFabricante = new JLabel("  Fabricante:");
		lbModelo = new JLabel("  Modelo:");
		lbAnoFabricacao = new JLabel("  Ano de Fabricação:");
		lbDataCompra = new JLabel("  Data da Compra:");
		lbValor = new JLabel("  Valor:");
		
		pnCampos = new JPanel(new GridLayout(3,3));
		pnBotoes = new JPanel(new FlowLayout());
		
		pnCampos.add(lbPlaca);
		pnCampos.add(txtPlaca);
		pnCampos.add(lbFabricante);
		pnCampos.add(selectFabricante);
		pnCampos.add(lbModelo);
		pnCampos.add(txtModelo);
		pnCampos.add(lbAnoFabricacao);
		pnCampos.add(txtAnoFabricacao);
		pnCampos.add(lbDataCompra);
		pnCampos.add(txtDataCompra);
		pnCampos.add(lbValor);
		pnCampos.add(txtValor);
		
		
		pnBotoes.add(btCadastrar);
		pnBotoes.add(btAlterar);
		pnBotoes.add(btExcluir);
		pnBotoes.add(btPesquisar);
		pnBotoes.add(btLimpar);
		pnBotoes.add(btSair);
		
		btCadastrar.addActionListener(this);
	    btAlterar.addActionListener(this);
	    btExcluir.addActionListener(this);
	    btPesquisar.addActionListener(this);
	    btLimpar.addActionListener(this);
	    btSair.addActionListener(this);

		add(pnCampos, BorderLayout.NORTH);
		add(pnBotoes, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	

	public static void main(String[] args) {
		frmCadastroVeiculos form = new frmCadastroVeiculos();
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent ev) {
	Object evento = ev.getSource();
	if(evento == btSair) {
	System.exit(1);
	}
	
	if(evento == btCadastrar) {
		cadastrar();
	}

	if(evento == btLimpar) {
		limpar();
	}
	
	if (evento == btPesquisar) {
	    String placaPesquisar = txtPlaca.getText();
	    StringBuilder resultado = new StringBuilder();
	    for (Veiculo veiculo : vetores) {
	        if (veiculo != null && veiculo.getPlaca().equals(placaPesquisar)) {
	            resultado.append("Placa: ").append(veiculo.getPlaca()).append("\n");
	            resultado.append("Modelo: ").append(veiculo.getModelo()).append("\n");
	            resultado.append("Fabricante: ").append(veiculo.getFabricante()).append("\n");
	            resultado.append("Ano de Fabricação: ").append(veiculo.getAnoFabricacao()).append("\n");
	            resultado.append("Valor: ").append(veiculo.getValor()).append("\n");
	            resultado.append("Data de Compra: ").append(veiculo.getDataCompra()).append("\n\n");
	        }
	    }
	    AbstractButton txtAreaResultado = null;
		if (resultado.length() > 0) {
	        txtAreaResultado.setText(resultado.toString());
	    } else {
	        txtAreaResultado.setText("Veículo não encontrado.");
	    }
	}
	}

	public void cadastrar() {
		vetores[indexdovetor] = new Veiculo(txtPlaca.getText(), txtModelo.getText(), 
				Integer.parseInt(txtAnoFabricacao.getText()), Double.parseDouble(txtValor.getText()), String.valueOf(selectFabricante.getSelectedItem()),
				String.valueOf(txtDataCompra.getText()));
		limpar();
		indexdovetor++;
	}
	public void limpar() {
		txtPlaca.setText(null);
		txtModelo.setText(null);
		txtAnoFabricacao.setText(null);
		txtValor.setText(null);
		selectFabricante.setSelectedIndex(0);
		txtDataCompra.setText(null);
	}
}