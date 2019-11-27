package es.studium.Aleatorio3;

import java.util.Random;

public class Aleatorio3 {
	
	
	
	public static void main(String[]args) {
		
		Random rnd=new Random();
		
		int i,x;
		
		for (i=0;i<10;i++) {
			x=rnd.nextInt(6)+1;
			System.out.println(x);
		}
		
	}

}