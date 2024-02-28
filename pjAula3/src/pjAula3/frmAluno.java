package pjAula3;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frmAluno extends JFrame{
	//Passo 1 - Declarar o objeto
	JButton btCadastrar, btLimpar;
	JTextField txtNome, txtTelefone;
	JLabel lbNome, lbTelefone;
	
	public frmAluno() {
		super("Exemplo");
		setSize(300,300);
		setLayout(new FlowLayout());
		
		//Passo 2 - Instanciar o objeto
		btCadastrar = new JButton("Cadastrar");
		btLimpar = new JButton("Limpar");
		txtNome = new JTextField(20);
		txtTelefone = new JTextField(20);
		lbNome = new JLabel("Nome");
		lbTelefone = new JLabel("Telefone");
		
		//Passo 3 - Adicionar objeto a tela
		add(lbNome);
		add(txtNome);
		add(lbTelefone);
		add(txtTelefone);
		add(btCadastrar);
		add(btLimpar);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		frmAluno form = new frmAluno();
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
