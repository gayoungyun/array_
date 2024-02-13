package array_;

import java.util.Scanner;

public class quiz005 {// 2조문제 해결
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("10개 정수 입력 : ");
		int arr[] = new int [10]; // 위치 확인
		
		for(int i=0 ; i<arr.length ; i++) { 
			arr[i] = input.nextInt();
		}
		for(int i=0 ; i<arr.length ; i++) { 
			if (arr[i]%3 == 0) {
				System.out.println(arr[i]+" ");
			}
		}
	}

}
