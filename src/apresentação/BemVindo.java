package apresentação;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BemVindo extends JFrame{
	
	
	JLabel mensagem = new JLabel();
	
	
	public BemVindo(String nome) {
		
		this.setSize(420,420);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		
		mensagem.setText("Seja muito bem-vindo(a), " + nome + "!");
		mensagem.setBounds(0,0,200,15);
		mensagem.setFont(new Font(null, Font.PLAIN, 15));
		
		this.add(mensagem);
		
		
		
		this.setVisible(true);
	}

}
