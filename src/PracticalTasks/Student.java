package PracticalTasks;

public class Student {
    private String  name;
    private int rating;
    private static int avgRating;
    private static int count;


    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        count++;

    }

    public boolean betterStudent(Student otherStudent) {
        return this.rating > otherStudent.getRating();

    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public static int getAvgRating() {
        return avgRating;
    }

    public static void setAvgRating(Student ... students) {
        int sum = 0;
        for (Student s: students){
            sum += s.getRating();

        }
        Student.avgRating = sum/count;
    }
}
