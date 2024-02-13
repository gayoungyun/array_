package array_;


public class quiz002 {// 1조문제 따라하기 해결
	public static void main(String[] args) {
		String arr[] = new String [] {"a","b","c","d","e"};
		String brr[] = arr.clone(); //arrayName.clone()이용 <array를 복사>
		
		for(int i =0; i<5 ; i++) {
			arr[i]= brr[(arr.length-1)-i]; //식이 이해안감
			System.out.println(arr[i]);
		}

	}
}


