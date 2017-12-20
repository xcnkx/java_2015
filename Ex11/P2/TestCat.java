import java.io.*;

public class TestCat{
    public static void cat(File file) {
	RandomAccessFile input = null;
	String line = null;
	
	try {
	    input = new RandomAccessFile(file, "r");
	    while ((line = input.readLine()) != null) {
		
		System.out.println(line);
		
	    }
	    return;
	} 
	catch(FileNotFoundException ex){
	    System.out.println("File not found.");
	}
	catch(IOException ex){
	    System.out.println("IO error.");
	}
	finally {
	    try{
		if (input != null) {
		    input.close();
		}
	    }
	    catch(IOException ex){
		System.out.println("IO error.");
	    }
	}
    }
}
