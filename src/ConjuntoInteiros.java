
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
	
	

}
