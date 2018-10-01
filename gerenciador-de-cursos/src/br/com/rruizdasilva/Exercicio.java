package br.com.rruizdasilva;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercicio {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<>();

		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimentel");
		pessoas.put(19, "Silvio Mattos");
		pessoas.put(23, "Romulo Henrique");

//		 Set chavesPessoas = pessoas.keySet();
// forma 1		
//		 chavesPessoas.forEach((chave) -> System.out.println(chave));

// forma 2
//		for (Object chave : chavesPessoas) {
//			System.out.println(chave);
//		}
		
		pessoas.keySet().forEach(idade -> System.out.println(idade));

	}

}
