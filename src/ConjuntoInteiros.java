import java.util.Arrays;

public class ConjuntoInteiros {
	
	private boolean[] inteiros = new boolean[101];
	
	public ConjuntoInteiros() {
		
	}
	
	public ConjuntoInteiros(boolean[] inteiros) {
		this.inteiros = inteiros;
	}

	public boolean[] getInteiros() {
		return inteiros;
	}

	public void setInteiros(boolean[] inteiros) {
		this.inteiros = inteiros;
	}
	
	
	public static ConjuntoInteiros uniao(ConjuntoInteiros inteiros1, ConjuntoInteiros inteiros2) {
		
		ConjuntoInteiros uniao = new ConjuntoInteiros();
		
		for(int i = 0; i < uniao.getInteiros().length; i++) {
			
			if(inteiros1.getInteiros()[i] == true || inteiros2.getInteiros()[i] == true) {
				
				uniao.getInteiros()[i] = true;
				
			}
			
		}
		
		return uniao;
		
	}
	
	public static ConjuntoInteiros interseccao(ConjuntoInteiros inteiros1, ConjuntoInteiros inteiros2) {
		
		ConjuntoInteiros interseccao = new ConjuntoInteiros();
		
		for(int i = 0; i < interseccao.getInteiros().length; i++) {
			
			if(inteiros1.getInteiros()[i] == true && inteiros2.getInteiros()[i] == true) {
				
				interseccao.getInteiros()[i] = true;
				
			}
			
		}
		
		return interseccao;
		
	}
	
	public void insereElemento(int numero) {
		
		getInteiros()[numero] = true;
		
	}
	
	public void deletaElemento(int numero) {
		
		getInteiros()[numero] = false;
		
	}
	
	public String toString() {
		
		String elementos = "";
		
		for(int i = 0; i < getInteiros().length; i++) {
			
			if(getInteiros()[i] == true) {
				
				elementos += String.format("%d  ", i);
				
			}
			
		}
		
		return elementos == "" ? "---" : elementos;
		
	}
	
	public String saoIguais(ConjuntoInteiros c) {
	
		if(Arrays.equals(getInteiros(), c.getInteiros())) {
			
			return "Sim";
			
		}else {
			
			return "Não";
			
		}
		
	}
	
	

}
