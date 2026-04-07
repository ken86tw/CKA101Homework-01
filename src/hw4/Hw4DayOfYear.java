package hw4;
import java.util.Scanner;
public class Hw4DayOfYear {
	
	public static void main(String[] args) {
//		請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//		(需將閏年條件加入)
//		(擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入年份:");
		int year= sc.nextInt();
		System.out.println("請輸入月份:");
		int month= sc.nextInt();
		if(month < 1 || month>12) {
			System.out.println("月份輸入錯誤，程式結束");
			return;//中斷程式
			}
		System.out.println("請輸入日期:");
		int day= sc.nextInt();
		
		//判斷閏年
        boolean Leap = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            Leap = true;
        }
		//每個月天數
        int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if (Leap)
            daysInMonth[2] = 29; //二月29天
		if (day < 1 || day > daysInMonth[month]) {
            System.out.println("日期輸入錯誤，程式結束");
            return; //中斷程式
            }
		//計算是該年的第幾天
        int dayOfYear = 0;
        for (int i = 1; i < month; i++)
            dayOfYear += daysInMonth[i];
        dayOfYear += day;
        System.out.println("輸入的日期為該年第 " + dayOfYear + " 天");
	}
}
