package gui����;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Pcclicent{
	
public static JFrame frame = new JFrame("Ǯ���ϵͳ");
private JPanel pane1=new JPanel();
private static JPanel pane2=new JPanel();
private JTextField username = new JTextField();
private JPasswordField password = new JPasswordField();
private static PANEL Allpane = new PANEL();
private JButton ok = new JButton("ȷ��");
private JButton cancel = new JButton("ȡ��");
private static JPanel pane4=new JPanel();
public static void change(JPanel pane){
	pane4.setVisible(false);
	pane2.remove(pane4);
	pane4=new JPanel();
	pane4=pane;
	pane2.add(pane4);
	}
public Pcclicent(){
frame.setSize(300,200);
frame.add(pane1);
pane1.setLayout(new BorderLayout());
initPane1();
frame.setVisible(true);
}
private void initPane1(){
//����
JPanel titlePanel = new JPanel();
titlePanel.setLayout(new FlowLayout());
titlePanel.add(new JLabel("ϵͳ����Ա��¼"));
pane1.add(titlePanel,BorderLayout.NORTH);

//�в���
JPanel fieldPanel = new JPanel();
fieldPanel.setLayout(null);
JLabel a1 = new JLabel("�û���:");
a1.setBounds(50,20,50,20);
JLabel a2 = new JLabel("��  ��:");
a2.setBounds(50,60,50,20);
fieldPanel.add(a1);
fieldPanel.add(a2);
username.setBounds(110,20,120,20);
password.setBounds(110,60,120,20);
fieldPanel.add(username);
fieldPanel.add(password);
pane1.add(fieldPanel,BorderLayout.CENTER);

//�ײ���ť
JPanel buttonPanel = new JPanel();
buttonPanel.setLayout(new FlowLayout());
buttonPanel.add(ok);
buttonPanel.add(cancel);
ok.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �Զ����ɵķ������
		UDP udp=new UDP();	
		String [] s=udp.get().split("\\/");
		if(username.getText().equals(s[0])&&String.valueOf(password.getPassword()).equals(s[1])){
			pane1.setVisible(false);
			inPane2();
		}	
		else
			JOptionPane.showMessageDialog(frame,"�˺Ż��������","����",JOptionPane.ERROR_MESSAGE);
	}	
});
cancel.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �Զ����ɵķ������
		username.setText("");
		password.setText("");
	}	
});
pane1.add(buttonPanel,"South");
}
protected void inPane2() {
	frame.setSize(1000,800);
	frame.add(pane2);
	//set the menu
	final JMenuBar menuBar;
	JMenu menu1,menu2,menu3;
	menuBar=new JMenuBar();
	menu1=new JMenu("����Ա");
	menu2=new JMenu("����");
	menu3=new JMenu("�˳�");
	menuBar.add(menu1);
	menuBar.add(menu2);
	menuBar.add(menu3);
	JMenuItem menuItem1=new JMenuItem("����Ա��Ϣ");
	JMenuItem menuItem2=new JMenuItem("��Ӳ���Ա");
	JMenuItem menuItem3=new JMenuItem("ɾ������Ա");
	menuItem3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			// TODO �Զ����ɵķ������
			String s=JOptionPane.showInputDialog(frame,"������ɾ������Ա�ı�ţ�");
			String[] options={"ȷ��","ȡ��"};
			int n=JOptionPane.showOptionDialog(frame, "ȷ��Ҫɾ������Ա��"+s+"��"," ѯ��",JOptionPane.YES_NO_CANCEL_OPTION , JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
			if(n==JOptionPane.YES_OPTION){
				JOptionPane.showMessageDialog(frame, "ɾ������Ա��"+s+"�ɹ�");
			}
		}
	});
	menuItem1.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO �Զ����ɵķ������
			JOptionPane.showMessageDialog(frame, "����Ա��9527");
		}
	});
	menuItem2.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO �Զ����ɵķ������
			String s0=JOptionPane.showInputDialog(frame,"��������Ա���:");
			String s1=JOptionPane.showInputDialog(frame,"��������Ա�˺�:");
			String s2=JOptionPane.showInputDialog(frame,"��������Ա����:");
			String s3=JOptionPane.showInputDialog(frame,"�ٴ���������:");
			while(!s2.equals(s3)){
				s2=JOptionPane.showInputDialog(frame,"��������Ա����:");
				s3=JOptionPane.showInputDialog(frame,"�ٴ���������:");
			}
			JOptionPane.showMessageDialog(frame, "��Ӳ���Ա��"+s0+"�ɹ�");
		}
	});
	menu1.add(menuItem1);
	menu1.add(menuItem2);
	menu1.add(menuItem3);
	menu3.addMouseListener(new MouseAdapter(){
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO �Զ����ɵķ������
			username.setText("");
			password.setText("");
			menuBar.setVisible(false);
			frame.setSize(300,200);
			frame.remove(pane2);
			pane1.setVisible(true);
		}
	});
	menu2.addMouseListener(new MouseAdapter(){
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO �Զ����ɵķ������
			JOptionPane.showMessageDialog(frame, "Ǯ����������汾");
		}
	});
	frame.setJMenuBar(menuBar);
	//
	pane2.setLayout(new BorderLayout(10,0));
	JPanel pane3=new JPanel();
	pane2.add(pane3,BorderLayout.WEST);
	pane3.setLayout(new GridLayout(5,1));
	JButton b1=new JButton("������Ϣ");
	JButton b2=new JButton("�˵�����");
	JButton b3=new JButton("������");
	JButton b4=new JButton("�������");
	JButton b5=new JButton("��������");
	pane3.add(b1);
	pane3.add(b2);
	pane3.add(b3);
	pane3.add(b4);
	pane3.add(b5);
	pane2.add(pane4,BorderLayout.CENTER);
	
	b1.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO �Զ����ɵķ������
			Allpane.pane1();
		}	
	});
	b2.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO �Զ����ɵķ������
			Allpane.pane2();
		}	
	});
	b3.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO �Զ����ɵķ������
			Allpane.pane3();
		}	
	});
	b4.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO �Զ����ɵķ������
			Allpane.Finance();
		}	
	});
	b5.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO �Զ����ɵķ������
			Allpane.product();
		}	
	});
}
public static void main(String[] args){
new Pcclicent();
}
}