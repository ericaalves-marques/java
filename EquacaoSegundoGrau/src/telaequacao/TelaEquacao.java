package telaequacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaEquacao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEquacao frame = new TelaEquacao();
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
	public TelaEquacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblA = new JLabel("A.");
		lblA.setForeground(new Color(128, 0, 0));
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBounds(245, 78, 72, 36);
		contentPane.add(lblA);
		
		JSpinner txtA = new JSpinner();
		txtA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(txtA.getValue().toString());
				
			}
			
		
		});
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtA.setBounds(76, 34, 44, 20);
		contentPane.add(txtA);
		
		JLabel lblB = new JLabel("B");
		lblB.setForeground(new Color(128, 0, 0));
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setBounds(152, 78, 82, 36);
		contentPane.add(lblB);
		
		JSpinner txtB = new JSpinner();
		txtB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(txtB.getValue().toString());
			}
		});
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtB.setBounds(175, 34, 44, 20);
		contentPane.add(txtB);
		
		JLabel lblC = new JLabel("C");
		lblC.setForeground(new Color(128, 0, 0));
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setBounds(271, 78, 72, 36);
		contentPane.add(lblC);
		
		JSpinner txtC = new JSpinner();
		txtC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(txtC.getValue().toString());
			}
		});
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtC.setBounds(262, 34, 44, 20);
		contentPane.add(txtC);
		
		JLabel lblNewLabel = new JLabel("<html>x<sup>2</sup></html");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(127, 22, 59, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("x+");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(219, 34, 44, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("=0");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(316, 34, 44, 20);
		contentPane.add(lblNewLabel_2);
		
		
		
		JLabel lblNewLabel_6 = new JLabel("<html>&Delta;=</html>");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(114, 78, 72, 36);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("<html><sup>2</sup> - 4. </html>");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_7.setBounds(205, 72, 82, 36);
		contentPane.add(lblNewLabel_7);
		
		JPanel panResultado = new JPanel();
		panResultado.setBounds(35, 175, 371, 75);
		contentPane.add(panResultado);
		panResultado.setLayout(null);
		panResultado.setVisible(false);
		
		JLabel lblDelta = new JLabel("0");
		lblDelta.setForeground(new Color(0, 0, 255));
		lblDelta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDelta.setHorizontalAlignment(SwingConstants.CENTER);
		lblDelta.setBounds(171, 11, 190, 28);
		panResultado.add(lblDelta);
		
		JLabel lblRaiz = new JLabel("0");
		lblRaiz.setForeground(new Color(0, 0, 255));
		lblRaiz.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRaiz.setHorizontalAlignment(SwingConstants.CENTER);
		lblRaiz.setBounds(154, 36, 207, 28);
		panResultado.add(lblRaiz);
		
		JButton btnCalc = new JButton("<html>Calcular &Delta;</html>");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtA.getValue().toString());
				int b = Integer.parseInt(txtB.getValue().toString());
				int c = Integer.parseInt(txtC.getValue().toString());
				
				double d = Math.pow(b, 2) - 4 * a * c;
				lblDelta.setText(String.format("%.1f", d));
				
				if (d < 0) {
					lblRaiz.setText("N?o existem ra?zes Reais");
				}else {
					lblRaiz.setText("Existem ra?zes Reais");
				}
				
				panResultado.setVisible(true);
			}
		});
		btnCalc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCalc.setBounds(186, 133, 101, 31);
		contentPane.add(btnCalc);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("<html>Valor de &Delta;</html>");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 11, 121, 28);
		panResultado.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo de Ra\u00EDzes");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(10, 36, 134, 28);
		panResultado.add(lblNewLabel_4);
		
		
		
		
		
	}
}
