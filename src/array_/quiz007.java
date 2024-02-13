package array_;

public class quiz007 { //7조문제 따라하기 해결
	public static void main(String[] args) {
		int a [] = new int[] {10,100,1000,10000,100000} ;
		int b [] = new int[] {90,900,9000,90000,900000} ;
		int sum=0;
		
		for(int i= 0 ; i<a.length ; i++) {
			for(i= 0; i<b.length ; i++)
			sum += a[i] + b[i];
			System.out.println("두수의 합 : "+sum);
			sum = 0; //무슨용도?
		}
		
	}

}
