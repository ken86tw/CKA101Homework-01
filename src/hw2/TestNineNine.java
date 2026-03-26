package test;

public class TestNineNine {

	public static void main(String[] args) {
		
		//for+while
		for(int i=1;i<=9;i++) {
			int j=1;
			while(j<=9) {
				System.out.print (i+"*"+j+"=");
				System.out.print(i*j+"\t");
				j++;
			}
			System.out.println();
		}
		
		
		//for+do while
		/*for(int i=1;i<=9;i++) {
			int j=1;
			do {
				System.out.print (i+"*"+j+"=");
				System.out.print(i*j+"\t");
				j++;
			}while(j<=9);
			System.out.println();
		}*/
		
		//while+do while
		/*int i=1;
		while(i<=9){
			int j=1;
			do {
				System.out.print (i+"*"+j+"=");
				System.out.print(i*j+"\t");
				j++;
			}while(j<=9);
			System.out.println();
			i++;
		}*/
		
	}
}
