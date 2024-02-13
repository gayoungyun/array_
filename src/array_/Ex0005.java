package array_;

import java.util.Scanner;

public class Ex0005 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[] {10, 54, 13, 17, 25, 30};
		String odd_even= null;
		System.out.println("짝수, 홀수 입력 : ");
		odd_even = input.next();

		for(int i=0; i<arr.length ; i++) {
			if(odd_even.equals("짝수")) {
				if(arr[i]%2 ==0) {
					System.out.println("짝수 : "+arr[i]);
				}
			}
			else {
				if(arr[i]%2 != 0) {
					System.out.println("홀수 : "+arr[i]);
				}
			}
		}
		
		System.out.println("------------------");
		System.out.println("짝수, 홀수 입력 : ");
		odd_even = input.next();
		//if(arr[0]/%2 == 0 && odd_even.equals("짝수"))
			for(int i = 0;i <arr.length ;i++) {
				if(odd_even.equals("짝수")&& i%2 ==0) {
					System.out.println(i+"."+arr[i]);
			}else if(odd_even.equals("홀수")&& i%2 ==1)
				System.out.println(i+"."+arr[i]);
		}
			System.out.println("--------------");
	}
}
