package array_;

import java.util.Scanner;

public class quiz004 { //5조문제 따라하기 해결
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr []= new int [6];
		int max = 0;

		for(int i=0 ; i<arr.length ; i++) {
			System.out.println((i+1)+"번째 숫자 입력");
			arr[i] = sc.nextInt();
			while(true) {
				if(arr[i]<=0) {
					System.out.println("다시 입력하세요");
					arr[i] = sc.nextInt();
				}else
					break;

			}
		}
		System.out.println();
		for(int a : arr) {
			System.out.println(a+" ");
		}
		System.out.println("\n");
		
		int index = 0;
		for(int i=0; i<arr.length ; i++) {
			if(arr[i]>max) {
				max= arr[i];
				index = i+1; //식이 이해안감, 위에서 i=0이라해서?
				
			}
		}
		System.out.println("해당 배열의 최댓값은" +index+ "번째 수인"+max+"입니다.");
	}

}
