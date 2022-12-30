package cursoemvideo.olamundo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OlaMundoJava {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlaMundoJava window = new OlaMundoJava();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OlaMundoJava() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 333, 231);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblMensagem = new JLabel("Aqui vai aparecer a mensagem");
		lblMensagem.setForeground(new Color(255, 0, 0));
		lblMensagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblMensagem, BorderLayout.NORTH);
		
		JButton btnClick = new JButton("Clique em mim!");
		btnClick.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				lblMensagem.setText("Olá, Mundo!");
			}
		});
		btnClick.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(btnClick, BorderLayout.CENTER);
	}

}
