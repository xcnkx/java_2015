import java.util.*;
import java.io.*;

public class AnalyzingData{

    double sum;

    public AnalyzingData(){
	DataInputStream in = null;
        sum = 0;

	try{
	    in = new DataInputStream(new BufferedInputStream(new FileInputStream("input")));
	    for(int i=0;i<60;i++)sum += (double)in.readInt();
	    sum /= 60;
    
	    in.close();
	}
	catch(Exception e){
	    System.out.println("Ecxeption");
	}
    }
    public double getAve(){
	return sum;
    }
}