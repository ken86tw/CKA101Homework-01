package hw3;
import java.util.Arrays;
import java.util.Scanner;

public class DetermineTriangle {
//	請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形
//	進階功能：加入直角三角形的判斷
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int[] data = new int[3];
		System.out.println("請輸入三角形邊長:");
		for(int i=0;i<data.length;i++) {
			data[i]= sc.nextInt();
		}
		Arrays.sort(data);
//		for(int i = 0; i < data.length; i++) 
//			System.out.println(data[i]);
		//判斷三角形種類
		if (data[0] + data[1] <= data[2]) {
            System.out.println("不是三角形");
			a=1;}
		else if(data[0]==data[1]&&data[1]==data[2]) 
            System.out.println("正三角形");
		else if(data[0]==data[1]||data[1]==data[2])
            System.out.println("等腰三角形");
		else
            System.out.println("其它三角形");
		//直角三角形的判斷
		if(a!=1)
			if (data[2] * data[2] == data[0] * data[0] + data[1] * data[1]) 
			    System.out.println("直角三角形");
			else if (data[2] * data[2] > data[0] * data[0] + data[1] * data[1]) 
			    System.out.println("鈍角三角形");
			else 
			    System.out.println("銳角三角形");
	}
}
