package array_;

import java.util.Scanner;

public class quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 양의 정수 10개 입력");
		int []arr = new int[10];
		
		for (int i=0 ; i<arr.length ; i++) {
			arr[i] =  sc.nextInt();
		}
		System.out.println("3의 배수");
		for(int i=0 ; i< arr.length ; i++) {
			if(arr[i]%3 ==0 ) {
				System.out.println(arr[i]+" ");
			}
		}
	}
}
