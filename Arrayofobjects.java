class Student {
    int rollno;
    String name;
    int Marks;
}

public class Arrayofobjects {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Navin";
        s1.Marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Norman";
        s2.Marks = 76;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Nancy";
        s3.Marks = 98;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " : " + students[i].Marks);
        }
    }
}
