package cursoemvideo.voto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TelaVoto extends JFrame {

	private JPanel contentPane;
	private JTextField txtAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVoto frame = new TelaVoto();
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
	public TelaVoto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 282, 215);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento:");
		lblNewLabel.setBounds(34, 27, 134, 14);
		contentPane.add(lblNewLabel);
		
		txtAno = new JTextField();
		txtAno.setBounds(159, 24, 55, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		JLabel lblR = new JLabel("Resultado");
		lblR.setHorizontalAlignment(SwingConstants.CENTER);
		lblR.setBounds(54, 115, 140, 14);
		contentPane.add(lblR);
		JButton btnVoto = new JButton("Posso Votar?");
		btnVoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtAno.getText());
				int i = 2022 - a;
				if (i < 16) {
					lblR.setText("Não vota!");
				}else {
					if ((i >= 16 &&  i < 18) || (i > 70)){
						lblR.setText("Voto opcional!");
						
					}else {
						lblR.setText("Voto obrigatório!");
					}
				}
			}
		});
		btnVoto.setBounds(65, 67, 119, 23);
		contentPane.add(btnVoto);
		
		
	}
}
