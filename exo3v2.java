package sn.modip.tdjava;

import java.util.Scanner;

public class exo3v2 {

	public static void main(String[] args) {
		System.out.println("Donner la 1er resistance ");
		Scanner n1=new Scanner(System.in);
		float R1=n1.nextFloat() ;
		
		System.out.println("Donner la 2em resistance ");
		Scanner n2=new Scanner(System.in);
		float R2=n2.nextFloat();

		System.out.println("Donner la 3em resistance ");
		Scanner n3=new Scanner(System.in);
		float R3=n3.nextFloat();
		
		float RS=R1+R2+R3;
		float RP=(R1*R2*R3)/((R1*R2)+(R1*R3)+(R2*R3));
		System.out.println("la resistance en serie est : " + RS);
		System.out.println("la resistance en parallele est : " + RP);
		
		}

		
	
		

	}

}