package classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class TelaTriangulo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTriangulo frame = new TelaTriangulo();
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
	public TelaTriangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Segmento A");
		lblNewLabel.setBounds(10, 21, 87, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Segmento B");
		lblNewLabel_1.setBounds(10, 55, 87, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Segmento C");
		lblNewLabel_2.setBounds(10, 89, 87, 14);
		contentPane.add(lblNewLabel_2);
		JLabel lblA = new JLabel("0");
		lblA.setForeground(new Color(128, 128, 128));
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		lblA.setBounds(231, 9, 46, 26);
		contentPane.add(lblA);
		
		JSlider sliA = new JSlider();
		sliA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(Integer.toString(sliA.getValue()));
			}
		});
		sliA.setValue(0);
		sliA.setMaximum(20);
		sliA.setBounds(107, 9, 101, 26);
		contentPane.add(sliA);
		JLabel lblB = new JLabel("0");
		lblB.setForeground(new Color(128, 128, 128));
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		lblB.setBounds(231, 46, 46, 23);
		contentPane.add(lblB);
		JSlider sliB = new JSlider();
		sliB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(Integer.toString(sliB.getValue()));
			}
		});
		sliB.setValue(0);
		sliB.setMaximum(20);
		sliB.setBounds(107, 46, 101, 26);
		contentPane.add(sliB);
		JLabel lblC = new JLabel("0");
		lblC.setForeground(new Color(128, 128, 128));
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		lblC.setBounds(231, 83, 46, 20);
		contentPane.add(lblC);
		
		JSlider sliC = new JSlider();
		sliC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(Integer.toString(sliC.getValue()));
			}
		});
		sliC.setValue(0);
		sliC.setMaximum(20);
		sliC.setBounds(107, 83, 101, 26);
		contentPane.add(sliC);
		
		
		
		
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\java\\ProojetoTriangulo\\bin\\imagens\\Trigono1.png"));
		lblNewLabel_6.setBounds(264, -8, 160, 175);
		contentPane.add(lblNewLabel_6);
		
		JPanel panRes = new JPanel();
		panRes.setBounds(10, 165, 400, 85);
		contentPane.add(panRes);
		panRes.setLayout(null);
		
		JLabel lblStatus = new JLabel("Forma ou n\u00E3o?");
		lblStatus.setForeground(new Color(132, 132, 255));
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setBounds(10, 11, 380, 27);
		panRes.add(lblStatus);
		
		JLabel lblTipo = new JLabel("Tipo de Tri\u00E2ngulo");
		lblTipo.setForeground(new Color(255, 157, 157));
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setBounds(10, 49, 380, 25);
		panRes.add(lblTipo);
		
		panRes.setVisible(false);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = sliA.getValue();
				int b = sliB.getValue();
				int c = sliC.getValue();
				if(a < b + c && b< a+c && c < a+b) {
					lblStatus.setText("Formam um triângulo!");
					if (a==b && b==c) {
						lblTipo.setText("Equilátero");
					}else if (a!=b && b!=c && a!=c) {
						lblTipo.setText("Escaleno");
						
					}else {
						lblTipo.setText("Isósceles");
					}
				}else {
					lblStatus.setText("Não formam um triângulo!"); 
					lblTipo.setText("--------");
				}
				
				panRes.setVisible(true);
				
			}
		});
		btnVerificar.setBounds(57, 114, 89, 23);
		contentPane.add(btnVerificar);
		
	}
}
