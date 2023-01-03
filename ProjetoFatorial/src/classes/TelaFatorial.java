package classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("! =");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblNewLabel.setBounds(128, 206, 87, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblFat = new JLabel("1");
		lblFat.setForeground(new Color(255, 0, 0));
		lblFat.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblFat.setBounds(179, 206, 245, 44);
		contentPane.add(lblFat);
		
		JSpinner txtN = new JSpinner();
		txtN.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int n = Integer.parseInt(txtN.getValue().toString());
				int f = 1;
				int c = n;
				while (c>=1) {
					f *= c;
					c--;
				}
				lblFat.setText(Integer.toString(f));
			}
		});
		txtN.setFont(new Font("Tahoma", Font.PLAIN, 36));
		txtN.setModel(new SpinnerNumberModel(0, 0, 5, 1));
		txtN.setBounds(56, 206, 62, 44);
		contentPane.add(txtN);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\java\\ProjetoFatorial\\bin\\imagens\\fatorar.png"));
		lblNewLabel_2.setBounds(80, 11, 325, 184);
		contentPane.add(lblNewLabel_2);
	}
}
