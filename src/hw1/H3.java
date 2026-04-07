package hw1;

public class H3 {
	public static void main(String[] args) {
		int time=256559,sec,min,hr,day;	//設定變數
		day=time/60/60/24;				//算天數
		hr=(time/60/60)%24;				//算小時數
		min=(time/60)%60;				//算分鐘數
		sec=time%60;					//算秒數
		System.out.print(day+"天");		//輸出結果
		System.out.print(hr+"小時");		//輸出結果
		System.out.print(min+"分");		//輸出結果
		System.out.print(sec+"秒");		//輸出結果
		//驗算
		//System.out.println(day*24*60*60+hr*60*60+min*60+sec);
	}
}