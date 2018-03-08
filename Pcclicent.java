package gui界面;

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
	
public static JFrame frame = new JFrame("钱多多系统");
private JPanel pane1=new JPanel();
private static JPanel pane2=new JPanel();
private JTextField username = new JTextField();
private JPasswordField password = new JPasswordField();
private static PANEL Allpane = new PANEL();
private JButton ok = new JButton("确定");
private JButton cancel = new JButton("取消");
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
//顶部
JPanel titlePanel = new JPanel();
titlePanel.setLayout(new FlowLayout());
titlePanel.add(new JLabel("系统管理员登录"));
pane1.add(titlePanel,BorderLayout.NORTH);

//中部表单
JPanel fieldPanel = new JPanel();
fieldPanel.setLayout(null);
JLabel a1 = new JLabel("用户名:");
a1.setBounds(50,20,50,20);
JLabel a2 = new JLabel("密  码:");
a2.setBounds(50,60,50,20);
fieldPanel.add(a1);
fieldPanel.add(a2);
username.setBounds(110,20,120,20);
password.setBounds(110,60,120,20);
fieldPanel.add(username);
fieldPanel.add(password);
pane1.add(fieldPanel,BorderLayout.CENTER);

//底部按钮
JPanel buttonPanel = new JPanel();
buttonPanel.setLayout(new FlowLayout());
buttonPanel.add(ok);
buttonPanel.add(cancel);
ok.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
		UDP udp=new UDP();	
		String [] s=udp.get().split("\\/");
		if(username.getText().equals(s[0])&&String.valueOf(password.getPassword()).equals(s[1])){
			pane1.setVisible(false);
			inPane2();
		}	
		else
			JOptionPane.showMessageDialog(frame,"账号或密码错误","错误",JOptionPane.ERROR_MESSAGE);
	}	
});
cancel.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自动生成的方法存根
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
	menu1=new JMenu("操作员");
	menu2=new JMenu("帮助");
	menu3=new JMenu("退出");
	menuBar.add(menu1);
	menuBar.add(menu2);
	menuBar.add(menu3);
	JMenuItem menuItem1=new JMenuItem("操作员信息");
	JMenuItem menuItem2=new JMenuItem("添加操作员");
	JMenuItem menuItem3=new JMenuItem("删除操作员");
	menuItem3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			String s=JOptionPane.showInputDialog(frame,"请输入删除操作员的编号：");
			String[] options={"确定","取消"};
			int n=JOptionPane.showOptionDialog(frame, "确定要删除操作员："+s+"？"," 询问",JOptionPane.YES_NO_CANCEL_OPTION , JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
			if(n==JOptionPane.YES_OPTION){
				JOptionPane.showMessageDialog(frame, "删除操作员："+s+"成功");
			}
		}
	});
	menuItem1.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			JOptionPane.showMessageDialog(frame, "操作员：9527");
		}
	});
	menuItem2.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			String s0=JOptionPane.showInputDialog(frame,"新增操作员编号:");
			String s1=JOptionPane.showInputDialog(frame,"新增操作员账号:");
			String s2=JOptionPane.showInputDialog(frame,"新增操作员密码:");
			String s3=JOptionPane.showInputDialog(frame,"再次输入密码:");
			while(!s2.equals(s3)){
				s2=JOptionPane.showInputDialog(frame,"新增操作员密码:");
				s3=JOptionPane.showInputDialog(frame,"再次输入密码:");
			}
			JOptionPane.showMessageDialog(frame, "添加操作员："+s0+"成功");
		}
	});
	menu1.add(menuItem1);
	menu1.add(menuItem2);
	menu1.add(menuItem3);
	menu3.addMouseListener(new MouseAdapter(){
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO 自动生成的方法存根
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
			// TODO 自动生成的方法存根
			JOptionPane.showMessageDialog(frame, "钱多多最垃圾版本");
		}
	});
	frame.setJMenuBar(menuBar);
	//
	pane2.setLayout(new BorderLayout(10,0));
	JPanel pane3=new JPanel();
	pane2.add(pane3,BorderLayout.WEST);
	pane3.setLayout(new GridLayout(5,1));
	JButton b1=new JButton("基本信息");
	JButton b2=new JButton("账单管理");
	JButton b3=new JButton("库存管理");
	JButton b4=new JButton("财务管理");
	JButton b5=new JButton("生产管理");
	pane3.add(b1);
	pane3.add(b2);
	pane3.add(b3);
	pane3.add(b4);
	pane3.add(b5);
	pane2.add(pane4,BorderLayout.CENTER);
	
	b1.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			Allpane.pane1();
		}	
	});
	b2.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			Allpane.pane2();
		}	
	});
	b3.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			Allpane.pane3();
		}	
	});
	b4.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			Allpane.Finance();
		}	
	});
	b5.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			Allpane.product();
		}	
	});
}
public static void main(String[] args){
new Pcclicent();
}
}