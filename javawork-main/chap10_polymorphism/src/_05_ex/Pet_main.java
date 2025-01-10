package _05_ex;

public class Pet_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet[] p = {new Cat(), new Dog(), new Frog()};
		
		for(Pet pet : p) {
			System.out.println(pet);
		}
	}

}
