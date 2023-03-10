package pacoteidade;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TelaIade extends JFrame {

	private JPanel contentPane;
	private JTextField txtAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIade frame = new TelaIade();
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
	public TelaIade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 293, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento");
		lblNewLabel.setBounds(10, 26, 125, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setBounds(10, 138, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Situa\u00E7\u00E3o");
		lblNewLabel_2.setBounds(10, 163, 62, 14);
		contentPane.add(lblNewLabel_2);
		
		txtAno = new JTextField();
		txtAno.setHorizontalAlignment(SwingConstants.CENTER);
		txtAno.setBounds(145, 23, 86, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
		Label lblIdade = new Label("0");
		lblIdade.setAlignment(Label.CENTER);
		lblIdade.setBounds(144, 130, 32, 22);
		contentPane.add(lblIdade);
		
		Label lblSituacao = new Label("");
		lblSituacao.setBounds(114, 155, 153, 22);
		contentPane.add(lblSituacao);
		
		Button btnCalc = new Button("Calcular Idade");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ano = Integer.parseInt(txtAno.getText());
				int idade = 2022 - ano;
				lblIdade.setText(Integer.toString(idade));
				String sit = ((idade>=16 && idade<18) || (idade>70))?"Voto Opcional":"Voto Obrigat?rio";
				lblSituacao.setText(sit);
			}
		});
		btnCalc.setBounds(94, 74, 98, 22);
		contentPane.add(btnCalc);
		
		
		
		
	}
}
