class Circle extends Object implements Shape{
    private int radius;

    public Circle(int radius){
	this.radius = radius;
    }
    
    public double getArea(){
	return radius * Math.PI * Math.PI;
    }
}