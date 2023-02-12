package my_java_project;
import java.io.*;
import java.util.*;
public class My_class {

	public static void main(String[] args)throws IOException {
		
		
		Scanner sc=new Scanner(System.in);
		int option;
		char suboption;
		System.out.println("\t\tWelcome In My Application !!");
		System.out.println("-------------------------------------------------------------\n");

		System.out.println("\t\tApplication Developer : Deeksha Singh Gaur");
		System.out.println("\t\tFile Menu Related Application\n\n");
		do
		{
	
			System.out.println("Choose your option:");
			System.out.println("1 - Display the Current File Name");
			System.out.println("2 - Display the user interface");
			System.out.println("3 - Exit");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				String path = "E:\\java";
				File fobj  = new File(path);
				//DisplayFileExample obj = new DisplayFileExample();
				if(fobj.exists() && fobj.isDirectory()) {
					File a[] = fobj.listFiles();
					Show_list.File_name(a,0,0);
				}
				break;
			case 2: //you need to write the logic to display the user
					//interface to perform various operations of file
				System.out.println("You are in Case 2");
				System.out.println("Choose the operation to do...");
				System.out.println("a) - Add File");
				System.out.println("b) - Delete File");
				System.out.println("c) - Search File");
				System.out.println("d) - Back to Main Menu");
				suboption=sc.next().charAt(0);
				switch(suboption)
				{
				case 'a':
					// you need to write a logic to add a file
					File_opration.add_file();
					break;
				case 'b':
					// you need to write a logic to delete a file
					File_opration.delete_file();
					break;
				case 'c': 
					// you need to write a logic to search a file
					File_opration.search_file();
					break;
				case 'd':
					// you need to write a logic to return to main menu
				}
				break;
			case 3: 
				break;
			}
			
		}while(option!=3);
		System.out.println("Thankyou.....Bye Bye !!");
	}

}
