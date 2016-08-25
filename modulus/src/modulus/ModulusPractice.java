package modulus;
import java.util.Scanner;
public class ModulusPractice
	{

		public static void main(String[] args)
			{
				exercise1();
				exercise2();
				exercise3();
				exercise4();
			}
		public static void exercise1(){
			Scanner input=new Scanner(System.in);
			System.out.println("give any number");
			int number=input.nextInt();
			if(number%2==0){
				System.out.println("even");
			}
			else{
				System.out.println("odd");
			}
		}
		public static void exercise2(){
			Scanner input=new Scanner(System.in);
			System.out.println("give any year");
			int year=input.nextInt();
			if(year%4==0){
				System.out.println("its a leap year");
			}
			else{
				System.out.println("not a leap year");
			}
		}
		public static void exercise3(){
			int myArray[]={2, 5, -7, 1, 3, 12, 19, -16, 4, 20};
			for(int i=0; i<10; i++){
				if(i%3==2){
					System.out.println(myArray[i]);
				}
			}
		}
	}