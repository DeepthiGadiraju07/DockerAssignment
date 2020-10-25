

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
//import java.io.FileInputStream;
import java.io.File;
import java.io.FilenameFilter;
//import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.InetAddress;

public class WordCount {

	public WordCount() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws Exception{
		
		File directory = new File("/home/data");

		File allFiles[]=directory.listFiles(new FilenameFilter()
				{

					@Override
					public boolean accept(File dir, String name) {
						// TODO Auto-generated method stub
						return name.endsWith(".txt");
					}
			
				});
		
		HashMap<File,Integer> MaximumElements = new HashMap<File,Integer>();
		Integer max=0;
		
		PrintWriter result= new PrintWriter("/home/output/result.txt");
		
		// To list all files in the directory
		int total=0;
	//	ArrayList<Integer> numberOfWords = new ArrayList<Integer>();

		result.println("The list of files in this directory are ");
		for(File file:allFiles)
		{
			
			//System.out.println(file.getName());
			result.println(file.getName());
		}
		
		//To display the count of words in each file
		for(File file:allFiles)
		{
			Scanner scanner=new Scanner(file);
			int count=0;
			while(scanner.hasNext())
			{
				String[] input = scanner.nextLine().split(" ");
				for(int i=0;i<input.length;i++)
				{	
					count++;
				}	
		
				
				MaximumElements.put(file, count);
				max=Collections.max(MaximumElements.values());
				
				
			}	
			
			//System.out.println("No of words in "+file.getName()+" is:"+count);
			
			result.println("No of words in "+file.getName()+" is:"+count);
			
			
			scanner.close();
		}
		
	// to get the file with maximum number of words and to calculate the total sum
		for (Entry<File, Integer> entry : MaximumElements.entrySet())
		{
			total= total+ entry.getValue();
			
			if(entry.getValue()==max)
			{
				//System.out.println("the file with maximum number of words is "+(entry.getKey()).getName()+" with "+max+" number of words");
				result.println("the file with maximum number of words is "+(entry.getKey()).getName()+" with "+max+" number of words");
			}
		}
		//System.out.println("The total number of words in all files are "+total);
		result.println("The total number of words in all files are "+total);
		
		// to display the IP address of my current machine
		InetAddress myIP= InetAddress.getLocalHost();
		//System.out.println("This machine's IP address is: "+myIP);
		result.println("This machine's IP address is:"+myIP);
		result.close();

		File directory1 = new File("/home/output");
		File allnewFiles[]=directory1.listFiles();
		for(File file: allnewFiles)
		{
			Scanner scanner=new Scanner(file);
			while(scanner.hasNext())
			{
				System.out.println(scanner.nextLine());
			}
		scanner.close();
		}
		
	}	
	
	
		}

	
	
	

