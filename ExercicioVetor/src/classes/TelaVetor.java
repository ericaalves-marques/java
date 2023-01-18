package classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaVetor extends JFrame {
	int vetor[] = new int[5];
	DefaultListModel lista = new DefaultListModel();
	int selecionado = 0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVetor frame = new TelaVetor();
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
	public TelaVetor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner txtNum = new JSpinner();
		txtNum.setBounds(10, 11, 54, 20);
		contentPane.add(txtNum);
		
		JButton btnAdd = new JButton("Adicionar");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vetor[selecionado] = Integer.parseInt(txtNum.getValue().toString());
				for(int c = 0; c<vetor.length; c++) {
					lista.removeAllElements();
					lista.addElement(vetor[c]);
				}
			}
		});
		btnAdd.setBounds(87, 11, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnRemove = new JButton("Remover");
		btnRemove.setBounds(87, 51, 89, 23);
		contentPane.add(btnRemove);
		
		JButton btnOrdem = new JButton("Ordenar");
		btnOrdem.setBounds(87, 85, 89, 23);
		contentPane.add(btnOrdem);
		
		JLabel lblNewLabel = new JLabel("vetor");
		lblNewLabel.setBounds(231, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSelecionado = new JLabel("[0]");
		lblSelecionado.setBounds(263, 11, 27, 14);
		contentPane.add(lblSelecionado);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(200, 33, 90, 135);
		contentPane.add(scrollPane);
		
		JList<?> lstVetor = new JList(lista);
		lstVetor.setModel(new AbstractListModel() {
			
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(lstVetor);
	}
}
