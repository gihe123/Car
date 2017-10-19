import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;

public class DemoFrame2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t_afa;
	private JTextField t_Z;
	private JTextField t_r1;
	private JTextField t_L;
	private JTextField t_b;
	private JTextField t_n;
	private JTextField t_e;
	private JTextField t_a;
	private JTextField t_s;
	private JTextField t_c;
	private JTextField t_d;
	private JTextField R_Wd;
	private JTextField R_Lr;
	private JTextField R_r;
	private JTextField R_R;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoFrame2 frame = new DemoFrame2();
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
	public DemoFrame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u5404\u6307\u6807\u7684\u503C:");
		lblNewLabel.setBounds(50, 5, 125, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblafa = new JLabel("afa:");
		lblafa.setBounds(200, 15, 55, 18);
		contentPane.add(lblafa);
					
		t_afa = new JTextField("50");
		t_afa.setBounds(230, 15, 50, 22);
		contentPane.add(t_afa);
		t_afa.setColumns(10);
		
		JLabel lblZ = new JLabel("Z:");
		lblZ.setBounds(52, 48, 55, 18);
		contentPane.add(lblZ);
		
		t_Z = new JTextField("0.02");
		t_Z.setBounds(82, 46, 67, 22);
		contentPane.add(t_Z);
		t_Z.setColumns(10);
		
		JLabel lblR = new JLabel("r1:");
		lblR.setBounds(52, 80, 55, 18);
		contentPane.add(lblR);
		
		t_r1 = new JTextField("6.5");
		t_r1.setBounds(82, 80, 67, 22);
		contentPane.add(t_r1);
		t_r1.setColumns(10);
		
		JLabel lblL = new JLabel("L:");
		lblL.setBounds(52, 114, 55, 18);
		contentPane.add(lblL);
		
		t_L = new JTextField("3.43");
		t_L.setColumns(10);
		t_L.setBounds(82, 114, 67, 22);
		contentPane.add(t_L);
		
		JLabel lblB = new JLabel("b:");
		lblB.setBounds(52, 150, 55, 18);
		contentPane.add(lblB);
		
		t_b = new JTextField("1.901");
		t_b.setBounds(82, 148, 67, 22);
		contentPane.add(t_b);
		
		JLabel lblN = new JLabel("n:");
		lblN.setBounds(52, 184, 55, 18);
		contentPane.add(lblN);
		
		t_n = new JTextField("1.63");
		t_n.setBounds(82, 182, 67, 22);
		contentPane.add(t_n);
				
		JLabel lblE = new JLabel("e:");
		lblE.setBounds(174, 48, 55, 18);
		contentPane.add(lblE);
		
		t_e = new JTextField("1.077");
		t_e.setColumns(10);
		t_e.setBounds(204, 46, 67, 22);
		contentPane.add(t_e);
		
		JLabel lblA = new JLabel("a:");
		lblA.setBounds(174, 80, 55, 18);
		contentPane.add(lblA);
		
		t_a = new JTextField("5.223");
		t_a.setColumns(10);
		t_a.setBounds(204, 80, 67, 22);
		contentPane.add(t_a);
		
		JLabel lblS = new JLabel("s:");
		lblS.setBounds(174, 114, 55, 18);
		contentPane.add(lblS);
		
		t_s = new JTextField("0.02");
		t_s.setBounds(204, 114, 67, 22);
		contentPane.add(t_s);
		
		JLabel lblC = new JLabel("c:");
		lblC.setBounds(174, 150, 55, 18);
		contentPane.add(lblC);
		
		t_c = new JTextField("0.02");
		t_c.setColumns(10);
		t_c.setBounds(204, 148, 67, 22);
		contentPane.add(t_c);
		
		JLabel lblD = new JLabel("d:");
		lblD.setBounds(174, 184, 55, 18);
		contentPane.add(lblD);
		
		t_d = new JTextField("0.76");
		t_d.setColumns(10);
		t_d.setBounds(204, 182, 67, 22);
		contentPane.add(t_d);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double afa=Double.valueOf(t_afa.getText());
				double Z=Double.valueOf(t_Z.getText());
				double r1=Double.valueOf(t_r1.getText());
				double L=Double.valueOf(t_L.getText());
				double b=Double.valueOf(t_b.getText());
				double n=Double.valueOf(t_n.getText());
				double ee=Double.valueOf(t_e.getText());
				double a=Double.valueOf(t_a.getText());
				double s=Double.valueOf(t_s.getText());
				double c=Double.valueOf(t_c.getText());
				double d=Double.valueOf(t_d.getText());
				double r=Demo.return_r(r1, L, b, n);
				BigDecimal bd1=new BigDecimal(r);  
				double r_end=bd1.setScale(6,BigDecimal.ROUND_HALF_UP).doubleValue(); 
				
				double R=Demo.return_R(L, d, r,b);
				BigDecimal bd2=new BigDecimal(R);  
				double R_end=bd2.setScale(6,BigDecimal.ROUND_HALF_UP).doubleValue(); 
				
								
				double Lr=Demo.return_Lr(a, ee, r, s, c, b, afa);
				BigDecimal bd3=new BigDecimal(Lr);  
				double Lr_end=bd3.setScale(6,BigDecimal.ROUND_HALF_UP).doubleValue();
				
				double Wd=Demo.return_Wd(R, Z, afa, r, b, a,ee,Lr);
				BigDecimal bd4=new BigDecimal(Wd);  
				double Wd_end=bd4.setScale(6,BigDecimal.ROUND_HALF_UP).doubleValue();
				R_Wd.setText(String.valueOf(Wd_end));
				R_Lr.setText(String.valueOf(Lr_end));
				R_r.setText(String.valueOf(r_end));
				R_R.setText(String.valueOf(R_end));
				
			}
		});
		btnNewButton.setBounds(104, 222, 98, 28);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Wd\u7684\u503C\u4E3A\uFF1A");
		lblNewLabel_1.setBounds(300, 57, 71, 22);
		contentPane.add(lblNewLabel_1);
		
		R_Wd = new JTextField();
		R_Wd.setBounds(373, 57, 88, 22);
		contentPane.add(R_Wd);
		R_Wd.setColumns(10);
		
		JLabel lblLr = new JLabel("Lr\u7684\u503C\u4E3A\uFF1A");
		lblLr.setBounds(300, 91, 71, 22);
		contentPane.add(lblLr);
		
		R_Lr = new JTextField();
		R_Lr.setColumns(10);
		R_Lr.setBounds(373, 91, 88, 22);
		contentPane.add(R_Lr);
		
		JLabel lblR_1 = new JLabel("r\u7684\u503C\u4E3A\uFF1A");
		lblR_1.setBounds(300, 129, 71, 22);
		contentPane.add(lblR_1);
		
		R_r = new JTextField();
		R_r.setColumns(10);
		R_r.setBounds(373, 129, 88, 22);
		contentPane.add(R_r);
		
		R_R = new JTextField();
		R_R.setColumns(10);
		R_R.setBounds(373, 166, 88, 22);
		contentPane.add(R_R);
		
		JLabel lblR_2 = new JLabel("R\u7684\u503C\u4E3A\uFF1A");
		lblR_2.setBounds(300, 166, 71, 22);
		contentPane.add(lblR_2);
		
		JButton btnCancel = new JButton("Clear");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t_afa.setText("");
				t_Z.setText("");
				t_r1.setText("");
				t_L.setText("");
				t_b.setText("");
				t_n.setText("");
				t_e.setText("");
				t_a.setText("");
				t_s.setText("");
				t_c.setText("");
				t_d.setText("");
				R_Wd.setText("");
				R_Lr.setText("");
				R_r.setText("");
				R_R.setText("");

			}
		});
		btnCancel.setBounds(242, 222, 98, 28);
		contentPane.add(btnCancel);
	}
}
