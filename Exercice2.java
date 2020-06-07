package sn.modip.tdjava;
import java.util.Scanner;

public class Exo2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print(" Entrez le rayon: ");
		Scanner nombre=new Scanner(System.in);
		float r=nombre.nextFloat();
		float s ;
		float p ;
		p=(float) (3.14*r) ;
		s= (float) (3.14*r*r) ;
		System.out.println("Le périmètre du cercle est" + p +"et la surface est"+ s) ;
		
	}

}