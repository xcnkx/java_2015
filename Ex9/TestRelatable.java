public class TestRelatable {
    public static void main(String[] args) {
	Student[] s = new Student[4];
	 s[0] = new Student("Me",19,70,170);
	 s[1] = new Student("Nao",22,60, 170);
	 s[2] = new Student("Sho",19,65,175);
	 s[3] = new Student("Maru",20,70,170);

	 for(int i = 1;i<s.length;i++){
	     switch (s[0].isLargerThan(s[i])) {
	     case 1:
		 System.out.println(s[0].getName() + " is greater than " + s[i].getName());
		 break;
	     case 0:
		 System.out.println(s[0].getName() + " is equal to " + s[i].getName());
		 break;
	     default:
		 System.out.println(s[0].getName() + " is less than " + s[i].getName());
		 break;
	     }
	 }
	 
    }
}