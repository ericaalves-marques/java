package operadoresswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaValores extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum;
	private JTextField txtDen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaValores frame = new TelaValores();
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
	public TelaValores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 252, 118);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Numerador");
		contentPane.add(lblNewLabel);
		
		txtNum = new JTextField();
		contentPane.add(txtNum);
		txtNum.setColumns(4);
		
		JLabel lblNewLabel_1 = new JLabel("Denominador");
		contentPane.add(lblNewLabel_1);
		
		txtDen = new JTextField();
		contentPane.add(txtDen);
		txtDen.setColumns(4);
		
		
		JLabel lblNewLabel_2 = new JLabel("Divis\u00E3o");
		contentPane.add(lblNewLabel_2);
		
		JLabel lblDiv = new JLabel("0");
		contentPane.add(lblDiv);
		
		
		JLabel lblNewLabel_4 = new JLabel("Raiz");
		contentPane.add(lblNewLabel_4);
		
		JLabel lblRes = new JLabel("0");
		contentPane.add(lblRes);
		
		JButton btnDividir = new JButton("Calcular");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(txtNum.getText());
				int d = Integer.parseInt(txtDen.getText());
				float div = n / d;
				float res = (float) Math.sqrt(n);
				lblDiv.setText(Float.toString(div));
				lblRes.setText(Float.toString(res));
			}
		});
		contentPane.add(btnDividir);
		
	}

}
