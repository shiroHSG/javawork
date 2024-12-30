package chap02_variable;

public class Format_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "www.google.com";
		
		float f1 = 0.10f;
		double d1 = 1.23456789;
		
		System.out.printf("%f", f1);
		System.out.println();
		
		System.out.printf("%10s\n",url);
		
		//.n 몇글자까지 출력
		System.out.printf("%.10s\n",url);
		
		int octNum = 010;
		System.out.printf("%o, %d", octNum, octNum);

	}

}
