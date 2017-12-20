import java.io.*;
import java.util.Scanner;

public class WordCounting{
    public static void main(String[] args){
	String words[] = new String [200];
	String tmp;
	int numbercount[] = new int[200];
	int wordcount = 0,numberword = 0,found;
	float res;
	try{
	    Scanner scan = new Scanner(new BufferedReader(new FileReader("input.txt")));
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output_q2.txt")));
	    
	    while(scan.hasNext()){
		found = 0;
		tmp = scan.next();
		
		for(int i=0;i<numberword;i++){
		    if(tmp.contentEquals(words[i])){
			numbercount[i]++;
			found = 1;
		    }
		}
		if(found == 0){
		    words[numberword] = tmp;
		    numberword++;
		}
		wordcount++;
	    }
	    
	    out.println("WordCount: " + wordcount + ",Number of Words: " + numberword);
	    
	    for(int i=0;i<numberword;i++){
		res = (float)(((float)numbercount[i]+1) / wordcount);
		out.print(words[i] + " : " + (numbercount[i]+1) + " ,");
		out.println(res);
	    }
	    
	    scan.close();
	    out.close();
	    
	}
	catch(FileNotFoundException e){
	    System.out.println("File could not found");
	}
	catch(IOException ioe){
	    System.out.println("Exception while reading the file" + ioe);
	}
    }
}