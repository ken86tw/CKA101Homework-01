package hw4;
public class Hw4FindPlanetsVowels {
	
	public static void main(String[] args) {
//		有個字串陣列如下(八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
		String planets[]={"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count = 0;
		
		//方法一 初級方法逐字找
		/*for (int i = 0; i < planets.length; i++) {			//找陣列長度
            for (int j = 0; j < planets[i].length(); j++) {		//找字串長度
                char ch = planets[i].charAt(j);					//把每一個字元取出
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')//比對是否有母音
                    count++;									//計數
            }
        }
        System.out.println("母音有"+count+"個");*/				//輸出
		
		//方法二
		for (String word : planets) {							//拿每個字串
			word = word.toLowerCase();							//防呆機制:大寫都先轉小寫
			for (char ch : word.toCharArray()) {				//拆成每個字元
				if ("aeiou".indexOf(ch) != -1) {				//比對是否有母音
					count++;									//計數
					//System.out.println(ch);					//輸出是哪個母音人工再判斷
				}
			}
		}
        System.out.println("母音有"+count+"個");					//輸出
	}
}