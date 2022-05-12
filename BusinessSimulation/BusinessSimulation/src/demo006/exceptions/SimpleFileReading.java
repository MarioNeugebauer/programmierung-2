package demo006.exceptions;

//Java Program to illustrate Reading from FileReader
//using BufferedReader Class

//Importing input output classes
import java.io.*;

//Main class
public class SimpleFileReading {

	public void testFileReading(String[] args) // throws Exception
	{

		File file = new File(
			"C:\\daten\\test.txt");

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}

		String st;

		try {
			while ((st = br.readLine()) != null)
				System.out.println(st);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void testFileReadingUnchecked(String[] args) // throws Exception
	{

		File file = new File("C:\\daten\\test.txt");

		BufferedReader br;
		br = new BufferedReader(new FileReader(file));

		String st;

		while ((st = br.readLine()) != null)
			System.out.println(st);

		br.close();
	}


}
