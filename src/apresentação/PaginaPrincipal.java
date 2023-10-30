package apresentação;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PaginaPrincipal extends JFrame implements ActionListener {

	HashMap<String, String> infos = new HashMap<>();

	private Painel painelPrincipal = new Painel(Color.pink);

	private JButton botaoLogin = new JButton("Login");
	private JButton botaoReset = new JButton("Reset");

	private JLabel id = new JLabel("ID:");
	private JLabel senha = new JLabel("Senha:");
	private JLabel mensagem = new JLabel();

	private JTextField idTextField = new JTextField();
	private JPasswordField senhaTextField = new JPasswordField();

	public PaginaPrincipal(HashMap<String, String> infosOriginal) {

		infos = infosOriginal;

		this.setTitle("Login");
		this.setSize(420, 420);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		adds();

		this.setVisible(true);
	}

	private void adds() {

		configurarLabels();

		painelPrincipal.add(id);
		painelPrincipal.add(senha);

		idTextField.setBounds(200, 100, 100, 30);
		senhaTextField.setBounds(200, 150, 100, 30);

		painelPrincipal.add(idTextField);
		painelPrincipal.add(senhaTextField);

		configurarBotoes();

		painelPrincipal.add(botaoLogin);
		painelPrincipal.add(botaoReset);

		this.add(painelPrincipal);
	}

	private void configurarBotoes() {
		botaoLogin.setBounds(85, 200, 100, 25);
		botaoLogin.setBackground(Color.decode("#95c68f"));
		botaoLogin.setFocusable(false);
		botaoLogin.addActionListener(this);

		botaoReset.setBounds(185, 200, 100, 25);
		botaoReset.setBackground(Color.decode("#95c68f"));
		botaoReset.setFocusable(false);
		botaoReset.addActionListener(this);
	}

	private void configurarLabels() {

		id.setForeground(Color.black);
		id.setBounds(50, 100, 75, 25);
		id.setFont(new Font(null, Font.ITALIC, 16));

		senha.setForeground(Color.black);
		senha.setBounds(50, 150, 75, 25);
		senha.setFont(new Font(null, Font.ITALIC, 16));

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == botaoReset) {

			idTextField.setText("");
			senhaTextField.setText("");
		}
		if (e.getSource() == botaoLogin) {

			String nome = idTextField.getText();
			String senha = String.valueOf(senhaTextField.getPassword());

			if (infos.containsKey(nome)) {

				if (infos.get(nome).equals(senha)) {

					mensagem.setForeground(Color.green);
					mensagem.setText("Logado!");
					mensagem.setFont(new Font(null, Font.ITALIC, 26));
					mensagem.setBounds(105, 225, 110, 25);
					this.dispose();
					new BemVindo(nome);

				} else {

					mensagem.setForeground(Color.red);
					mensagem.setText("Senha errada!");
					mensagem.setFont(new Font(null, Font.ITALIC, 26));
					mensagem.setBounds(105, 225, 1100, 25);
					painelPrincipal.add(mensagem);

				}

			} else {

				mensagem.setForeground(Color.red);
				mensagem.setText("Id errado!");
				mensagem.setFont(new Font(null, Font.ITALIC, 26));
				mensagem.setBounds(105, 225, 1100, 25);
				painelPrincipal.add(mensagem);

			}

		}

	}

}
