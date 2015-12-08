package se.yh.java15.texteditor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kladd {

	
	    List<String> lines = new ArrayList<String>();
	    String line = null;
	    Scanner scan = null;

	    public void doIt() {
	        scan = new Scanner(System.in);

	        while (true) {
	            try {

	                System.out.println("Slå in hela sökvägen");
	                String path = scan.nextLine();
	                File f1 = new File(path);
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

	                System.out
	                        .println("====================work done===================");

	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }

	        }
	    }
	    

	    public static void main(String args[]) {

	        kladd fr = new kladd();

	        fr.doIt();

	    }
	}

