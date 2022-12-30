package classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaGenio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGenio frame = new TelaGenio();
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
	public TelaGenio() { //Connstrutor
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\java\\LeitorDePensamento\\bin\\imagens\\akinator1.png"));
		lblNewLabel_1.setBounds(263, 11, 192, 307);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblFrase = new JLabel("frase");
		lblFrase.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFrase.setVerticalAlignment(SwingConstants.TOP);
		lblFrase.setHorizontalAlignment(SwingConstants.LEFT);
		lblFrase.setBounds(126, 32, 113, 68);
		contentPane.add(lblFrase);
		
		JLabel lblNewLabel_3 = new JLabel("Valor");
		lblNewLabel_3.setBounds(24, 207, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JSpinner txtVal = new JSpinner();
		txtVal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtVal.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		txtVal.setBounds(80, 204, 53, 20);
		contentPane.add(txtVal);
		
		JButton btnPalpite = new JButton("Palpite");
		btnPalpite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n = 1 + Math.random() * (6-1);
				int valor = (int) n;

				int num = Integer.parseInt(txtVal.getValue().toString());
				String f1 = "<html>Acertou!</html";
				String f2 = "<html>Errou ! Eu pensei no valor " + valor + " </html>";
				
				String res = (valor==num)? f1:f2;
				lblFrase.setText(res);
			}
		});
		btnPalpite.setFont(new Font("Sitka Subheading", Font.PLAIN, 14));
		btnPalpite.setBounds(104, 244, 89, 27);
		contentPane.add(btnPalpite);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\java\\LeitorDePensamento\\bin\\imagens\\fala3.png"));
		lblNewLabel.setBounds(104, -14, 229, 177);
		contentPane.add(lblNewLabel);
		
		lblFrase.setText("<html>Vou pensar em um valor entre <Strong>1</Strong> e <Strong>5</Strong>. Tente adivinhar</html>");
	}
}
