class Person {
        protected String name;   //protected -> 継承されたサブクラス内からアクセスする。
        public Person(String name){
            this.name=name;
        }
        public String introduction(){
            return "My name is "+name;
        }
    }
    class Student extends Person{
        protected String ID;
        public Student(String name,String ID){
            super(name);
            this.ID=ID;
        }
        public String introduction(){
            return "I am a student.My name is "+super.name+" My ID is "+ID;
        }
    }
    class EnglishPerson extends Person{
        public EnglishPerson(String name){
            super(name);
        }
        public String introduction(){
            return "How do you do? "+super.introduction();
        }
    }
    class EnglishStudent extends Student{
        public EnglishStudent(String name,String ID){
        super(name,ID);
    }
        public String introduction(){
            return "How do you do? "+super.introduction();
        }
    }
    class JapanesePerson extends Person{
        public JapanesePerson(String name){
            super(name);
        }
        public String introduction(){
            return "Hajime mashite. "+super.introduction();
        }
    }
    class JapaneseStudent extends Student{
        public JapaneseStudent(String name,String ID){
            super(name,ID);
        }
        public String introduction(){
            return "Hajime mashite. "+super.introduction();
        }
    }
public class PeopleIntroduction{        
  public static void main(String  args[]) {
    Person[] persons = {         //Personオブジェクトの配列
      new Person("hoge"),
      new Student("foo", "s1203424"),     
      new EnglishPerson("foobar"),
      new EnglishStudent("hogehoge", "s7654321"),
      new JapanesePerson("tarou"),
      new JapaneseStudent("hanako","s115333"),
    };
    for (Person p : persons) {   //personsの配列のそれぞれで回す。
        System.out.println(p.introduction());
    }
}
}
