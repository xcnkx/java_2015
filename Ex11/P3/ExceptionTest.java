public class ExceptionTest {
 
	public static void main(String[] args) {
 
		int[] a = new int[9];
		int[] b = new int[10];
		int[] c = new int[9];
        
		Object tc = new TestClass();
		//((Integer)tc).byteValue();
		tc = null;
		//tc.toString();
		
		for(int i=0; i<10; i++){
		    //	c[i] = i/(5-i);
			b[i] = i;
		}
	}
}
 
class TestClass{
	private int testvar;
	TestClass(){
		testvar = 0;
	}
	public int getvar(){return testvar;}
}