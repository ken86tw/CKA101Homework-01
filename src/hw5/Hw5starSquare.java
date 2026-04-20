package hw5;
import java.util.Scanner;
public class Hw5starSquare {
//	請設計一個方法為starSquare(int width, int height)，
//	當使用者鍵盤輸入寬與高時，即會印出對應的*長方形
	public static void starSquare(int width, int height) {	//設計方法
		for(int i=0;i<height;i++) {							//高
			for(int j=0;j<width;j++) {						//寬
				System.out.print("*");						//輸出
			}
			System.out.println();							//換行
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				//輸入
		System.out.print("請輸入寬 高: ");					
		int width = sc.nextInt();							//第一個輸入儲存為寬
		int height = sc.nextInt();							//第二個輸入儲存為高
        starSquare(width, height);							//呼叫使用方法
	}	
}