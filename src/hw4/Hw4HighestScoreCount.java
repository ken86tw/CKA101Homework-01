package hw4;
public class Hw4HighestScoreCount {
	public static void main(String[] args) {
//		班上有8位同學，他們進行了6次考試
//		請算出每位同學考最高分的次數
		int [][]scores= {{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75}};		//設定分數
		int numExams = scores.length;     			//查詢層數(考試次數)
        int numStudents = scores[0].length; 		//查詢個數(幾位同學)
        int Count[] = new int[numStudents]; //設定變數儲存每個學生考最高分的次數

        //每次考試
        for (int exam = 0; exam < numExams; exam++) {
            int maxScore = scores[exam][0];
            //找出考試的最高分
            for (int student = 1; student < numStudents; student++) 
                if (scores[exam][student] > maxScore) 
                    maxScore = scores[exam][student];
            
            //統計誰考到最高分
            for (int student = 0; student < numStudents; student++) 
                if (scores[exam][student] == maxScore) 
                	Count[student]++;
        }
        //輸出結果
        for (int student = 0; student < numStudents; student++) {
            System.out.println((student + 1) + " 號考最高分的次數: " + Count[student]);
        }
	}
}