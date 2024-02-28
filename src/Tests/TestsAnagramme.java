package Tests;
import java.io.ByteArrayInputStream;

import MainCode.Exercice1;
public class TestsAnagramme {

	public static void testFacile() {
		String donnee="facile";
		String oracle="acefil";
		
		ByteArrayInputStream input = new ByteArrayInputStream(donnee.getBytes());
		System.setIn(input);
		
		Exercice1 testExercice1=new Exercice1();
		System.out.println(Exercice1.main());
	}
	
	public static void main(String[] args) {
		testFacile();
		
	}

}
