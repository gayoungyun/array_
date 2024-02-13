package array_;

public class quiz04 {
	public static void main(String[] args) {
		int[] arr= {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		
		for (int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]);
			for(int j= 0 ; j<arr[i] ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
