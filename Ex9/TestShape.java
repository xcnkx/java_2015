public class TestShape{
    public static void main(String[] args){
	double sum = 0;
	Object[] object = new Object[12];
	object[0] = new Point(1,2);
	object[1] = new Point(3,4);
	object[2] = new Point(5,6);
	object[3] = new Circle(3);
	object[4] = new Circle(4);
	object[5] = new Circle(5);
	object[6] = new Circle(6);
	object[7] = new Rectangle(1,2);
	object[8] = new Rectangle(3,4);
	object[9] = new Rectangle(5,6);
	object[10] = new Rectangle(7,8);
	object[11] = new Rectangle(9,10);


	for(int i = 0;i<object.length;i++){
	    sum += object[i].getArea();
	    System.out.println(String.format("%2d:%-10s Area:%-7.2f Total:%-7.2f",i,object[i].getClass().getSimpleName(),object[i].getArea(),sum));
	}
    }
}