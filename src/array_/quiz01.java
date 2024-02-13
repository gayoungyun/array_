package array_;

public class quiz01 {
	public static void main(String[] args) {
		int arr[]= new int[] {12,56,23,39};
		int sum = 0;
		int max = arr[0];
		
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		System.out.println("sum : "+sum);
		
		for(int k = 0 ; k < arr.length ; k++) {
			if(max < arr[k]) {
				max = arr[k];
			}
		}
		System.out.println("max = " +max);
	}

}
