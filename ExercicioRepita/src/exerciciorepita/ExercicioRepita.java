package exerciciorepita;

import javax.swing.JOptionPane;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ExercicioRepita extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		int n, s = 0;
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog
					(null, "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>"));
			s += n;
		} while (n != 0);
		JOptionPane.showMessageDialog(null, "<html>Resultdo Final  <hr>" + "<br>Somatório vale " + s + "</html>");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExercicioRepita frame = new ExercicioRepita();
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
	public ExercicioRepita() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
