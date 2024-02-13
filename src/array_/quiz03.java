package array_;

import java.util.Scanner;

public class quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = {50000, 10000, 1000, 500, 100, 50 , 10, 1};
		System.out.println("금액을 입력하세요");
		int money = sc.nextInt();
		
		for(int i =0; i<arr.length ; i++) {
			if(money/arr[i]>=1)
				System.out.println(arr[i]+"원 짜리 : "+money/arr[i]+"개");
			money = money%arr[i];
		}
		
	}

}
