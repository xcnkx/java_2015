import java.util.*;
import java.io.*;

public class GeneratingData{

    public GeneratingData(){
	DataOutputStream out=null;
	Random rand;

	try{
	    rand = new Random();
	    out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("input")));
	    for(int i=0;i<60;i++)out.writeInt((rand.nextInt(53)+8));
	    out.close();
	}
	catch(Exception e){
	    System.out.println("Exception");
	}
    }
}