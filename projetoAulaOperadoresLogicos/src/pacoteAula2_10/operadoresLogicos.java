package pacoteAula2_10;

public class operadoresLogicos {

	public static void main(String[] args) {		
		boolean p, q, s;
		p = false;	q = false;
		s = p && q;
		System.out.printf("\np: %b; q: %b; s: %b.", p, q, s);		
		
		p = false;	q = true;
		s = p && q;
		System.out.printf("\np: %b; q: %b; s: %b.", p, q, s);	
		
		p = true;	q = false;
		s = p && q;
		System.out.printf("\np: %b; q: %b; s: %b.", p, q, s);	
		
		p = true;	q = true;
		s = p && q;
		System.out.printf("\np: %b; q: %b; s: %b.", p, q, s);	

	}

}
