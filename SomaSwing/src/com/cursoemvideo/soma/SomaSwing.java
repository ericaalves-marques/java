package com.cursoemvideo.soma;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SomaSwing extends JFrame {

	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;
	private JLabel lblSoma;
	private JLabel lblNewLabel_1;
	private JButton btnSoma;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SomaSwing frame = new SomaSwing();
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
	public SomaSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 111);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		lblNewLabel_1 = new JLabel("");
		contentPane.add(lblNewLabel_1);
		
		txtN1 = new JTextField();
		txtN1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("+");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_2);
		
		txtN2 = new JTextField();
		txtN2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(txtN2);
		txtN2.setColumns(10);
		
		btnSoma = new JButton("=");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txtN1.getText());
				int n2 = Integer.parseInt(txtN2.getText());
				int s = n1 + n2;
				lblSoma.setText(Integer.toString(s));
			}
		});
		contentPane.add(btnSoma);
		
		lblSoma = new JLabel("0");
		lblSoma.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoma.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(lblSoma);
	}

}
