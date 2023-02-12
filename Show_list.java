package my_java_project;
import java.util.*;
import java.io.*;
public class Show_list {
	static void File_name(File[] a ,int i,int lvl) {
		if(i==a.length) {
			return;
		}
		if(a[i].isFile()) {
			System.out.println(a[i].getName());
		}
		File_name(a,i+1,lvl);
	}
}	
