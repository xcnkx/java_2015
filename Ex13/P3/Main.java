public class Main{
    public static void main(String[] rgs){
	GeneratingData gdata = new GeneratingData();
	AnalyzingData adata = new AnalyzingData();
	
	if(adata.getAve() >= 30)System.out.println("Treatment is necessary: average rate of breath per minute is " + adata.getAve());
    }
}