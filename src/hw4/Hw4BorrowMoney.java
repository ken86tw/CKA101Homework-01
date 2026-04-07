package hw4;
import java.util.Scanner;
public class Hw4BorrowMoney {
	
	public static void main(String[] args) {
//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5 個,
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共3 人!」
		int aa[][]= {{25,32,8,19,27},{2500,800,500,1000,1200}};	//設定陣列人跟錢
		int count=0;											//設定變數count計數
		Scanner sc = new Scanner(System.in);		//輸入要借的金額數字
		System.out.println("請輸入欲借的金額數字:");
		int money= sc.nextInt();					//設定變數money存輸入的數字
		System.out.print("有錢可借的員工編號:");
		for(int i=0;i<aa[0].length;i++) {			//迴圈
			if(aa[1][i]>=money) {					//看錢夠不夠
				System.out.print(aa[0][i]+"\t");	//夠的話列出編號
				count++;							//計算人數
			}
		}
		System.out.println("共"+count+"人");
	}
}
