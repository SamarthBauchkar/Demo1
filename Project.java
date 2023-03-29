package Sample;

import java.io.FileInputStream;

public class Project {
public static void main(String[] args) throws Exception {
	

	FileInputStream fis=new FileInputStream("C:\\Users\\Samarth Bauchkar\\Downloads\\Products.csv");
	
	int i;
	while((i=fis.read()) != -1)
	{
		System.out.print((char)i);
	}
	
	
	fis.close();
}
}
