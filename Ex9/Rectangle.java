class Rectangle extends Object implements Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height){
	this.width = width;
	this.height = height;
    }

    public double getArea(){
	return width * height;
    }
}