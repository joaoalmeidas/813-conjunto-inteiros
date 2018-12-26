
public class ConjuntoInteirosTeste {

	public static void main(String[] args) {
		
		boolean[] vazio = new boolean[101];
		
		boolean[] dezPrimeiros = {true, true, true, true, true, true, true, true, true, true, true,
								  false, false, false, false, false, false, false, false, false, false,
								  false, false, false, false, false, false, false, false, false, false,
								  false, false, false, false, false, false, false, false, false, false,
								  false, false, false, false, false, false, false, false, false, false,
								  false, false, false, false, false, false, false, false, false, false,
								  false, false, false, false, false, false, false, false, false, false,
								  false, false, false, false, false, false, false, false, false, false,
								  false, false, false, false, false, false, false, false, false, false,
								  false, false, false, false, false, false, false, false, false, false};
		
		boolean[] dezPrimeirosCopia = {true, true, true, true, true, true, true, true, true, true, true,
				  false, false, false, false, false, false, false, false, false, false,
				  false, false, false, false, false, false, false, false, false, false,
				  false, false, false, false, false, false, false, false, false, false,
				  false, false, false, false, false, false, false, false, false, false,
				  false, false, false, false, false, false, false, false, false, false,
				  false, false, false, false, false, false, false, false, false, false,
				  false, false, false, false, false, false, false, false, false, false,
				  false, false, false, false, false, false, false, false, false, false,
				  false, false, false, false, false, false, false, false, false, false};
		
		boolean[] pares = {false, false, true, false, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true, false, true};
		
		boolean[] impares = {false, true, false, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true, false, true,
				false, true, false, true, false, true, false, true, false, true, false};
		
		ConjuntoInteiros conjuntoVazio = new ConjuntoInteiros(vazio);
		ConjuntoInteiros conjuntoDezPrimeiros = new ConjuntoInteiros(dezPrimeiros);
		ConjuntoInteiros conjuntoPares = new ConjuntoInteiros(pares);
		ConjuntoInteiros conjuntoImpares = new ConjuntoInteiros(impares);
		ConjuntoInteiros conjuntoUniaoParImpar = ConjuntoInteiros.uniao(conjuntoPares, conjuntoImpares);
		ConjuntoInteiros conjuntoInterseccaoParesDezPrimeiros = ConjuntoInteiros.interseccao(conjuntoDezPrimeiros, conjuntoPares);
		ConjuntoInteiros conjuntoDezPrimeirosCopia = new ConjuntoInteiros(dezPrimeirosCopia);
		
		System.out.println("Conjunto Inteiros Boolean\n");
		
		System.out.println("Conjunto Vazio");
		System.out.println(conjuntoVazio.toString());
		
		System.out.println("Conjunto de 0 a 10");
		System.out.println(conjuntoDezPrimeiros.toString());
		
		System.out.println("Conjunto pares");
		System.out.println(conjuntoPares.toString());
		
		System.out.println("Conjunto impares");
		System.out.println(conjuntoImpares.toString());
		
		System.out.println("Conjunto união par e impar");
		System.out.println(conjuntoUniaoParImpar.toString());
		
		System.out.println("Conjunto intersecção entre pares e dez primeiros.");
		System.out.println(conjuntoInterseccaoParesDezPrimeiros.toString());
		
		System.out.println("\nConjunto 10 primeiros");
		System.out.println(conjuntoDezPrimeiros.toString()+"\tÉ igual ao conjunto?");
		
		System.out.println("Conjunto 10 primeiros cópia");
		System.out.println(conjuntoDezPrimeirosCopia.toString()+"\t"+conjuntoDezPrimeiros.saoIguais(conjuntoDezPrimeirosCopia));
		
		System.out.println("Conjunto impares");
		System.out.println(conjuntoImpares.toString()+"\n"+conjuntoDezPrimeiros.saoIguais(conjuntoImpares));
		
		System.out.println("\nAdição de novo elemento:80");
		conjuntoDezPrimeiros.insereElemento(80);
		System.out.println(conjuntoDezPrimeiros.toString());
		
		System.out.println("Remoção de um elemento:10");
		conjuntoDezPrimeiros.deletaElemento(10);
		System.out.println(conjuntoDezPrimeiros.toString());
	}

}
