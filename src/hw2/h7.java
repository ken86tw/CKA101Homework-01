package hw2;

public class h7 {
	public static void main(String[] args) {
		/*請設計一隻Java程式，輸出結果為以下：
A
BB
CCC
DDDD
EEEEE
FFFFFF
		*/
		for(int i=1;i<=6;i++) {
			for(int j=0;j<i;j++) {
				char tex=0x41;
				tex+=i-1;
				System.out.print(tex);
			}
			System.out.println();
		}
		
		
	}
}
