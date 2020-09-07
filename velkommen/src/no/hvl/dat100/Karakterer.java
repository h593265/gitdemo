package no.hvl.dat100;
import java.util.*;
public class Karakterer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scanner= new Scanner(System.in);

		

		for (int p = 1; p<11; p++) {

		System.out.print("Skriv inn antall poeng: "); 

		int r= scanner.nextInt();

		System.out.print("elev " +p+ ": ");

		

		if (r < 0) {

			System.out.print("Poengsummen må være mellom 0 og 100, skriv inn ny poengsum");

			System.out.println();

			p=p-1;

			

		}

		else if (r > 100) {

			System.out.print("Poengsummen må være mellom 0 og 100, skriv inn ny poengsum");

			System.out.println();

			p=p-1;

		}

		else if (r > 89){

			System.out.print("Karakter A");

			System.out.println();

		}

		else if (r > 79){

			System.out.print("Karakter B");

			System.out.println();

		}

		else if (r > 59){

			System.out.print("Karakter C");

			System.out.println();

		}

		else if (r > 49){

			System.out.print("Karakter D");

			System.out.println();

		}

		else if (r > 39){

			System.out.print("Karakter E");

			System.out.println();

		}

		else if (r< 40){

			System.out.print("Karakter F");	

			System.out.println();

		}

		}

		scanner.close();



}}