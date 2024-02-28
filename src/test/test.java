package test;
import main_code.tri_insertion;
import java.io.ByteArrayInputStream;
public class test {
	
	public static void test1() {
		String donnee = "facile";
		String oracle = "acefil";
		
		ByteArrayInputStream input = new ByteArrayInputStream(donnee.getBytes());
		System.setIn(input);
		
		tri_insertion tri_insertion = new tri_insertion();
		if(tri_insertion.anagramme().equals(oracle))
			System.out.println("Test avec la valeur '" + donnee + "' réussi");
		else
			System.out.println("Test avec la valeur  '" + donnee + "' échoué");
		
	}
	
	public static void test2() {
		String donnee = "a";
		String oracle = "a";
		
		ByteArrayInputStream input = new ByteArrayInputStream(donnee.getBytes());
		System.setIn(input);
		
		tri_insertion tri_insertion = new tri_insertion();
		if(tri_insertion.anagramme().equals(oracle))
			System.out.println("Test avec la valeur '" + donnee + "' réussi");
		else
			System.out.println("Test avec la valeur '" + donnee + "' échoué");
		
	}
	
	public static void test3() {
		String donnee = " ";
		String oracle = " ";
		
		ByteArrayInputStream input = new ByteArrayInputStream(donnee.getBytes());
		System.setIn(input);
		
		tri_insertion tri_insertion = new tri_insertion();
		if(tri_insertion.anagramme().equals(oracle))
			System.out.println("Test avec la valeur '" + donnee + "' réussi");
		else
			System.out.println("Test avec la valeur '" + donnee + "' échoué");
		
	}
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
}
