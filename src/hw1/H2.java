package hw1;

public class H2 {
		public static void main(String[] args) {
			int eggs=200,dozen=12;						//設定雞蛋數量,一打幾個
			System.out.println("一共:"+eggs/dozen+"打");	//算有幾打
			System.out.println("剩餘:"+eggs%dozen+"顆");	//算去掉打數剩餘的顆數
		}
}