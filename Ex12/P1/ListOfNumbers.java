import java.io.*;
import java.util.Vector;

public class ListOfNumbers {

    private static final int SIZE = 10;
    private Integer victor[];

    public ListOfNumbers () {
        victor = new Integer[SIZE];
        for (int i = 0; i < SIZE; i++)
            victor[i] = i;
     // write your code for readList (input filename: "infile.txt"), and writeList of this object.
	readList("infile.txt");
	writeList();

    }

    public void writeList() {
        PrintWriter out = null;

        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));
        
            for (int i = 0; i < SIZE; i++)
                out.println("Value at: " + i + " = " + victor[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " +
                                 e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    public void readList(String fileName) {
        String line = null;
        try {
            RandomAccessFile raf = new RandomAccessFile(fileName, "r");
            int idx = 0;
            while ((line = raf.readLine()) != null) {
                Integer i = new Integer(Integer.parseInt(line));
                System.out.println(i);
                victor[idx++] = i;
            }

        }
       // write code for catching "ArrayIndexOutOfBoundsException", "FileNotFoundException", and "IOException" with proper handling routing as you want to show the running result.
	catch(ArrayIndexOutOfBoundsException e){
		System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
	}
	catch(FileNotFoundException e){
	    System.err.println("Caught FileNotFoundException: " + e.getMessage());
	}
	catch (IOException e) {
	    System.err.println("Caught IOException: " + e.getMessage());
	}
    }
    public static void main(String[] args) {
        new ListOfNumbers();
    }
}
  
