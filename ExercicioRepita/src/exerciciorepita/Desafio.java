package exerciciorepita;

import javax.swing.JOptionPane;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Desafio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		int n, s = 0;
		do {
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> Informe um valor: <br>(0 Interrompe)", "Entrada de Dados" + "</html>", JOptionPane.ERROR_MESSAGE));
		s =+ n;
		}while (n != 0);
		JOptionPane.showMessageDialog(null, "<html>Resultdo Final  <hr>", "Resultado" + "<br>Somatório vale " + s + "</html>", JOptionPane.ERROR_MESSAGE);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desafio frame = new Desafio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Desafio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
