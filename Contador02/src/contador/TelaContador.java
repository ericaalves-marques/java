package contador;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaContador extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContador frame = new TelaContador();
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
	public TelaContador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 168);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contagem");
		lblNewLabel.setBounds(25, 36, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblContagem = new JLabel("");
		lblContagem.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		lblContagem.setBounds(94, 22, 330, 42);
		contentPane.add(lblContagem);
		
		JButton btnContar = new JButton("Contar");
		btnContar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cc = 1;
				String contagem = "";
				while (cc<=10) {
					contagem += cc + " ";
					cc++;
				}
				lblContagem.setText(contagem);
			}
		});
		btnContar.setBounds(168, 75, 89, 23);
		contentPane.add(btnContar);
	}
}
