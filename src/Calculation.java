import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class Calculation extends JFrame {
	
	double firstnum;
	double secondnum;
	double result;
	String operations;

	private JPanel contentPane;
	private JTextField JtxtDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculation frame = new Calculation();
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
	public Calculation() {
		setTitle("Calculator");
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 249, 266);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JtxtDisplay = new JTextField();
		JtxtDisplay.setForeground(new Color(128, 0, 128));
		JtxtDisplay.setBackground(new Color(255, 182, 193));
		JtxtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		JtxtDisplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		JtxtDisplay.setBounds(10, 11, 215, 25);
		contentPane.add(JtxtDisplay);
		JtxtDisplay.setColumns(10);
		
		JButton JBtn1 = new JButton("1");
		JBtn1.setForeground(new Color(0, 206, 209));
		JBtn1.setBackground(new Color(25, 25, 112));
		JBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = JtxtDisplay.getText() + JBtn1.getText();
				JtxtDisplay.setText(EnterNumber);
			}
		});
		JBtn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		JBtn1.setBounds(10, 47, 43, 39);
		contentPane.add(JBtn1);
		
		JButton JBtn2 = new JButton("2");
		JBtn2.setForeground(new Color(0, 206, 209));
		JBtn2.setBackground(new Color(25, 25, 112));
		JBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = JtxtDisplay.getText() + JBtn2.getText();
				JtxtDisplay.setText(EnterNumber);
			}
		});
		JBtn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		JBtn2.setBounds(54, 47, 43, 39);
		contentPane.add(JBtn2);
		
		JButton JBtn3 = new JButton("3");
		JBtn3.setForeground(new Color(0, 206, 209));
		JBtn3.setBackground(new Color(25, 25, 112));
		JBtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = JtxtDisplay.getText() + JBtn3.getText();
				JtxtDisplay.setText(EnterNumber);
			}
		});
		JBtn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		JBtn3.setBounds(97, 47, 43, 39);
		contentPane.add(JBtn3);
		
		JButton JBtn4 = new JButton("4");
		JBtn4.setForeground(new Color(0, 206, 209));
		JBtn4.setBackground(new Color(25, 25, 112));
		JBtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = JtxtDisplay.getText() + JBtn4.getText();
				JtxtDisplay.setText(EnterNumber);
			}
		});
		JBtn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		JBtn4.setBounds(140, 47, 43, 39);
		contentPane.add(JBtn4);
		
		JButton JBtn5 = new JButton("5");
		JBtn5.setForeground(new Color(0, 206, 209));
		JBtn5.setBackground(new Color(25, 25, 112));
		JBtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = JtxtDisplay.getText() + JBtn5.getText();
				JtxtDisplay.setText(EnterNumber);
			}
		});
		JBtn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		JBtn5.setBounds(183, 47, 43, 39);
		contentPane.add(JBtn5);
		
		JButton JBtn6 = new JButton("6");
		JBtn6.setForeground(new Color(0, 206, 209));
		JBtn6.setBackground(new Color(25, 25, 112));
		JBtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = JtxtDisplay.getText() + JBtn6.getText();
				JtxtDisplay.setText(EnterNumber);
			}
		});
		JBtn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		JBtn6.setBounds(10, 86, 43, 39);
		contentPane.add(JBtn6);
		
		JButton JBtn7 = new JButton("7");
		JBtn7.setForeground(new Color(0, 206, 209));
		JBtn7.setBackground(new Color(25, 25, 112));
		JBtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = JtxtDisplay.getText() + JBtn7.getText();
				JtxtDisplay.setText(EnterNumber);
			}
		});
		JBtn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		JBtn7.setBounds(54, 86, 43, 39);
		contentPane.add(JBtn7);
		
		JButton JBtn8 = new JButton("8");
		JBtn8.setForeground(new Color(0, 206, 209));
		JBtn8.setBackground(new Color(25, 25, 112));
		JBtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = JtxtDisplay.getText() + JBtn8.getText();
				JtxtDisplay.setText(EnterNumber);
			}
		});
		JBtn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		JBtn8.setBounds(97, 86, 43, 39);
		contentPane.add(JBtn8);
		
		JButton Jbtn9 = new JButton("9");
		Jbtn9.setForeground(new Color(0, 206, 209));
		Jbtn9.setBackground(new Color(25, 25, 112));
		Jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = JtxtDisplay.getText() + Jbtn9.getText();
				JtxtDisplay.setText(EnterNumber);
			}
		});
		Jbtn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		Jbtn9.setBounds(140, 86, 43, 39);
		contentPane.add(Jbtn9);
		
		JButton JBtn0 = new JButton("0");
		JBtn0.setForeground(new Color(0, 206, 209));
		JBtn0.setBackground(new Color(25, 25, 112));
		JBtn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = JtxtDisplay.getText() + JBtn0.getText();
				JtxtDisplay.setText(EnterNumber);
			}
		});
		JBtn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		JBtn0.setBounds(183, 86, 43, 39);
		contentPane.add(JBtn0);
		
		JButton JBtn10 = new JButton("+");
		JBtn10.setForeground(new Color(0, 0, 0));
		JBtn10.setBackground(new Color(255, 20, 147));
		JBtn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(JtxtDisplay.getText());
				JtxtDisplay.setText("");
				operations = "+";
			}
		});
		JBtn10.setFont(new Font("Tahoma", Font.BOLD, 10));
		JBtn10.setBounds(10, 136, 43, 39);
		contentPane.add(JBtn10);
		
		JButton JBtn11 = new JButton("-");
		JBtn11.setBackground(new Color(255, 20, 147));
		JBtn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(JtxtDisplay.getText());
				JtxtDisplay.setText("");
				operations = "-";
			}
		});
		JBtn11.setFont(new Font("Tahoma", Font.BOLD, 17));
		JBtn11.setBounds(54, 136, 43, 39);
		contentPane.add(JBtn11);
		
		JButton JBtn12 = new JButton("/");
		JBtn12.setBackground(new Color(255, 20, 147));
		JBtn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(JtxtDisplay.getText());
				JtxtDisplay.setText("");
				operations = "/";
			}
		});
		JBtn12.setFont(new Font("Tahoma", Font.BOLD, 10));
		JBtn12.setBounds(97, 136, 43, 39);
		contentPane.add(JBtn12);
		
		JButton JBtn13 = new JButton("*");
		JBtn13.setBackground(new Color(255, 20, 147));
		JBtn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(JtxtDisplay.getText());
				JtxtDisplay.setText("");
				operations = "*";
			}
		});
		JBtn13.setFont(new Font("Tahoma", Font.BOLD, 14));
		JBtn13.setBounds(140, 136, 43, 39);
		contentPane.add(JBtn13);
		
		JButton JBtn14 = new JButton("%");
		JBtn14.setBackground(new Color(255, 20, 147));
		JBtn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(JtxtDisplay.getText());
				JtxtDisplay.setText("");
				operations = "%";
			}
		});
		JBtn14.setFont(new Font("Tahoma", Font.BOLD, 7));
		JBtn14.setBounds(183, 136, 43, 39);
		contentPane.add(JBtn14);
		
		JButton JBtn15 = new JButton(".");
		JBtn15.setBackground(new Color(255, 20, 147));
		JBtn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = JtxtDisplay.getText() + JBtn15.getText();
				JtxtDisplay.setText(EnterNumber);
			}
		});
		JBtn15.setFont(new Font("Tahoma", Font.BOLD, 14));
		JBtn15.setBounds(10, 177, 43, 39);
		contentPane.add(JBtn15);
		
		JButton JBtn17 = new JButton("=");
		JBtn17.setBackground(new Color(0, 0, 0));
		JBtn17.setForeground(new Color(220, 20, 60));
		JBtn17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(JtxtDisplay.getText()); 
				
				if(operations == "+"){
					result = firstnum + secondnum;
					answer = String.format("%.0f",result);
					JtxtDisplay.setText(answer);
				}
				else if(operations == "-"){
					result = firstnum - secondnum;
					answer = String.format("%.0f",result);
					JtxtDisplay.setText(answer);
				    }
				    else if(operations == "/"){
					    result = firstnum / secondnum;
					    answer = String.format("%.0f",result);
					    JtxtDisplay.setText(answer);
				        }
				        else if(operations == "*"){
					        result = firstnum * secondnum;
					        answer = String.format("%.0f",result);
					        JtxtDisplay.setText(answer);
				            }
				            else if(operations == "%"){
				            	result = firstnum % secondnum;
					            answer = String.format("%.0f",result);
					            JtxtDisplay.setText(answer);
				                }
			}
		});
		JBtn17.setFont(new Font("Tahoma", Font.BOLD, 18));
		JBtn17.setBounds(118, 176, 110, 39);
		contentPane.add(JBtn17);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(new Color(255, 20, 147));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JtxtDisplay.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnC.setBounds(54, 177, 62, 39);
		contentPane.add(btnC);
	}
}
