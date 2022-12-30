package cursoemvideo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class CalcularIdade extends JFrame {

	private JPanel contentPane;
	private JTextField txtAT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcularIdade frame = new CalcularIdade();
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
	public CalcularIdade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Ano Atual:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);
		
		txtAT = new JTextField();
		contentPane.add(txtAT);
		txtAT.setColumns(10);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Ano de Nascimento:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1);
		
		JSpinner txtAN = new JSpinner();
		contentPane.add(txtAN);
		
		JButton btnIdade = new JButton("Calcular Idade");
		btnIdade.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\calculator.png"));
		contentPane.add(btnIdade);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\user.png"));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("No final desse ano, voc\u00EA ter\u00E1:");
		contentPane.add(lblNewLabel_3);
		
		JLabel lblIdade = new JLabel("0");
		lblIdade.setForeground(new Color(255, 0, 0));
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblIdade);
	}

}
