package chap02_variable;

import java.util.Scanner;

public class Report_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//사용자로부터 국어, 수학, 컴퓨터의 점수를 입력받아
		//총점과 평균(소수점 2번째자리까지(반올림)) 출력
		
		System.out.println("국어 수학 컴퓨터의 점수를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		
		int kor = scan.nextInt();
		int math = scan.nextInt();
		int com = scan.nextInt();
		
		int sum = kor+math+com;
		
		System.out.printf("총점, 평균 : %d, %.2f", sum, (float)sum/3 );

	}

}
