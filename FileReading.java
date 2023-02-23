package fileoperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReading {

	public static void main(String[] args) {
		
		//crearting a file
		File file=new File("testexample.txt");
		
		//check whether the file is existing or not
		if(file.exists())
		{
			System.out.println("Existing file");
			//if existing read the file content
			
			try {
				// filereader is used to read the file content created by file class
				FileReader fileReader=new FileReader(file);
				//Bufferedreader is class that read the file reader contents and convert to byte/steam
				BufferedReader bufferedReader=new BufferedReader(fileReader);
				
				//System.out.println(bufferedReader);
				String data;
				
				// read each line from filereader and assigned to the string variable data
				while((data=bufferedReader.readLine())!=null)
					
					
				{
					System.out.println(data);
				}

			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		else {
			try {
				file.createNewFile();
			}
			catch (Exception e) {
			
			}
		}

	}

}
