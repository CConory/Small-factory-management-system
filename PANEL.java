package gui界面;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PANEL {
//基本信息界面
	public void pane1() {
		JPanel panel1=new JPanel();
		panel1.setBounds(0, 0, 1000, 800);
		JTextArea text=new JTextArea();
		JButton button1=new JButton();
		JButton button2=new JButton();
		JButton button3=new JButton();
		button1.setPreferredSize(new Dimension(200,199));
		button2.setPreferredSize(new Dimension(200,199));
		button3.setPreferredSize(new Dimension(200,199));
		button1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
			}
			
		});
		JLabel label1=new JLabel();
		JLabel label2=new JLabel();
		JLabel label3=new JLabel();
		ImageIcon icon1=new ImageIcon();
		ImageIcon icon2=new ImageIcon();
		ImageIcon icon3=new ImageIcon();
		Box b=Box.createVerticalBox();
		Box textbox=Box.createHorizontalBox();
		Box buttonbox=Box.createHorizontalBox();
		Box labelbox=Box.createHorizontalBox();
		icon1 =new ImageIcon(getClass().getResource("工厂.png"));
		icon2 =new ImageIcon(getClass().getResource("机器.png"));
		icon3 =new ImageIcon(getClass().getResource("工人.png"));
		button1.setIcon(icon1);
		button1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				pane4();
			}	
		});
		button2.setIcon(icon2);
		button3.setIcon(icon3);
		label1.setText("工厂基本信息管理");
		label2.setText("机器信息管理");
		label3.setText("工人信息管理");
		text.setText("基本信息");
		text.setEditable(false);
		
		textbox.add(text);
		
		buttonbox.add(Box.createHorizontalStrut(20));
		buttonbox.add(button1);
		buttonbox.add(Box.createHorizontalStrut(65));
		buttonbox.add(button2);
		buttonbox.add(Box.createHorizontalStrut(65));
		buttonbox.add(button3);
		
		labelbox.add(Box.createHorizontalStrut(30));
		labelbox.add(label1);
		labelbox.add(Box.createHorizontalStrut(150));
		labelbox.add(label2);
		labelbox.add(Box.createHorizontalStrut(180));
		labelbox.add(label3);
		
		b.add(textbox);
		b.add(Box.createVerticalStrut(20));
		b.add(buttonbox);
		b.add(Box.createVerticalStrut(20));
		b.add(labelbox);
		panel1.add(b);
		Pcclicent.change(panel1);
	}
//账单管理界面
	public void pane2() {
		JPanel pane=new JPanel();
		pane.setLayout(new BorderLayout());
		JPanel pane1=new JPanel();
		pane1.setLayout(new GridLayout(2,1));
		JPanel pane5=new JPanel();
		pane5.setLayout(new GridLayout(4,1));
		JPanel pane2=new JPanel();
		pane2.add(new JLabel("账单类型：            "));
		JRadioButton radio1=new JRadioButton("进货账单       ");
		radio1.setSelected(true);
		JRadioButton radio2=new JRadioButton("出货账单       ");
		ButtonGroup group=new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		pane2.add(radio1);
		pane2.add(radio2);
		pane5.add(pane2);
		JTextArea text=new JTextArea("基本信息->机器信息管理");
		JPanel textpane=new JPanel();
		textpane.setLayout(new BoxLayout(textpane,BoxLayout.X_AXIS));
		textpane.add(text);
		text.setEditable(false);
		pane.add(textpane,BorderLayout.NORTH);
		JPanel pane3=new JPanel();
		pane3.add(new JLabel("客户：         "));
		String[] strList={"客户1","客户2","客户3","客户4"};
		JComboBox<String> comboBox=new JComboBox<String>(strList);
		pane3.add(comboBox);
		pane5.add(pane3);
		JPanel pane4=new JPanel();
		pane4.add(new JLabel("订单号：           "));
		
		JTextArea text1=new JTextArea("");
		text1.setPreferredSize(new Dimension(300,30));
		pane4.add(text1);
		pane5.add(pane4);
		JPanel pane6=new JPanel();
		JButton button1=new JButton("查询");
		JButton button2=new JButton("重置");
		pane6.add(button1);
		pane6.add(new JLabel("            "));
		pane6.add(button2);
		pane5.add(pane6);
		pane1.add(pane5);
		
		
		
		JTable table=new JTable();
		String []colnumnNames={"序号","订单号","账单类型","客户单位","时间",""};
		Object[][] data={{null,null,null,null,null,null},{null,null,null,null,null,null}};
		table=new JTable(data,colnumnNames);
		JScrollPane scrollPane=new JScrollPane(table);
		JPanel pane8=new JPanel();
		pane8.add(scrollPane);
		pane1.add(pane8);
		
		
		
		pane.add(pane1);
		JPanel pane7=new JPanel();
		JButton button3=new JButton("添加菜单");
		JButton button4=new JButton("退出");
		pane7.add(button3);
		pane7.add(new JLabel("            "));
		pane7.add(button4);
		pane.add(pane7,BorderLayout.SOUTH);
		Pcclicent.change(pane);
	}
