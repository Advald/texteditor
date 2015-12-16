package se.yh.java15.texteditor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextEditor {

	
		
	
	public void getPath() {
		List<String> lines = new ArrayList<String>();
		String line = null;
		Scanner scan = new Scanner(System.in);
		String filnamn;
		String svar = "nej";
		String svaret = "";
		
		do {
			System.out.println("write the path: ");
			filnamn = scan.next();
			
			if (new File(filnamn).exists()) {
				try {				
					File f1 = new File(filnamn);
					FileReader fr = new FileReader(f1);
					BufferedReader br = new BufferedReader(fr);
					int i = 0;
					while ((line = br.readLine()) != null) {
						if (line.contains("System.out")) {
							line = line.replace("System.out", "//");
						} else if (line.contains("Log.")) {
							line = line.replace("Log", "//");
						}

						lines.add(i, line);
						i++;
					}
					fr.close();
					br.close();

					FileWriter fw = new FileWriter(f1);
					BufferedWriter out = new BufferedWriter(fw);
					for (int j = 0; j < lines.size(); j++) {
						System.out.println(j + "." + lines.get(j));
						out.append(lines.get(j));
						out.newLine();
					}

					out.flush();
					out.close();

				} catch (Exception ex) {
					ex.printStackTrace();
				}		
			} else {
				System.out.println("");
				showMenu();
			}

		} while (svar.equals(svaret.toLowerCase()));	
		scan.close();
	}

	public void showMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menu");
		System.out.println("a - add new material in the end of the file");
		System.out.println("d<number..number> - erase column from number..number");
		System.out.println("g - get file");
		System.out.println("h - help");
		System.out.println("i<number> - add column after choosen number");
		System.out.println("l - to print out the whole/parts of the file");
		System.out.println("m - Show menu again");
		System.out.println("q - Quit");
		System.out.println("s - Save");
		System.out.println("=====================================");
		System.out.println("Your choice: ");
		String choice = sc.nextLine();

		switch (choice) {
		case "a":
			System.out.println("a");
			break;
		case "d":
			break;
		case "g":
			break;
		case "h":
			break;
		case "i":
			break;
		case "l":
			break;
		case "m":
			showMenu();
			break;
		case "q":
			String svar1;
			String svaret1 = "";
			do{
				System.out.println("Do you want to save changes? y/n ");
				svar1 = sc.nextLine();
				
				switch (svar1){
				case "y":
					//spara funktion
					System.exit(0);	
					break;
				case "n":
					System.exit(0);
					break;
				}
				
			}while (svar1.equals(svaret1.toLowerCase()));
			
			break;
		case "s": 
//			if (new File(filnamn).exists()){
//			//spara filen på den sökväg som skrevs in
//			FileWriter fw = new FileWriter(filnamn);
//			fw.write(str);
//		}else {
//			//sparas
//			System.out.println("filen sparades här:");
//		}
			break;
		}
		sc.close();
	}
	
}




