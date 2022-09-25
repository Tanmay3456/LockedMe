package Simpli;


import java.io.File; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.LinkedList; 
import java.util.Scanner;

public class NewFileHandling {
	
	static final String projectFilesPath = "C:\\\\Users\\\\hp\\\\Desktop\\\\GitDemo"; 
	public static void main(String args[])throws IOException
	{
		Scanner obj=new Scanner(System.in);
		int option;
	
		do
		{
			displayMenuOptions();
			System.out.println("Enter your choice"); 
			option=obj.nextInt();
			switch(option)
			{
			case 1:
			getAllFiles();
			break;
			case 2:createFiles();
			break;
			case 3: deleteAllFiles();
			break;
			case 4: searchFiles();
			break;
			case 5: System.exit(0);
			break;
			default:System.out.println("Invalid option");
			}
			}
			while(option>0);
			//obj.close(); 
	}
	
	public static void displayMenuOptions()
	{
	System.out.println("*****Welcome to LockedMe.com*****");
	System.out.println("Developer Details");
	System.out.println("Name:Tanmay Malpure");
	System.out.println("Project name: LockedMe");
	
	
	System.out.println("\t1. Display all the files in the directory");
	System.out.println("\t2. Add a new file to the directory");
	System.out.println("\t3. Delete a file from the directory");
	System.out.println("\t4. Search a file given from the directory");
	System.out.println("\t5. Exit");

	} 
	
	
	/*This method will return all the files from the directory*/
	public static void getAllFiles()
	{
	try {
	File folder = new File(projectFilesPath);
	File[] listOfFiles = folder.listFiles();
	if(listOfFiles.length==0)
	{
	System.out.println("No Files exist");
	}
	else
	{
	for(var l:listOfFiles)
	{
	System.out.println(l.getName());
	}
	 }
	 }
	catch(Exception Ex)
	{
	System.out.println("Some error has occured");
	}
	}
	
	
	public static void createFiles() throws IOException
	{
	try
	{
	Scanner obj = new Scanner(System.in);
	String fileName;
	System.out.println("Enter the filename: ");
	fileName = obj.nextLine();
	
	
	System.out.println("File has been created successfully.");
	
	//obj.close();
	}
	catch(Exception ex)
	{
	System.out.println("Some error has occcured");
	}
	} 
	
	
	/*This method will delete the file based on the user input if it exists*/
	public static void deleteAllFiles()
	{
	Scanner obj = new Scanner(System.in);
	try
	{
	String fileName;
	System.out.println("Enter the file name to be deleted");
	fileName = obj.nextLine();
	File file = new File(projectFilesPath+"\\"+fileName);
	if(file.exists())
	{
	file.delete();
	System.out.println("File deleted SuccessFully : "+fileName);
	}
	else
	System.out.println("File do not exists");
	}
	catch(Exception ex)
	{
	System.out.println("Some Error has occured");
	}
	finally
	{
	//obj.close();
	}
	}
	/*This method will search the files from the directory*/
	public static void searchFiles()
	{
	Scanner obj = new Scanner(System.in);
	try
	{
	String fileName;
	System.out.println("Enter the file name to be Searched");
	fileName = obj.nextLine();
	File folder = new File(projectFilesPath);
	File[] listOfFiles = folder.listFiles();
	LinkedList<String> filenames = new LinkedList<String>();
	for(var l:listOfFiles)
	filenames.add(l.getName());
	if(filenames.contains(fileName))
	System.out.println("File is available");
	else
	System.out.println("File is not available");
	}
	catch(Exception ex)
	{
	System.out.println("Some Error has Occured");
	} finally
	{
	//obj.close();
	}
	}
	 
}