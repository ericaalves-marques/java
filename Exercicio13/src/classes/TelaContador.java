package classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;

public class TelaContador extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaContador frame = new TelaContador();
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
	public TelaContador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("In\u00EDcio");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fim");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Passo");
		lblNewLabel_2.setBounds(10, 63, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblInicio = new JLabel("0");
		lblInicio.setBounds(280, 11, 46, 14);
		contentPane.add(lblInicio);
		
		JSlider sliInicio = new JSlider();
		sliInicio.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int i = sliInicio.getValue();
				lblInicio.setText(Integer.toString(i));
			}
		});
		sliInicio.setValue(0);
		sliInicio.setMaximum(5);
		sliInicio.setBounds(60, -1, 200, 26);
		contentPane.add(sliInicio);
		
		JLabel lblFim = new JLabel("6");
		lblFim.setBounds(280, 36, 46, 14);
		contentPane.add(lblFim);
		
		JSlider sliFim = new JSlider();
		sliFim.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int f = sliFim.getValue();
				lblFim.setText(Integer.toString(f));
			}
		});
		sliFim.setMinimum(6);
		sliFim.setValue(6);
		sliFim.setMaximum(20);
		sliFim.setBounds(60, 24, 200, 26);
		contentPane.add(sliFim);
		
		JLabel lblPasso = new JLabel("1");
		lblPasso.setBounds(280, 63, 46, 14);
		contentPane.add(lblPasso);
		
		JSlider sliPasso = new JSlider();
		sliPasso.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) { 
				int p = sliPasso.getValue();
				lblPasso.setText(Integer.toString(p));
			}
		});
		sliPasso.setValue(1);
		sliPasso.setMaximum(4);
		sliPasso.setMinimum(1);
		sliPasso.setBounds(60, 51, 200, 26);
		contentPane.add(sliPasso);
		
		JList lstCont = new JList();
		lstCont.setValueIsAdjusting(true);
		lstCont.setLayoutOrientation(JList.VERTICAL_WRAP);
		lstCont.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lstCont.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		lstCont.setVisibleRowCount(20);
		lstCont.setToolTipText("");
		lstCont.setBounds(325, 75, 99, 175);
		contentPane.add(lstCont); 
		JButton btnCont = new JButton("Contar");
		btnCont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = sliInicio.getValue();
				int f = sliFim.getValue();
				int p = sliPasso.getValue();
				
				DefaultListModel lista = new DefaultListModel();
				for(int c = i; c<=f; c += p) {
					lista.addElement(c);
				}
				lstCont.setModel(lista);
			}
		});
		btnCont.setBounds(119, 101, 89, 23);
		contentPane.add(btnCont);
		
	}
}
