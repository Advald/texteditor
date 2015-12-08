package se.yh.java15.texteditor;

import java.util.Scanner;

public class TextEditor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Menu");
		System.out.println("a- add new material in the end of the file");
		System.out.println("d+number..number- erase column from number..number");
		System.out.println("g- get file");
		System.out.println("h- help");
		System.out.println("i+number- add column after choosen number");
		System.out.println("l- to print out the whole/parts of the file");
		System.out.println("m- Show menu again");
		System.out.println("q- Quit");
		System.out.println("s- Save");
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
			break;
		case "q":
			break;
		case "s":
			break;
		}
	}
}