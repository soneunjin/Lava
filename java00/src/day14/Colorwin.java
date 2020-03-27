package day14;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * �� Ŭ������ JButton�� �̺�Ʈ ó���� �Ҷ� ����ϴ� ���� ���� Ŭ������ ������ ������ ������ Ŭ����
 * @author ������
 * @since	2020.03.26
 * @version	v.1.0
 * @see
 * 			JFrame, JPanel, JButton, ActionListener
 */


public class Colorwin {
	/*
	  	�ڹٿ��� GUI �� ����� �ִ� ������ ������ �ϰ� �ִµ�
	  	javax.swing ��Ű���� java.awt ��Ű�� �̴�.
	  	
	  	�� Ŭ���������� windows�� â�� ������ִ� JFrame �� ����ؼ� â�� �����
	  	���ο� JPanel�� �̿��ؼ� ä�� ��
	  	JPannel�� ������ �����ϰ�
	  	�׸���  JButton�� ����� �ο��غ���.
	 */
	
	// ����� ��� ��������
	JFrame frame;
	JPanel pan1, pan2;
	JButton cBtn, eBtn, tBtn;
	
	public Colorwin() {
		// ���� �ʱ�ȭ
		// frame ��ü ������ְ�
		frame = new JFrame();
		// frame â�� x ��ư ������ �����ϴ� ��� �ο�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("�ƹ��͵� �ƴմϴ�!");
		
		pan1 = new JPanel();
		pan1.setBackground(Color.BLUE);
		pan2 = new JPanel();
		pan2.setBackground(Color.BLUE);
		
		cBtn = new JButton("Color");
		eBtn = new JButton("EXIT");
		tBtn = new JButton("Title");
		
		
		// �̺�Ʈ ��ü �����
		TitleEvt evt1 = new TitleEvt(this);
		// tBtn�� �̺�Ʈ��ü �־��ְ�
		tBtn.addActionListener(evt1);
		eBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		cBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// �� �Լ��� Į���ư�� Ŭ���� �Ǹ� ����Ǵ� �Լ���
				// Į�� �����ϰ� ���� JPanel�� ������ ��������ִ� �Լ��̴�.
				
				// 1. ���� Į�� �����ϰ� �����.
				int red = (int)(Math.random()*256);
				int green = (int)(Math.random()*256);
				int blue = (int)(Math.random()*256);
				
				// 2. Į���� ������Ҵ� ��������� Į�� ������.
				Color color = new Color(red,green,blue);
				
				// 3. ������� Į�� pan1, pan2���� ������.
				pan1.setBackground(color);
				pan2.setBackground(color);
			}
			
		});
		
		pan2.add(cBtn);
		pan2.add(eBtn);
		pan2.add(tBtn);
		
		
		frame.add(pan1,BorderLayout.CENTER);
		frame.add(pan2,BorderLayout.SOUTH);
		
		// ������ �ο��ϰ�
		frame.setSize(500,500);
		frame.setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		new Colorwin();
	}

	class TitleEvt implements ActionListener {
		Colorwin main;
		public TitleEvt() {}
		public TitleEvt(Colorwin main) {
			this.main = main;
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// ���� Ÿ���� �Է¹޴´�.
//			String title = JOptionPane.showInputDialog("Ÿ��Ʋ�� �Է��ϼ���!");
//			main.frame.setTitle(title);
			main.frame.setTitle(JOptionPane.showInputDialog("Ÿ��Ʋ�� �Է��ϼ���!"));
			
		}
		
		
	}
	
	
	
}
