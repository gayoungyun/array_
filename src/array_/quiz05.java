package array_;

import java.util.Scanner;

public class quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][]a= new String [][] {{"Chair","의자"},{"Computer","컴퓨터"},{"Integer","정수"}};
		int i;
		
		for(i=0; i<a.length ; i++) {
			System.out.println("Q%d. %s의 뜻은?", i+1, a[i][0]);
			
			if(a[i][1].equals(sc.next())) {
				System.out.println("정답입니다.\n");
			}else {
				System.out.println("틀렸습니다. \n정답은 %s입니다. \n\n", a[i][1]);//??
			}
		}
	}

}
