import java.util.Scanner;
import java.util.ArrayList;

public class Module4 {
	
	public static void main(String[] args) {
		double total = 0.0;
		double avg = 0.0;
		double max = 0;
		double min;
		double rate = .20;
		double interest = 0.0;
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> numList = new ArrayList<Double>();
			while (counter < 5) {
				System.out.println("Please enter a number");
				String input = sc.nextLine();
				try { 
					double num = Double.parseDouble(input);
					numList.add(num);
				} catch (NumberFormatException e) {
				System.out.println("That was not a valid entry.");
				}
				counter += 1;

			}
			sc.close();
			min = numList.get(0);
			for (int x = 0 ; x < numList.size(); x ++) {
				total += numList.get(x);
				if (numList.get(x) > max) {
				max = numList.get(x);
				}
				if (numList.get(x) < min) {
				min = numList.get(x);
				}
			}
			System.out.println("The total is " + total);
			avg = total / numList.size();
			System.out.println("The average is " + avg);
			System.out.println("The maximum is " + max);
			System.out.println("The minimum is " + min);
			interest = total * rate;
			System.out.println("The interest is " + interest);
			}
		}

