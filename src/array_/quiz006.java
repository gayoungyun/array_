package array_;

import java.util.Scanner;

public class quiz006 { //2조문제 따라하기 해결, 모르겠음
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("5개 정수 입력 : ");
		int arr []= new int [5];

		int a [] = new int[5];
		for(int i=0 ; i<arr.length ; i++) {
			a[i] = input.nextInt();
		}
		int tmp;
		for(int i= 0 ; i<arr.length ; i++) {
			for(int j = i+1 ; j<arr.length ; j++) {
				if(a[j]>a[i]) {
					tmp= a[j];
					a[j]=a[i];
					a[i]=tmp;
				}
			}
			System.out.println(i+1+"번째 : "+a[i]);
		}

	}
}



