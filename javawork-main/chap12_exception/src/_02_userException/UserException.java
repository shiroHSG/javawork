package _02_userException;

import java.util.Scanner;

// 사용자 정의 예외 클래스는 반드시 Exception 상속받아 사용
public class UserException extends Exception{
	UserException() { }
	UserException(String message) {
		super(message);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int sum = num1 + num2;
		
		try {
			if(sum<0) {
				UserException ue = new UserException("sum은 "+ sum + "이므로 음수");
				throw ue;
			}
			else {
				System.out.println("sum : " + sum);
			}
		
		}catch(UserException e) {
			System.out.println(e.getMessage());
		}
	}
}
