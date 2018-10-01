package br.com.rruizdasilva;

import java.util.ArrayList;
import java.util.Collection;

public class TestePerformance {
	public static void main(String[] args) {

		Collection<Integer> numeros = new ArrayList<Integer>();

		long inicio1 = System.currentTimeMillis();

		for (int i = 1; i <= 50000; i++) {
			numeros.add(i);
		}
		
		long fim1 = System.currentTimeMillis();
		System.out.println(fim1-inicio1);
		
		long inicio2 = System.currentTimeMillis();

		for (Integer numero : numeros) {
			numeros.contains(numero);	
		}

		long fim2 = System.currentTimeMillis();

		System.out.println(fim2-inicio2);

	}

}
