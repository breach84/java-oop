import java.util.Scanner;
class calculator{
	public static void main(String a[]){
		int c, d, e , f;
		System.out.println("enter the first number: ");
		Scanner x = new Scanner(System.in);
		int num1 = x.nextInt();
		System.out.println("enter the second number: ");
		Scanner y = new Scanner(System.in);
		int num2 = y.nextInt();
		System.out.println("which operation do you want to perform?\n 1.+\n 2.-\n 3.*\n 4./ \n");
		Scanner s = new Scanner(System.in);
		int z = s.nextInt();
		//System.out.println(z);
		switch(z){
			case 1:
				 c = num1 + num2;
				System.out.println("your answer is: " + c);
				break;
			case 2:
				 d = num1 - num2;
				System.out.println("your answer is: " + d);
				break;
			case 3:
				 e = num1 * num2;
				System.out.println("your answer is: " + e);
				break;
			case 4:
				 f = num1 / num2;
				System.out.println("your answer is: " + f);
				break;
			default: 
				System.out.println("invalid input lol ");
				break;		
	
		}
	}

}
		