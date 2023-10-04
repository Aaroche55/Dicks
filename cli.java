package com.dicks;
import com.dicks.Functions;
import java.util.Scanner;
public class cli {

	public static void main(String[] args) {

    while(true){
		System. out.println("Choose between the three following options:");
		System.out.println("1: Add two integers");
		System.out.println("2: Multiply two integers");
		System.out.println("3: Exit");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();


    switch(option){
      case 1: {
        int lhs = scanner.nextInt();
        int rhs = scanner.nextInt();

        int sum = Functions.add(lhs, rhs);
        System.out.format("%d + %d = %d", lhs, rhs, sum);
      }
      case 2: {
        int lhs = scanner.nextInt();
        int rhs = scanner.nextInt();
        int result = Functions.mul(lhs, rhs);
        System.out.format("%d x %d = %d", lhs, rhs, result);
      }
      case 3: break;
      default: System.out.println("Unrecognized option: " + option);
    }
      System.out.println();
	}
  }

}
