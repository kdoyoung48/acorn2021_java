package test.frame01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainClass {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		//제목
		f.setTitle("나의 프레임");
		//크기
		f.setSize(500, 300);
		//위치
		f.setLocation(100, 100);
		//창닫기(X) 를 누르면 자동으로 프로세스가 종료 되도록 설정 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//배치메니저를 사용하지 않겠다(절대 좌표에 절대 크기로 배치하겠다)
		f.setLayout(null);
		//버튼 객체 생성
		JButton btn=new JButton("눌러보셈");
		//버튼의 위치와 크기 지정
		btn.setBounds(50, 50, 100, 40);
		//프레임에 버튼 추가하기
		f.add(btn);
		//프레임을 보이게 한다. 
		f.setVisible(true);
		
		//ActionListener  인터페이스 type 의 참조값 얻어내기 
		ActionListener listener=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌렀넹?");
				//JOptionPane 클래스의 static 메소드를 이용해서 알림창 띄우기 
				// .showMessageDialog(프레임의 참조값, 띄울 문자열)
				JOptionPane.showMessageDialog(f, "버튼을 눌렀넹?");
			}
		};
		//버튼에 액션 리스너 등록하기 
		btn.addActionListener( listener );
		
		//버튼객체 생성해서 
		JButton btn2=new JButton("merong");
		//위치와 크기를 설정하고 
		btn2.setBounds(200, 50, 100, 40);
		//프레임에 추가 하기 
		f.add(btn2);
		/*
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "약올리지마!");
			}
		});
		*/
		//람다식을 활용하면 아래와 같다 
		btn2.addActionListener((e)->{
			JOptionPane.showMessageDialog(f, "약올리지마!");
		});
	}
}






