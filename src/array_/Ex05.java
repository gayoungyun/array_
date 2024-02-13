package array_;

public class Ex05 { //다차원 배열 잘 안쓰임
	public static void main(String[] args) {
		int arr[][]= new int [][] {
			{10,20,30,3},
			{40,50,60,4},
			{70,80,90,5},
			
		};
		/*System.out.println(arr[0][0]);
		System.out.println(arr[1][2]);
		System.out.println(arr.length); //세로줄 개수
		System.out.println(arr[0].length); // 가로줄 개수
		System.out.println("==========");*/
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int k=0 ; k<arr[i].length ; k++) {
				System.out.print(arr[i][k]+" ");
			}
			/*
			System.out.println(arr[i][0]);
			System.out.println(arr[i][1]);
			System.out.println(arr[i][2]);
			System.out.println(arr[i][3]);
			*/
			System.out.println("----------");
		}
	}

}
