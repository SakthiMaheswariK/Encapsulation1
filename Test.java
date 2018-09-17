package Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InterruptedIOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filename="temp.txt";
		String line=null;
		try
		{
			FileReader filereader=new FileReader(filename);
			BufferedReader bufferedreader=new BufferedReader(filereader);
			while((line=bufferedreader.readLine())!=null){
				System.out.println(line);
			}
				bufferedreader.close();
			}
		catch(FileNotFoundException ex)
		{
			System.out.println("unable to open file'"+filename+"'");
			
		}
		catch(InterruptedIOException ex)
		{
			System.out.println("Error reading file'"+filename+"'");
			
		}
		
		}
}
			
		
	


