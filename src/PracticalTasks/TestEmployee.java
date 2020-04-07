package PracticalTasks;

public class TestEmployee {
    public static void main(String[] args) {
        Employee Vasya = new Employee("Vasa Pup", 10);
        Employee Peta = new Employee("Petro", 7, 20);
        System.out.println(Vasya.getName() + " " + Vasya.getHours());
        Vasya.setHours(15);
        Vasya.setName("Vasya Pupkin");
        System.out.println(Vasya.getName() + "Vasya with salary: " + Vasya.returnSalary()
                + "with bonus: " +  Vasya.returnBonuses());



    }
}
