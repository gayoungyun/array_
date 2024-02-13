package array_;

public class quiz001 { // 5조문제해결
	public static void main(String[] args) {
		int [] arr = new int [] {5, 3, 2, 7, 4, 8, 6, 10, 9, 10};
		int max = arr[0];
		int min = arr[0];

		for(int i = 0 ; i<arr.length ; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}if(min>arr[i]) {
				min = arr[i];
			
				}// 괄호 위치
			}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);

		}
}