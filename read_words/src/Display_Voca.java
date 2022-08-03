
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class Display_Voca{
	public static void main(String[] args){
		try {
			//get words from file
			Scanner scanner = new Scanner(System.in);
			Path path = Path.of("C:\\Users\\caozn\\Desktop\\Vocabulary.txt");
			List<String> vocab_data_list = Files.readAllLines(path);
			while(true) {
				System.out.print("Input word: ");
				String search = scanner.nextLine();
				System.out.format("%-15s %-5s %-15s\n", 
						"Words",
						"Type",
						"Meaning");
				for (String vocab_data : vocab_data_list ) {
					String[] data = vocab_data.split(";");
					Vocabulary dictionary = new Vocabulary();
					dictionary.vocab = data[0];
					dictionary.type = data[1];
					dictionary.meaning = data[2];
					if(dictionary.vocab.contains(search)) {
						dictionary.display_vocal();
					}
				}
			}	
		}
		catch (Exception e) {
			
		}
		
		
	}
}