//基本信息->工厂基本信息管理界面
public void pane4(){
	
	JPanel pane1=new JPanel();
	pane1.setLayout(new BorderLayout());
	JPanel pane2=new JPanel();
	pane2.setLayout(new BoxLayout(pane2,BoxLayout.X_AXIS));
	JTextArea text=new JTextArea("基本信息->机器信息管理");
	pane2.add(text);
	text.setEditable(false);
	pane1.add(pane2,BorderLayout.NORTH);
	JButton button1=new JButton("修改名字");
	JButton button2=new JButton("添加产品");
	JButton button3=new JButton("退出");
	button3.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			pane1();			
		}	
	});
	JPanel buttonpane=new JPanel();
	buttonpane.add(button2);
	buttonpane.add(new JLabel(""));
	buttonpane.add(button3);
	pane1.add(buttonpane,BorderLayout.SOUTH);
	JPanel labelpane=new JPanel();
	labelpane.setLayout(new BoxLayout(labelpane,BoxLayout.Y_AXIS));
	pane1.add(labelpane);
	JPanel pane3=new JPanel();
	pane3.add(new JLabel("工厂名称:      "));
	final JLabel text1=new JLabel("xxx工厂             ");
	pane3.add(text1);
	pane3.add(button1);
	button1.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s=JOptionPane.showInputDialog(Pcclicent.frame,"请输入工厂姓名");
			if(s!=null){
			if(s.equals("")){
				JOptionPane.showMessageDialog(Pcclicent.frame, "请输入工厂名称","警告",JOptionPane.WARNING_MESSAGE);
			}
			else{
				text1.setText(s+"             ");
			}
			}
		}	
	});
	labelpane.add(pane3);
	JPanel pane4=new JPanel();
	final JTextArea textarea=new JTextArea(50,50);
	textarea.setEditable(false);
	pane4.add(textarea);
	labelpane.add(pane4);
	button2.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s=JOptionPane.showInputDialog(Pcclicent.frame,"请输入产品名称");
			if(s!=null){
			if(s.equals("")){
				JOptionPane.showMessageDialog(Pcclicent.frame, "请输入产品名称","警告",JOptionPane.WARNING_MESSAGE);
			}
			else{
				String ss=JOptionPane.showInputDialog(Pcclicent.frame,"请输入产品计量单位");
			if(ss!=null){
			if(ss.equals("")){
				JOptionPane.showMessageDialog(Pcclicent.frame, "请输入产品计量单位","警告",JOptionPane.WARNING_MESSAGE);
			}
			else{
				textarea.append("产品名称：     "+s+"         该产品计量单位：    "+ss+"\r\n");
			}
			}
			}
			}
		}	
	});
	Pcclicent.change(pane1);
}
//库存管理界面	
public void pane3() {

	JPanel panel=new JPanel();
	panel.setBounds(0, 0, 1000, 800);
	JTextField text=new JTextField();
	text.setEditable(false);
	JButton button1=new JButton();
	JButton button2=new JButton();
	JButton button3=new JButton();
	button1.setPreferredSize(new Dimension(200,199));
	button2.setPreferredSize(new Dimension(200,199));
	button3.setPreferredSize(new Dimension(200,199));
	button1.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Inbound();		
		}		
	});
	button2.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Outbound();			
		}		
	});
	button3.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			CheckBound();		
		}		
	});
	JLabel label1=new JLabel();
	JLabel label2=new JLabel();
	JLabel label3=new JLabel();
	ImageIcon icon1=new ImageIcon();
	ImageIcon icon2=new ImageIcon();
	ImageIcon icon3=new ImageIcon();
	Box b=Box.createVerticalBox();
	Box textbox=Box.createHorizontalBox();
	Box buttonbox=Box.createHorizontalBox();
	Box labelbox=Box.createHorizontalBox();
	icon1 =new ImageIcon(getClass().getResource("QQ图片20170628133902.png"));
	icon2 =new ImageIcon(getClass().getResource("QQ图片20170628134630.png"));
	icon3 =new ImageIcon(getClass().getResource("QQ图片20170628134720.png"));
	button1.setIcon(icon1);
	button2.setIcon(icon2);
	button3.setIcon(icon3);
	label1.setText("入库");
	label2.setText("出库");
	label3.setText("库存查询");
	text.setText("库存管理");
	text.setPreferredSize(new Dimension(500,20));
	
	textbox.add(text);
	
	buttonbox.add(Box.createHorizontalStrut(20));
	buttonbox.add(button1);
	buttonbox.add(Box.createHorizontalStrut(65));
	buttonbox.add(button2);
	buttonbox.add(Box.createHorizontalStrut(65));
	buttonbox.add(button3);
	
	labelbox.add(Box.createHorizontalStrut(40));
	labelbox.add(label1);
	labelbox.add(Box.createHorizontalStrut(240));
	labelbox.add(label2);
	labelbox.add(Box.createHorizontalStrut(225));
	labelbox.add(label3);
	
	b.add(textbox);
	b.add(Box.createVerticalStrut(20));
	b.add(buttonbox);
	b.add(Box.createVerticalStrut(20));
	b.add(labelbox);
	panel.add(b);
	Pcclicent.change(panel);
}
//库存管理->入库
public void Inbound(){
	JPanel panel=new JPanel();
	panel.setBounds(0, 0, 1000, 800);
	JTextArea text=new JTextArea();
	text.setEditable(false);
	text.setText("库存管理->入库");
	JLabel label1=new JLabel("供应商");
	label1.setPreferredSize(new Dimension(60,25));
	JLabel label2=new JLabel("日期");
	label2.setPreferredSize(new Dimension(60,25));
	JLabel label3=new JLabel("单据号");
	label3.setPreferredSize(new Dimension(60,25));
	JLabel label4=new JLabel("仓库");
	label4.setPreferredSize(new Dimension(60,25));
	JLabel label5=new JLabel("单据类型");
	label5.setPreferredSize(new Dimension(60,25));
	JLabel label6=new JLabel("审核状态");
	label6.setPreferredSize(new Dimension(60,25));
	JLabel label7=new JLabel("经办人");
	label7.setPreferredSize(new Dimension(60,25));
	JLabel label8=new JLabel("摘要");
	label8.setPreferredSize(new Dimension(60,25));
	JTextField textfield1=new JTextField();
	textfield1.setPreferredSize(new Dimension(100,25));
	JTextField textfield2=new JTextField();
	textfield2.setPreferredSize(new Dimension(100,25));
	JTextField textfield3=new JTextField();
	textfield3.setPreferredSize(new Dimension(100,25));
	JTextField textfield4=new JTextField();
	textfield4.setPreferredSize(new Dimension(100,25));
	JTextField textfield5=new JTextField();
	textfield5.setPreferredSize(new Dimension(100,25));
	JTextField textfield6=new JTextField();
	textfield6.setPreferredSize(new Dimension(100,25));
	JPanel p=new JPanel();
	p.setLayout(new FlowLayout(FlowLayout.LEFT));
	JTextField textfield7=new JTextField();
	textfield7.setPreferredSize(new Dimension(100,25));
	JTextField textfield8=new JTextField();
	textfield8.setPreferredSize(new Dimension(355,25));
	JButton button1=new JButton("确认");
	JButton button2=new JButton("取消");
	Box b=Box.createVerticalBox();
	Box b1=Box.createHorizontalBox();
	Box b2=Box.createHorizontalBox();
	Box b3=Box.createHorizontalBox();
	Box b4=Box.createHorizontalBox();
	Box b5=Box.createHorizontalBox();
	Box b6=Box.createHorizontalBox();
	
	JTable table=new JTable();
	String []colnumnNames={"","编号","条码","名称","规格","数量","单价","库存"};
	Object[][] data={{1,"212","456","897","456","789","789","23423"},{2,"21","56","87","56","89","78","2343"}};
	table=new JTable(data,colnumnNames);
	JScrollPane scrollPane=new JScrollPane(table);
	
	b1.add(text);
	
	
	b2.add(Box.createHorizontalStrut(45));
	b2.add(label1);
	b2.add(Box.createHorizontalStrut(45));
	b2.add(textfield1);
	b2.add(Box.createHorizontalStrut(45));
	b2.add(label2);
	b2.add(Box.createHorizontalStrut(45));
	b2.add(textfield2);
	b2.add(Box.createHorizontalStrut(45));
	b2.add(label3);
	b2.add(Box.createHorizontalStrut(45));
	b2.add(textfield3);
	
	b3.add(Box.createHorizontalStrut(45));
	b3.add(label4);
	b3.add(Box.createHorizontalStrut(45));
	b3.add(textfield4);
	b3.add(Box.createHorizontalStrut(45));
	b3.add(label5);
	b3.add(Box.createHorizontalStrut(45));
	b3.add(textfield5);
	b3.add(Box.createHorizontalStrut(45));
	b3.add(label6);
	b3.add(Box.createHorizontalStrut(45));
	b3.add(textfield6);
	
	p.add(Box.createHorizontalStrut(5));
	p.add(label7);
	p.add(Box.createHorizontalStrut(35));
	p.add(textfield7);
	p.add(Box.createHorizontalStrut(35));
	p.add(label8);
	p.add(Box.createHorizontalStrut(35));
	p.add(textfield8);	
	b4.add(Box.createHorizontalStrut(30));
	b4.add(p);
	
	JPanel pp=new JPanel();
	scrollPane.setPreferredSize(new Dimension(600,200));
	pp.add(scrollPane);
	b5.add(pp);
	
	
	b6.add(button1);
	b6.add(Box.createHorizontalStrut(200));
	b6.add(button2);
	
	b.add(b1);
	b.add(Box.createVerticalStrut(20));
	b.add(b2);
	b.add(Box.createVerticalStrut(20));
	b.add(b3);
	b.add(Box.createVerticalStrut(20));
	b.add(b4);
	b.add(Box.createVerticalStrut(20));
	b.add(b5);
	b.add(Box.createVerticalStrut(50));
	b.add(b6);
	
	panel.add(b);
	Pcclicent.change(panel);	
}
//库存管理->出库
public void Outbound(){
	JPanel panel=new JPanel();
	panel.setBounds(0, 0, 1000, 800);
	JTextArea text=new JTextArea();
	text.setEditable(false);
	text.setText("库存管理->出库");
	JLabel label1=new JLabel("供应商");
	label1.setPreferredSize(new Dimension(60,25));
	JLabel label2=new JLabel("日期");
	label2.setPreferredSize(new Dimension(60,25));
	JLabel label3=new JLabel("单据号");
	label3.setPreferredSize(new Dimension(60,25));
	JLabel label4=new JLabel("仓库");
	label4.setPreferredSize(new Dimension(60,25));
	JLabel label5=new JLabel("单据类型");
	label5.setPreferredSize(new Dimension(60,25));
	JLabel label6=new JLabel("审核状态");
	label6.setPreferredSize(new Dimension(60,25));
	JLabel label7=new JLabel("经办人");
	label7.setPreferredSize(new Dimension(60,25));
	JLabel label8=new JLabel("摘要");
	label8.setPreferredSize(new Dimension(60,25));
	JTextField textfield1=new JTextField();
	textfield1.setPreferredSize(new Dimension(100,25));
	JTextField textfield2=new JTextField();
	textfield2.setPreferredSize(new Dimension(100,25));
	JTextField textfield3=new JTextField();
	textfield3.setPreferredSize(new Dimension(100,25));
	JTextField textfield4=new JTextField();
	textfield4.setPreferredSize(new Dimension(100,25));
	JTextField textfield5=new JTextField();
	textfield5.setPreferredSize(new Dimension(100,25));
	JTextField textfield6=new JTextField();
	textfield6.setPreferredSize(new Dimension(100,25));
	JPanel p=new JPanel();
	p.setLayout(new FlowLayout(FlowLayout.LEFT));
	JTextField textfield7=new JTextField();
	textfield7.setPreferredSize(new Dimension(100,25));
	JTextField textfield8=new JTextField();
	textfield8.setPreferredSize(new Dimension(355,25));
	JButton button1=new JButton("确认");
	JButton button2=new JButton("取消");
	Box b=Box.createVerticalBox();
	Box b1=Box.createHorizontalBox();
	Box b2=Box.createHorizontalBox();
	Box b3=Box.createHorizontalBox();
	Box b4=Box.createHorizontalBox();
	Box b5=Box.createHorizontalBox();
	Box b6=Box.createHorizontalBox();
	
	JTable table=new JTable();
	String []colnumnNames={"","编号","条码","名称","规格","数量","单价","库存"};
	Object[][] data={{1,"212","456","897","456","789","789","23423"},{2,"21","56","87","56","89","78","2343"}};
	table=new JTable(data,colnumnNames);
	JScrollPane scrollPane=new JScrollPane(table);
	
	b1.add(text);
	
	
	b2.add(Box.createHorizontalStrut(45));
	b2.add(label1);
	b2.add(Box.createHorizontalStrut(45));
	b2.add(textfield1);
	b2.add(Box.createHorizontalStrut(45));
	b2.add(label2);
	b2.add(Box.createHorizontalStrut(45));
	b2.add(textfield2);
	b2.add(Box.createHorizontalStrut(45));
	b2.add(label3);
	b2.add(Box.createHorizontalStrut(45));
	b2.add(textfield3);
	
	b3.add(Box.createHorizontalStrut(45));
	b3.add(label4);
	b3.add(Box.createHorizontalStrut(45));
	b3.add(textfield4);
	b3.add(Box.createHorizontalStrut(45));
	b3.add(label5);
	b3.add(Box.createHorizontalStrut(45));
	b3.add(textfield5);
	b3.add(Box.createHorizontalStrut(45));
	b3.add(label6);
	b3.add(Box.createHorizontalStrut(45));
	b3.add(textfield6);
	
	p.add(Box.createHorizontalStrut(5));
	p.add(label7);
	p.add(Box.createHorizontalStrut(35));
	p.add(textfield7);
	p.add(Box.createHorizontalStrut(35));
	p.add(label8);
	p.add(Box.createHorizontalStrut(35));
	p.add(textfield8);	
	b4.add(Box.createHorizontalStrut(30));
	b4.add(p);
	
	JPanel pp=new JPanel();
	scrollPane.setPreferredSize(new Dimension(600,200));
	pp.add(scrollPane);
	b5.add(pp);
	
	
	b6.add(button1);
	b6.add(Box.createHorizontalStrut(200));
	b6.add(button2);
	
	b.add(b1);
	b.add(Box.createVerticalStrut(20));
	b.add(b2);
	b.add(Box.createVerticalStrut(20));
	b.add(b3);
	b.add(Box.createVerticalStrut(20));
	b.add(b4);
	b.add(Box.createVerticalStrut(20));
	b.add(b5);
	b.add(Box.createVerticalStrut(50));
	b.add(b6);
	
	panel.add(b);
	Pcclicent.change(panel);
}
//库存管理->库存查询
public void CheckBound(){
	JPanel panel=new JPanel();
	JTextArea text=new JTextArea();
	text.setText("库存管理->库存查询");
	text.setEditable(false);
	Box b=Box.createVerticalBox();
	Box b1=Box.createHorizontalBox();
	Box b2=Box.createHorizontalBox();
	Box b3=Box.createHorizontalBox();
	
	JLabel label=new JLabel("库存");
	JTextField textfield =new JTextField("");
	JButton button1=new JButton("查询");
	JButton button2=new JButton("取消");
	JTable table=new JTable();
	String []colnumnNames={"","编号","条码","名称","规格","数量","单价","库存"};
	Object[][] data={{1,"212","456","897","456","789","789","23423"},{2,"21","56","87","56","89","78","2343"}};
	table=new JTable(data,colnumnNames);
	JScrollPane scrollPane=new JScrollPane(table);
	
	b1.add(text);
	
	b2.add(Box.createHorizontalStrut(50));
	b2.add(label);
	b2.add(textfield);
	b2.add(button1);
	b2.add(button2);
	
	scrollPane.setPreferredSize(new Dimension(748,200));
	b3.add(scrollPane);
	
	b.add(b1);
	b.add(Box.createVerticalStrut(20));
	b.add(b2);
	b.add(Box.createVerticalStrut(20));
	b.add(b3);
	panel.add(b);
	Pcclicent.change(panel);	
}
//财务管理
public void Finance() {
	JPanel panel=new JPanel();
	panel.setBounds(0, 0, 1000, 800);
	JTextField text=new JTextField();
	JButton button1=new JButton();
	JButton button2=new JButton();
	JButton button3=new JButton();
	JButton button4=new JButton();
	button1.setPreferredSize(new Dimension(200,200));
	button2.setPreferredSize(new Dimension(200,200));
	button3.setPreferredSize(new Dimension(200,200));
	button4.setPreferredSize(new Dimension(200,200));
	button1.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
			
		}
		
	});
	button2.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
		}
		
	});
	button3.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
		}
		
	});
	button4.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			prifit();
			
		}
		
	});
	JLabel label1=new JLabel();
	JLabel label2=new JLabel();
	JLabel label3=new JLabel();
	JLabel label4=new JLabel();
	ImageIcon icon1=new ImageIcon();
	ImageIcon icon2=new ImageIcon();
	ImageIcon icon3=new ImageIcon();
	ImageIcon icon4=new ImageIcon();
	Box b=Box.createVerticalBox();
	Box textbox=Box.createHorizontalBox();
	Box buttonbox1=Box.createHorizontalBox();
	Box labelbox1=Box.createHorizontalBox();
	Box buttonbox2=Box.createHorizontalBox();
	Box labelbox2=Box.createHorizontalBox();
	icon1 =new ImageIcon(getClass().getResource("QQ图片20170628200001.png"));
	icon2 =new ImageIcon(getClass().getResource("QQ图片20170628200012.png"));
	icon3 =new ImageIcon(getClass().getResource("QQ图片20170628200020.png"));
	icon4 =new ImageIcon(getClass().getResource("QQ图片20170628200028.png"));
	button1.setIcon(icon1);
	button2.setIcon(icon2);
	button3.setIcon(icon3);
	button4.setIcon(icon4);
	label1.setText("人工");
	label2.setText("成本");
	label3.setText("销售");
	label4.setText("利润");
	
	text.setText("财务管理");
	text.setPreferredSize(new Dimension(500,20));
	
	textbox.add(text);
	
	buttonbox1.add(Box.createHorizontalStrut(20));
	buttonbox1.add(button1);
	buttonbox1.add(Box.createHorizontalStrut(65));
	buttonbox1.add(button2);
	buttonbox1.add(Box.createHorizontalStrut(65));
	buttonbox1.add(button3);
	
	labelbox1.add(Box.createHorizontalStrut(10));
	labelbox1.add(label1);
	labelbox1.add(Box.createHorizontalStrut(240));
	labelbox1.add(label2);
	labelbox1.add(Box.createHorizontalStrut(232));
	labelbox1.add(label3);
	
	JPanel p=new JPanel();
	p.setLayout(new FlowLayout(FlowLayout.LEFT));
	p.add(Box.createHorizontalStrut(10));
	p.add(button4);
	buttonbox2.add(p);
	
	JPanel pp=new JPanel();
	pp.setLayout(new FlowLayout(FlowLayout.LEFT));
	pp.add(Box.createHorizontalStrut(92));
	pp.add(label4);
	labelbox2.add(pp);
	
	b.add(textbox);
	b.add(Box.createVerticalStrut(20));
	b.add(buttonbox1);
	b.add(Box.createVerticalStrut(20));
	b.add(labelbox1);
	b.add(Box.createVerticalStrut(20));
	b.add(buttonbox2);
	b.add(Box.createVerticalStrut(20));
	b.add(labelbox2);
	panel.add(b);
	Pcclicent.change(panel);
}
//财务管理->利润
public  void prifit(){
	JPanel panel=new JPanel();
	JTextArea text=new JTextArea();
	text.setText("财务管理->利润");
	JLabel label1=new JLabel("日销售额");
	JLabel label2=new JLabel("日净收入");
	JLabel label3=new JLabel("月销售额");
	JLabel label4=new JLabel("月净收入");
	JLabel label5=new JLabel("年销售额");
	JLabel label6=new JLabel("年净收入");
	JLabel label7=new JLabel("开始时间");
	JLabel label8=new JLabel("终止时间");
	JLabel label9=new JLabel("销售额");
	JLabel label10=new JLabel("净收入");
	
	JTextField textfield1 =new JTextField();
	textfield1.setPreferredSize(new Dimension(120,25));
	JTextField textfield2 =new JTextField();
	textfield2.setPreferredSize(new Dimension(120,25));
	JTextField textfield3 =new JTextField();
	textfield3.setPreferredSize(new Dimension(120,25));
	JTextField textfield4 =new JTextField();
	textfield4.setPreferredSize(new Dimension(120,25));
	JTextField textfield5 =new JTextField();
	textfield5.setPreferredSize(new Dimension(120,25));
	JTextField textfield6 =new JTextField();
	textfield6.setPreferredSize(new Dimension(120,25));
	JTextField textfield7 =new JTextField();
	textfield7.setPreferredSize(new Dimension(120,25));
	JTextField textfield8 =new JTextField();
	textfield8.setPreferredSize(new Dimension(120,25));
	JTextField textfield9 =new JTextField();
	textfield9.setPreferredSize(new Dimension(120,25));
	JTextField textfield10 =new JTextField();
	textfield10.setPreferredSize(new Dimension(120,25));
	
	Box b=Box.createVerticalBox();
	Box b1=Box.createHorizontalBox();
	Box b2=Box.createHorizontalBox();
	Box b3=Box.createHorizontalBox();
	Box b4=Box.createHorizontalBox();
	Box b5=Box.createHorizontalBox();
	Box b6=Box.createHorizontalBox();
	Box b7=Box.createHorizontalBox();
	
	
	b1.add(text);
	
	b2.add(Box.createHorizontalStrut(100));
	b2.add(label1);
	b2.add(Box.createHorizontalStrut(100));
	b2.add(textfield1);
	b2.add(Box.createHorizontalStrut(100));
	b2.add(label2);
	b2.add(Box.createHorizontalStrut(100));
	b2.add(textfield2);
	
	b3.add(Box.createHorizontalStrut(100));
	b3.add(label3);
	b3.add(Box.createHorizontalStrut(100));
	b3.add(textfield3);
	b3.add(Box.createHorizontalStrut(100));
	b3.add(label4);
	b3.add(Box.createHorizontalStrut(100));
	b3.add(textfield4);

	b4.add(Box.createHorizontalStrut(100));
	b4.add(label5);
	b4.add(Box.createHorizontalStrut(100));
	b4.add(textfield5);
	b4.add(Box.createHorizontalStrut(100));
	b4.add(label6);
	b4.add(Box.createHorizontalStrut(100));
	b4.add(textfield6);
	
	b5.add(Box.createHorizontalStrut(100));
	b5.add(label7);
	b5.add(Box.createHorizontalStrut(100));
	b5.add(textfield7);
	b5.add(Box.createHorizontalStrut(100));
	b5.add(label8);
	b5.add(Box.createHorizontalStrut(100));
	b5.add(textfield8);
	
	b6.add(Box.createHorizontalStrut(100));
	b6.add(label9);
	b6.add(Box.createHorizontalStrut(100));
	b6.add(textfield9);
	b6.add(Box.createHorizontalStrut(100));
	b6.add(label10);
	b6.add(Box.createHorizontalStrut(100));
	b6.add(textfield10);
	
	JButton button1=new JButton("查询");
	JButton button2=new JButton("取消");
	button2.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Finance();
			
		}
		
	});
	b7.add(Box.createHorizontalStrut(20));
	b7.add(button1);
	b7.add(Box.createHorizontalStrut(100));
	b7.add(button2);
	
	b.add(b1);
	b.add(Box.createVerticalStrut(20));
	b.add(b2);
	b.add(Box.createVerticalStrut(20));
	b.add(b3);
	b.add(Box.createVerticalStrut(20));
	b.add(b4);
	b.add(Box.createVerticalStrut(80));
	b.add(b5);
	b.add(Box.createVerticalStrut(20));
	b.add(b6);
	b.add(Box.createVerticalStrut(20));
	b.add(b7);
	
	panel.add(b);
	Pcclicent.change(panel);
}
public void product() {
	JPanel panel=new JPanel();
	panel.setBounds(0, 0, 1000, 800);
	JTextField text=new JTextField();
	text.setEditable(false);
	JButton button1=new JButton();
	JButton button2=new JButton();
	JButton button3=new JButton();
	button1.setPreferredSize(new Dimension(200,199));
	button2.setPreferredSize(new Dimension(200,199));
	button3.setPreferredSize(new Dimension(200,199));
	button1.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			chuangeplan();
			
		}
		
	});
	button2.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
		}
		
	});
	button3.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
		}
		
	});
	JLabel label1=new JLabel();
	JLabel label2=new JLabel();
	JLabel label3=new JLabel();
	ImageIcon icon1=new ImageIcon();
	ImageIcon icon2=new ImageIcon();
	ImageIcon icon3=new ImageIcon();
	Box b=Box.createVerticalBox();
	Box textbox=Box.createHorizontalBox();
	Box buttonbox=Box.createHorizontalBox();
	Box labelbox=Box.createHorizontalBox();
	icon1 =new ImageIcon(getClass().getResource("QQ图片20170628220134.png"));
	icon2 =new ImageIcon(getClass().getResource("QQ图片20170628220141.png"));
	icon3 =new ImageIcon(getClass().getResource("QQ图片20170628220156.png"));
	button1.setIcon(icon1);
	button2.setIcon(icon2);
	button3.setIcon(icon3);
	label1.setText("计划管理");
	label2.setText("当前计划");
	label3.setText("机器信息");
	text.setText("生产管理");
	text.setPreferredSize(new Dimension(500,20));
	
	textbox.add(text);
	
	
	buttonbox.add(Box.createHorizontalStrut(20));
	buttonbox.add(button1);
	buttonbox.add(Box.createHorizontalStrut(65));
	buttonbox.add(button2);
	buttonbox.add(Box.createHorizontalStrut(65));
	buttonbox.add(button3);
	
	labelbox.add(Box.createHorizontalStrut(20));
	labelbox.add(label1);
	labelbox.add(Box.createHorizontalStrut(210));
	labelbox.add(label2);
	labelbox.add(Box.createHorizontalStrut(200));
	labelbox.add(label3);
	
	b.add(textbox);
	b.add(Box.createVerticalStrut(20));
	b.add(buttonbox);
	b.add(Box.createVerticalStrut(20));
	b.add(labelbox);
	panel.add(b);
	Pcclicent.change(panel);

}
public void chuangeplan(){
	JPanel panel=new JPanel();
	panel.setBounds(0, 0, 1000, 800);
	JTextField text=new JTextField();
	text.setEditable(false);
	JButton button1=new JButton();
	JButton button2=new JButton();
	button1.setPreferredSize(new Dimension(200,199));
	button2.setPreferredSize(new Dimension(200,199));
	button1.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
		}
		
	});
	button2.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
		}
		
	});
	JLabel label1=new JLabel();
	JLabel label2=new JLabel();
	ImageIcon icon1=new ImageIcon();
	ImageIcon icon2=new ImageIcon();
	Box b=Box.createVerticalBox();
	Box textbox=Box.createHorizontalBox();
	Box buttonbox=Box.createHorizontalBox();
	Box labelbox=Box.createHorizontalBox();
	icon1 =new ImageIcon(getClass().getResource("QQ图片20170628220205.png"));
	icon2 =new ImageIcon(getClass().getResource("QQ图片20170628220236.png"));
	button1.setIcon(icon1);
	button2.setIcon(icon2);
	label1.setText("添加计划");
	label2.setText("移除计划");
	text.setText("生产管理->计划管理");
	text.setPreferredSize(new Dimension(500,20));
	
	textbox.add(text);
	JPanel p=new JPanel();
	p.setLayout(new FlowLayout(FlowLayout.LEFT));
	p.add(Box.createHorizontalStrut(10));
	p.add(button1);
	p.add(Box.createHorizontalStrut(55));
	p.add(button2);
	buttonbox.add(p);
	
	JPanel pp=new JPanel();
	pp.setLayout(new FlowLayout(FlowLayout.LEFT));
	pp.add(Box.createHorizontalStrut(80));
	pp.add(label1);
	pp.add(Box.createHorizontalStrut(205));
	pp.add(label2);
	pp.add(Box.createHorizontalStrut(330));
	labelbox.add(pp);
	
	b.add(textbox);
	b.add(Box.createVerticalStrut(20));
	b.add(buttonbox);
	b.add(Box.createVerticalStrut(20));
	b.add(labelbox);
	panel.add(b);
	Pcclicent.change(panel);

}

}

