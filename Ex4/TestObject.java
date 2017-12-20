class Rectangle{
    int Height;
    int Length;
    
    Rectangle(int h,int l){
	Height = h;
	Length = l;
    }
    
    public int getHeight(){
	return this.Height;
    }
    
    public int getLength(){
	return this.Length;
    }
    
    public int getP(){
	return 2*(this.Length + this.Height);
    }
}

class Box{
    int Height;
    int Length;
    int Width;
    
    Box(int h,int l,int w){
	Height = h;
	Length = l;
	Width  = w;
    }
    public int getP(){
        return this.Height+this.Length+this.Width;
    }
}

public class TestObject{
    public static void main(String[] argc){
	Rectangle r1 = new Rectangle(2,4);
	Box b1 = new Box(2,4,2);
	
	System.out.println("Rectangle perimeters");
	System.out.println(r1.getP());
	System.out.println("Box perimeters");
	System.out.println(b1.getP());
    }
}
