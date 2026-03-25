package hw2;

public class h4 {
	public static void main(String[] args) {
//		請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100
		int sum=1,i=2;
		while(sum<=100) {
			System.out.println(sum);
			sum=sum+i*2-1;
			i++;
		}
			
	}
}
