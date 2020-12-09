package day_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class day1 {

	public static <E> void main(String[] args) {
		
		List<Integer> input = new ArrayList<Integer>();
		
		
		try {
			File myObj = new File("G:/java/AdventOfCode/input.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				input.add(Integer.parseInt(myReader.nextLine()));
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Collections.sort(input);
		
		for (int i = 0; i < input.size(); i++) {
			for (int j = input.size() - 1; j >= 0; j--) {
				int value = input.get(i) + input.get(j);
				if(value < 2020) break;
				else if (value == 2020) {
					System.out.println("Answer 1 to Day1:" + (input.get(i) * input.get(j)));
				}
			}
		}

		for (int i = 0; i < input.size(); i++) {
			for (int j = input.size() - 1; j >= 0; j--) {
				for (int k = i + 1; k < input.size(); k++) {
					int value = input.get(i) + input.get(j) + input.get(k);
					if(value < 2020) break;
					else if (value == 2020) {
						System.out.println("Answer 2 to Day1:" + (input.get(i) * input.get(j)*input.get(k)));
					}
				}
				
			}
		}
		
		
	}
}
