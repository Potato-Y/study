public class main {
    public static void main(String args[]) {
        //업스케일링
        Person p = new Student("개나리");
        System.out.println(p.name);

        //다운스케일링
        Student s = (Student) p;
        System.out.println(s.name);

        if (s instanceof Student) { //레퍼런스 instanceof 클래스명: 레퍼런스가 가리키는 객체가 해당 클래스의 객체인가?
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

class Person {
    String name;
    String id;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String grade;
    String department;

    public Student(String name) {
        super(name);
    }
}