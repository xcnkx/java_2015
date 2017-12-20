class Student implements Relatable {
    private String name;
    private int age;
    private int weight = 0;
    private int height = 0;
    private Point origin;

    public Student(String n, int a, int w, int h) {
	name = n;
	age = a;
	weight = w;
	height = h;
    }

    public String getName(){
	return name;
 }

    // a method for computing the area of the rectangle
    public double getBMI() {
	return (double)weight / (height * height);
    }
    
    // a method to implement Relatable
    public int isLargerThan(Relatable other) {
    	Student otherRect = (Student)other;
    	if (this.getBMI() < otherRect.getBMI())
    		return -1;
    	else if (this.getBMI() > otherRect.getBMI())
    		return 1;
    	else
    		return 0;    		
    }
}