package hw1;

public class H3 {
	public static void main(String[] args) {
		int time=256559,sec,min,hr,day;
		day=time/60/60/24;
		hr=(time/60/60)%24;
		min=(time/60)%60;
		sec=time%60;
		System.out.print(day+"天");
		System.out.print(hr+"小時");
		System.out.print(min+"分");
		System.out.print(sec+"秒");
		//驗算
		//System.out.println(day*24*60*60+hr*60*60+min*60+sec);
	}
}
