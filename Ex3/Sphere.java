class Sphere{
    float radius;

    Sphere(float r){
	radius = r;
    }
    
    float calcVol(float r){
	return (4/3)*3.14*r*r;
    }
    
    float heightContactPoint(Sphere secondSphere){
	float h;
	h = ((this.radius*(secondSphere.radius-this.radius))/this.radius+secondSphere.radius);
	return h;
    }
}

class TestSphere{
    public static void main(String[] args){
	Sphere s1 = new Sphere(2);
	Sphere s2 = new Sphere(2);
	Sphere s3 = new Sphere(4);
	
        System.out.println("The height contact point is" + s1.heightContactPoint(s3));
    }
}
    
