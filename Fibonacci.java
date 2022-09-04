package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int FirstNum = 0;
		int SecNum = 1;
		  
		int sum=0;  
 			for (int i=3;i<11;i++) {
				sum = FirstNum+SecNum;
				System.out.println(sum);
FirstNum=SecNum;
SecNum=sum;

	}

		}	
	}