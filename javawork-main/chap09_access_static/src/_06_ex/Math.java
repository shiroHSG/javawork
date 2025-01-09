package _06_ex;

public class Math {

	int max(int[] arr) {
		int m = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(m<arr[i]) {
				m = arr[i];
			}
		}
		return m;
	}
	
	int min(int[] arr) {
		int m = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(m>arr[i]) {
				m = arr[i];
			}
		}
		return m;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,5,7,9,6,4};
		Math math = new Math();
		System.out.println(math.max(arr));
		System.out.println(math.min(arr));
		
		
	}

}
