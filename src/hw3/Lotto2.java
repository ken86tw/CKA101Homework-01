package hw3;
import java.util.Scanner;
/*//Hello World test*/
public class Lotto2 {
//	阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//	厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//	的號碼與總數
//	進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複
	public static void main(String[] args) {
		int count=0,a;
		int result[]=new int[49];
		//System.out.println(i);
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字？(請輸入1~9)");
		int data= sc.nextInt();
		for(int i=1;i<=49;i++) {
			if((i/10!=data)&&(i%10!=data)) 
				result[i-1]=1;
			else
				result[i-1]=0;
		}
		System.out.println("隨機六組號碼是:");
		while(true) {
			a=(int)(Math.random()*49+1);
			if (result[a-1]==1) {
				result[a-1]=0;
				System.out.print(a);
				if(++count==6)
					break;
				System.out.print(" ");
			}
		}
	}
	
	
	
	
	
	
	
}
