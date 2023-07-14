package fileHandle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lec-4 writing onto file
		
		File file = new File("student");
		file.mkdir();
		file = new File("student\\test.txt");
		try {
			file.createNewFile();
			System.out.println("File is created: ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error occure while creating file");
		}
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true)))
		{
			bw.write("Avijit");
			bw.newLine();
			bw.write("Manirup");
			bw.newLine();
			bw.write("Abhisek");
			bw.newLine();
			
			System.out.println("Writing file is completed");
			//after writting file ..file is closed
			bw.close();
		}
		catch(IOException e)
		{
			System.out.println("Error occure while writing on the  file");
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("student\\test.txt"));
			String line;
			while((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		//creating new file lec-1
//		File file = new File("studyEase.txt");
//		file.createNewFile();
//		System.out.println("file is Created:..");
		
		//creating directory lec-2
//		File directory = new File("studentRes\\marks\\avi");
//		directory.mkdirs();
//		System.out.println("directory is created: ");
//		
//		//creating this file inside the avijit folder lec-3
//		
//		File file = new File("studentRes\\marks\\avi\\test.txt");
//		file.createNewFile();
//		System.out.println("Folder is created:");

	}

}
