package PracticalTasks;

public class StudentMain {

    public static void main(String[] args) {
        Student student1 = new Student("Vasya", 5);
        Student student2 = new Student("Petya", 3);

        System.out.println(student1.betterStudent(student2));
        Student.setAvgRating(student1,student2);
        System.out.println(Student.getAvgRating());



    }
}
