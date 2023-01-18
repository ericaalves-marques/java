package classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaFatorial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFatorial frame = new TelaFatorial();
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
	public TelaFatorial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 151);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner txtNum = new JSpinner();
		txtNum.setBounds(10, 24, 48, 20);
		contentPane.add(txtNum);
		
		JLabel lblFormula = new JLabel("F\u00F3rmula");
		lblFormula.setBounds(12, 65, 122, 14);
		contentPane.add(lblFormula);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(144, 65, 61, 14);
		contentPane.add(lblResultado);
		
		JButton btnNewButton = new JButton("!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(txtNum.getValue().toString());
				Fatorial f = new Fatorial();
				f.setValor(n);
				lblFormula.setText(f.getFormula());
				lblResultado.setText(Integer.toString(f.getFatorial()));
			}
		});
		btnNewButton.setBounds(73, 23, 37, 23);
		contentPane.add(btnNewButton);
		
	}
}
