package school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher geoff = new Teacher(1,"Geoff",500);
        Teacher jackie = new Teacher(2,"Jackie",700);
        Teacher hobby = new Teacher(3,"Hobby",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(geoff);
        teacherList.add(jackie);
        teacherList.add(hobby);

        Student george = new Student(1,"George",4);
        Student harry = new Student(2,"Harry",12);
        Student sophie = new Student(3,"Sophie",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(george);
        studentList.add(sophie);
        studentList.add(harry);

        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(megan);

        george.payFees(5000);
        harry.payFees(6000);
        System.out.println("GHS has earned £"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        geoff.receiveSalary(geoff.getSalary());
        System.out.println("GHS has spent for salary to " + geoff.getName()
        +" and now has £" + ghs.getTotalMoneyEarned());

        hobby.receiveSalary(hobby.getSalary());
        System.out.println("GHS has spent for salary to " + hobby.getName()
                +" and now has £" + ghs.getTotalMoneyEarned());


        System.out.println(harry);

        geoff.receiveSalary(geoff.getSalary());

        System.out.println(geoff);
    }
}