package hw5;
import java.util.Random;
import java.util.UUID;
public class Hw5genAuthCode {
//	身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，
//	請設計一個方法genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗
//	證碼，此驗證碼內容包含了英文大小寫與數字的亂數組合
	public static String genAuthCode() {
		//方法一:字串池
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String code = "";												//設定變數存答案
        for(int i=0;i<8;i++)											//找八次
        	code += chars.charAt((int)(Math.random() * chars.length()));//取亂數找出那個位置的字母加入
		return code;													//回傳
		
		//方法二:ASCII取
		/*Random rand = new Random();									//取亂數
        StringBuilder code = new StringBuilder();						//設定物件用來存答案
		//0~9:48~57, A~Z:65~90, a~z:97~122								//ASCII的位置
        while (code.length() < 8) {										//一直取8個
            int ascii = rand.nextInt(122 - 48 + 1) + 48;// 48~122		//取出範圍
            if ((ascii >= 48 && ascii <= 57)||							
            	(ascii >= 65 && ascii <= 90)||
            	(ascii >= 97 && ascii <= 122))			//只保留 0-9、A-Z、a-z 
                code.append((char) ascii);				//加入結果
        }
        return code.toString();*/						//輸出
        
        //方法三:用
	}
	public static void main(String[] args) {
		System.out.println(genAuthCode());				//呼叫方法
	}
}