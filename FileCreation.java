package fileoperations;

import java.io.*;
import java.util.Scanner;

public class FileCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter file name");
		String filename = scanner.next();

		File file = new File(filename + ".txt");
		try {
			
			if(file.exists())
			{
				System.out.println("Already existing");
				System.out.println(file.getName());
				System.out.println(file.getAbsolutePath());
				System.out.println(file.getFreeSpace());


			}
			else if (file.createNewFile()) {
				System.out.println("Success");
				System.out.println(file.getName());
			}
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
