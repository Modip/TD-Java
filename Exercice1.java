package sn.modip.tdjava;
import java.util.Scanner ;

public class main {

	public static void main (String[] args) {
	
	 System.out.print(" Entrez le 1er nombre: ");
	 Scanner nombre1=new Scanner(System.in);
	int n1=nombre1.nextInt();
	 System.out.print(" Entrez le 2em nombre: ");
	 Scanner nombre2=new Scanner(System.in);
	 int n2=nombre2.nextInt();
	 int q = n1/n2 ;
	 int r = n1 % n2 ;
	 
	 System.out.println(" Le quotient des deux entiers est egal à : "+ q );
	 System.out.println(" Le reste de la division est: "+ r);
	}

}

