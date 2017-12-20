
class Shape {
  private String name;
  public Shape(String name) {
    this.name = name;
  }
  public Shape() {
    name = "no name";
  }
  public String getName() {
    return name;
  }
  public String toString() {
    return getClass().getName() + " " + name;
  }
}

class Circle extends Shape {
    private double radius = 0;

    public Circle(double r,String name){
	super(name);
	this.radius = r;
    }
    
    public double getPerimeters(){
	return 2*(3.14)*this.radius;
	    }

    public double getArea(){
	return (3.14)*(3.14)*this.radius;
    }

    public String toString() {
	return super.toString();
    }
}

class Rectangle extends Shape {
    public double height,width;
    
    public Rectangle(double h, double w, String name){
	super(name);
	this.height = h;
	this.width = w;
    }

    public double getPerimeters(){
	return 2*(this.height+this.width);
    }

    public double getArea(){
	return this.height*this.width;
    }

    public String toString(){
	return super.toString();
    }
}

class Square extends Rectangle {
    
    public Square(double l, String name){
	super(l,l,name);
    }
	
}

class Parallelogram extends Rectangle {
    private double diagonal;

    public Parallelogram(double h,double w,double d,String name){
	super(h,w,name);
	this.diagonal = d;
    }

    public double getArea(){
	double s = (this.diagonal+this.height+this.width)/2;
	return Math.sqrt(s*(s-this.diagonal)*(s-this.height)*(s-this.width));
    }
	
}

class Rhombus extends Square{
    
    private double diagonal;
    
    public Rhombus(double l,double d,String name){
	super(l,name);
	this.diagonal = d;
    }
    
    public double getArea(){
	double s = (this.diagonal+this.height+this.width)/2;
	return Math.sqrt(s*(s-this.diagonal)*(s-this.height)*(s-this.width));
    }
}

public class TestFigures{
    
    public static void main(String[] args){
	
        Shape circle = new Circle(2,"c");
	Shape rectangle = new Rectangle(2,4,"r");
	Shape square = new Square(4,"s");
	Shape para = new Parallelogram(3,4,5,"p");
	Shape rhombus = new Rhombus(4,3,"rh");
	
	
	System.out.println(circle.toString());
	System.out.println("perimeters: "+((Circle)circle).getPerimeters() +" area: "+((Circle)circle).getArea());
	System.out.println(rectangle.toString());
	System.out.println("perimeters: "+((Rectangle)rectangle).getPerimeters() +" area: "+((Rectangle)rectangle).getArea());
	System.out.println(square.toString());
	System.out.println("perimeters: "+((Square)square).getPerimeters() +" area: "+((Square)square).getArea());
	System.out.println(para.toString());
	System.out.println("perimeters: "+((Parallelogram)para).getPerimeters() +" area: "+((Parallelogram)para).getArea());
	System.out.println(rhombus.toString());
	System.out.println("perimeters: "+((Rhombus)rhombus).getPerimeters() +" area: "+((Rhombus)rhombus).getArea());
	
    }
}
