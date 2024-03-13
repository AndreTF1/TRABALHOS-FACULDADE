package pjAula5;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Exemplo de Gerenciador de Layout
 * @author André Tomazoni Fatinatti
 * @data 12/03/24 
 */
public class FrmCadastro extends JFrame implements ActionListener {
	// 1 Passo: Declaração
	JButton btnCadastrar, btnLimpar;
	JTextField txtNome, txtSenha;
	JLabel lbNome, lbSenha;
	JPanel pnCampos, pnBotoes, pnGrid;
	JButton vetBotoes[];
			
	public FrmCadastro() {
		super("Login");
		setSize(240, 240);
		setLayout(new BorderLayout());
		
		//2 Passo: Construção
		lbNome = new JLabel("Nome");
		lbSenha = new JLabel("Senha");
		txtNome = new JTextField(15);
		txtSenha = new JTextField(15);
		btnCadastrar = new JButton("Cadastrar");
		btnLimpar = new JButton("Limpar");
		pnCampos = new JPanel(new FlowLayout());
		pnBotoes = new JPanel(new FlowLayout());
		pnGrid = new JPanel(new GridLayout(4, 4));
		
		vetBotoes = new JButton[16];
		
		for(int i = 0; i <= 9; i++) {
			JButton botao = new JButton(String.valueOf(i));
			vetBotoes[i] = botao;
		
	}
		
		//3 Passo: Adicionar os elementos
		pnCampos.add(lbNome);
		pnCampos.add(txtNome);
		pnCampos.add(lbSenha);
		pnCampos.add(txtSenha);
		
		pnBotoes.add(btnCadastrar);
		pnBotoes.add(btnLimpar);
		
		for(int i = 0; i <= 9; i++) {
			pnGrid.add(vetBotoes[i]);
			vetBotoes[i].addActionListener(this);
		}
		
		add(pnCampos, new BorderLayout().NORTH);
		add(pnGrid, new BorderLayout().CENTER);
		add(pnBotoes, new BorderLayout().SOUTH);
		
		setVisible(true);
	}
	

	public static void main(String[] args) {
		FrmCadastro frm = new FrmCadastro();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
    public void actionPerformed(ActionEvent e) {
		if(e.getSource() == vetBotoes[0]) {
			txtNome.setText("Digitado 0");
		}
}
}
			
