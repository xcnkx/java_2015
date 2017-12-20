import java.io.*;

public class ReverseString{
    public static void main(String[] args){
	int buf[] = new int[10000];
	int tmp;
	int i = 0;

	
	try{
	    FileInputStream fin = new FileInputStream("input.txt");
	    FileOutputStream fout = new FileOutputStream("output_q1.txt");
	    
	    while((buf[i] = fin.read()) != -1)i++;
	    for(int j=i-1;j>=0;j--)fout.write(buf[j]);

	    fin.close();
	    fout.close();
	    
	}
	catch(FileNotFoundException e){
	    System.out.println("File could not found");
	}
	catch(IOException ioe){
	    System.out.println("Exception while reading the file" + ioe);
	}
    }
}