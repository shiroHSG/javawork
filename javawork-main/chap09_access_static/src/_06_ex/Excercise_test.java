package _06_ex;

public class Excercise_test {

	public static void main(String[] args) {
		
		Excercise ex1 = Excercise.getInstance();
	
	}

}

class Excercise {
	private static Excercise excercise = new Excercise();
	
	private Excercise() {}
	
	public static Excercise getInstance() {
		return excercise;
	}
}
