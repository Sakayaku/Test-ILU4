package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class test {
	
	public static void test1() {		
		try {
		    File file = new File(".\\src\\test\\fichier_test.txt");
			FileReader fileReader = new FileReader(file.getPath());
			BufferedReader reader = new BufferedReader(fileReader);
			String line = reader.readLine();
			
			while (line != null) {
				List<String> items = Arrays.asList(line.split(","));
				System.out.print("Test avec " + items.get(0));
				if(main_code.tri_insertion.anagramme(items.get(0)).equals(items.get(1))) {
					System.out.println(" : Pass");
				}
				else {
					System.out.println(" : Fail");
				}
				
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args){
		test1();

	}
}
