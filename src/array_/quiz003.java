package array_;

import java.util.Arrays;
import java.util.Scanner;

public class quiz003 {// 4조문제, 정답 적혀있는 식이 이해안된다
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr []= new int[5];
		
		System.out.println("숫자 5개 입력하세요");
		for(int i=0; i<5 ; i++) {
			arr[i]= input.nextInt();
		}
		Arrays.sort(arr);//오름차순 함수
		System.out.println("작은 수부터 출력 : "+Arrays.toString(arr));
		
	}

}
