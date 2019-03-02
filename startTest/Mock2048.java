import java.util.Arrays;
import java.util.Scanner;

//		take input from user - 1/2		 
//		 0,0,2,3,5,5,10,10,12,0,0,2,0 <<
//		 0,0,2,3,10,0,20,0,12,0,0,2,0
//		 2,3,10,20,12,2,0,0,0,0,0,0,0
//		 
//		 
//		 0,0,2,3,5,5,10,10,12,0,0,2,0 <<
//		 
//		 0,0,0,0,0,0,0,2,3,10,20,12,2 <<

public class Mock2048 {

	public static void main(String args[]) {
		int arr[] = { 0, 0, 2, 3, 5, 5, 10, 10, 12, 0, 0, 2, 0 };
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1 or 2");
			int input = sc.nextInt();
			int res[] = new int[arr.length];
			Arrays.fill(res, 0);
			if (input == 1) {
				int pointer = 0;
				for (int i = 0; i < arr.length - 1; i++) {
					if (arr[i] == arr[i + 1] && arr[i]!=0) {
						res[pointer++] = arr[i] + arr[i];
						//arr[i + 1] = 0;
						i++;
					} else if (arr[i] != 0)
						res[pointer++] = arr[i];
				}
				for (int i = 0; i < arr.length; i++) {
					System.out.print(res[i] + " ");
				}
			}
			/*
			 * }else if (input== 2) { System.out.println(res); }
