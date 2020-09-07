package no.hvl.dat100;
import java.util.*;
public class fakultet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);

		System.out.print("Skriv inn heltall n: ");  

		int n= scanner.nextInt();

		scanner.close();

		

		int x = 1;

		for (int i = 1; i <= n; i++) {

			x = x*i;

}

		System.out.print("n! = " + x);

}}