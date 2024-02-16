package array_;

import java.util.Scanner;

public class quiz009 { //7조문제 따라하기 해결
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("배열 인덱스 수 입력");
		int n = input.nextInt();
		int arr[]= new int[n];
		int sum = 0;
		String odd;
		
		System.out.println("짝수, 홀수 입력 : ");
		odd = input.next();
		for(int i = 0 ; i<n; i++) {
			System.out.print("배열의 arr["+i+"]번째 정수 입력 : ");
			arr[i]= input.nextInt();
			sum +=arr[i];
		}
		System.out.println("배열 전체 합 : "+sum);
		sum = 0;
		for (int i=0; i<n; i++) {
			if(odd.equals("짝수")) {
				if(arr[i]%2 ==0) {
					sum +=arr[i];
				}
			}else {
				if(arr[i]%2==1) {
					sum +=arr[i];
				}
			}
		}
		if(odd.equals("짝수")) {
			System.out.println("짝수의 합 : "+sum);
		}else {
			System.out.println("홀수의 합 : "+sum);
		}
				
	} 
	

}
