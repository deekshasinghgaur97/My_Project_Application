package my_java_project;
import java.util.*;
import java.io.*;
public class File_opration {
	static void add_file() throws IOException {
		FileWriter fw=new FileWriter("File3.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		String s="Hibernate is an ORM FrameWork";
		bw.write(s);
		System.out.println("File Created");
		bw.close();
		fw.close();
	}
	static void delete_file() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter File Name");
		String file_name = sc.nextLine();
		File f0= new File(file_name);
		if(f0.delete()) {
			System.out.println(f0.getName() + " file is deleted sucessfully");
		}
		else {
			System.out.println(f0.getName() + " file Not found");
		}
	}
	static void search_file() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter File Name");
		String file_name = sc.nextLine();
		File f0 = new File(file_name);
		
		if(f0.exists()) {
			String absolute = f0.getAbsolutePath();
			System.out.println(f0.getName() + " file found sucessfully");
			System.out.println(" file Absolute Path : "+ absolute);
		}
		else {
			System.out.println(f0.getName() + " file Not found");
		}
	}
}
