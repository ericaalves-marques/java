package classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.SpinnerNumberModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;

public class SuperCalculadora extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuperCalculadora frame = new SuperCalculadora();
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
	public SuperCalculadora() {
		setResizable(false); // Construtor
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite um valor:");
		lblNewLabel.setBounds(10, 53, 110, 14);
		contentPane.add(lblNewLabel);
		
		JSpinner txtNum = new JSpinner();
		txtNum.setModel(new SpinnerNumberModel(1, -50, 50, 1));
		txtNum.setBounds(97, 50, 57, 20);
		contentPane.add(txtNum);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\calculadora2.png"));
		lblNewLabel_1.setBounds(266, 50, 244, 170);
		contentPane.add(lblNewLabel_1);
		JPanel panCalc = new JPanel();
		panCalc.setBounds(10, 156, 305, 160);
		contentPane.add(panCalc);
		panCalc.setLayout(null);
		panCalc.setVisible(false); 
		JLabel lblResto = new JLabel("0");
		lblResto.setHorizontalAlignment(SwingConstants.CENTER);
		lblResto.setForeground(new Color(0, 0, 205));
		lblResto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblResto.setBounds(143, 11, 152, 14);
		panCalc.add(lblResto);
		
		JLabel lblCubo = new JLabel("0");
		lblCubo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCubo.setForeground(new Color(0, 0, 205));
		lblCubo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCubo.setBounds(143, 36, 152, 14);
		panCalc.add(lblCubo);
		
		JLabel lblRaizQ = new JLabel("0");
		lblRaizQ.setHorizontalAlignment(SwingConstants.CENTER);
		lblRaizQ.setForeground(new Color(0, 0, 205));
		lblRaizQ.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRaizQ.setBounds(143, 61, 152, 14);
		panCalc.add(lblRaizQ);
		
		JLabel lblRaizC = new JLabel("0");
		lblRaizC.setHorizontalAlignment(SwingConstants.CENTER);
		lblRaizC.setForeground(new Color(0, 0, 205));
		lblRaizC.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRaizC.setBounds(143, 86, 152, 14);
		panCalc.add(lblRaizC);
		
		JLabel lblAbs = new JLabel("0");
		lblAbs.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbs.setForeground(new Color(0, 0, 205));
		lblAbs.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAbs.setBounds(143, 111, 152, 14);
		panCalc.add(lblAbs);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(txtNum.getValue().toString());
				int r = num % 2;
				lblResto.setText(Integer.toString(r));
				
				double c = Math.pow(num, 3);
				lblCubo.setText(Double.toString(c));
				
				double rq = Math.sqrt(num);
				lblRaizQ.setText(String.format("%.2f", rq));
				
				double rc = Math.cbrt(num);
				lblRaizC.setText(String.format("%.2f", rc));
				
				int abs = Math.abs(num);
				lblAbs.setText(Integer.toString(abs));
				
				panCalc.setVisible(true); 
			}
		});
		btnCalc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCalc.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\+.png"));
		btnCalc.setBounds(97, 78, 147, 59);
		contentPane.add(btnCalc);
		
	
		
		
		JLabel lblNewLabel_2 = new JLabel("Resto da divis\u00E3o por 2");
		lblNewLabel_2.setBounds(10, 11, 134, 14);
		panCalc.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Elevado  ao Cubo");
		lblNewLabel_3.setBounds(10, 36, 103, 14);
		panCalc.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Raiz Quadrada");
		lblNewLabel_4.setBounds(10, 61, 103, 14);
		panCalc.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Raiz C\u00FAbica");
		lblNewLabel_5.setBounds(10, 86, 103, 14);
		panCalc.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Valor Absoluto");
		lblNewLabel_6.setBounds(10, 111, 103, 14);
		panCalc.add(lblNewLabel_6);
		
		
		
		JLabel lblNewLabel_12 = new JLabel("Super Calculadora");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(10, 11, 490, 25);
		contentPane.add(lblNewLabel_12);
		
		
	}
}
