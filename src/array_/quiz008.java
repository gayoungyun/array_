package array_;

public class quiz008 { //7조문제 해결
	public static void main(String[] args) {
		int [] arr = {5,1,9,3,7,2};
		int max = arr[0], min = arr[0];
		
		for(int i = 0 ; i<arr.length ; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("최댓값 : "+max);
		System.out.println("최솟값 : "+min);
	}

}
