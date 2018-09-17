package Test1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {
	public static void main(String args[])
	{
		String filename="text.txt";
		try
		{
			FileWriter filewriter=new FileWriter(filename);
			BufferedWriter bufferedwriter=new BufferedWriter(filewriter);
			bufferedwriter.write("Hello there,");
			bufferedwriter.write("Here is some text.");
			bufferedwriter.newLine();
			bufferedwriter.write("we are writting");
			bufferedwriter.write("the text to the file");
			bufferedwriter.close();
		}
		catch(IOException ex)
		{
		System.out.println("Error writing to the file'"+filename+"'");
		
		}
	}
}
