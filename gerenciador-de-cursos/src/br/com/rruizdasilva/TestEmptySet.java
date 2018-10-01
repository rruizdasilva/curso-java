package br.com.rruizdasilva;

import java.util.Collections;
import java.util.Set;

public class TestEmptySet {

	public static void main(String[] args) {
		Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo"); //o que acontece aqui?

	}

}
