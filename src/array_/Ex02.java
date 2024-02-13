package array_;

public class Ex02 {
	public static void main(String[] args) {
		double dos[] = new double[] {1.111, 2.222, 3.333};
		System.out.println(dos[0]);
		
		System.out.println( dos.length ); //현재의 개수
		for(int i=0 ; i<dos.length ; i++) { // 0부터 시작, 
			System.out.println(i+"."+dos[i]);
		}
			}

}
