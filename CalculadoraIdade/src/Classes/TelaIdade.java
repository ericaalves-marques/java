package Classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaIdade extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIdade frame = new TelaIdade();
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
	public TelaIdade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 397, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JSpinner txtAN = new JSpinner();
		contentPane.add(txtAN);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		contentPane.add(lblNewLabel_1);
		
		JLabel lblIdade = new JLabel("0");
		lblIdade.setForeground(new Color(255, 0, 0));
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblIdade);
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int an = Integer.parseInt(txtAN.getValue().toString());
				int id = 2022 - an;	
				lblIdade.setText(Integer.toString(id));
			}
		});
		btnCalc.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\calculator.png"));
		contentPane.add(btnCalc);
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\user.png"));
		contentPane.add(label);
	}

}
