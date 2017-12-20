class Sphere{
    float radius;

    Sphere(float r){
	radius = r;
    }
    
    double calcVol(){
	return (4/3)*(3.14*(radius*radius*radius));
    }
    
    float heightContactPoint(Sphere secondSphere){
	float h;
	h = ((this.radius*(secondSphere.radius-this.radius))/(this.radius+secondSphere.radius));
	return h+this.radius;
    }
}

class TestSphere{
    public static void main(String[] args){
	Sphere s1 = new Sphere(2);
	Sphere s2 = new Sphere(2);
	Sphere s3 = new Sphere(4);
	
	System.out.println("The volume of s1 = " + s1.calcVol());
	System.out.println("The volume of s2 = " + s2.calcVol());
	System.out.println("The volume of s3 = " + s3.calcVol());
        System.out.println("The height contact point of s1 and s2 is " + s1.heightContactPoint(s2));
	System.out.println("The height contact point of s1 and s3 is " + s1.heightContactPoint(s3));
	System.out.println("The height contact point of s2 and s3 is " + s2.heightContactPoint(s3));
    }
}
    
