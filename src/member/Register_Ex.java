package member;


import java.util.Scanner;

import member.model.Register;

public class Register_Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//3명 회원을 가입하는 프로그램
		
		System.out.print("가입할 회원 수를 입력해주세요 > ");
		int count = sc.nextInt();
		
		System.out.println("===== 회원가입 프로그램 =====");
						
		Register[] reg = new Register[count];
		for(int i = 0; i < reg.length; i++) {
			reg[i] = new Register(); //0번째 객체 생성
			
			System.out.print("아이디 입력 : ");
			String uid = sc.next();
			reg[i].setUserid(uid);
			
			System.out.print("비밀번호 입력 : ");
			String pwd = sc.next();
			reg[i].setPasswd(pwd);
		}
		
		System.out.println("========== 회원을 출력합니다. ==========");
		for(Register r : reg) {
			System.out.println(r.disp());
		}

//		reg[0].setUserid("user001");
//		reg[0].setPasswd("12345");
//		
//		reg[1].setUserid("user002");
//		reg[1].setPasswd("12345");
//		
//		reg[2].setUserid("user003");
//		reg[2].setPasswd("12345");
		
		
		
		
	}

}
