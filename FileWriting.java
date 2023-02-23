package fileoperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileWriting {

	public static void main(String[] args) {
		File file = new File("example1.txt");

		if (file.exists()) {
			System.out.println("Existing");
			try {

				FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

				bufferedWriter.write("Java Full Stack");

				//bufferedWriter.newLine();

				bufferedWriter.write("Best programming language");

				System.out.println("Saved");

				bufferedWriter.close();

			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		else {
			try {
				file.createNewFile();
				System.out.println("Success");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
