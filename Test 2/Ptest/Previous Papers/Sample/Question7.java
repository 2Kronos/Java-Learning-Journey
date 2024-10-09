// Implement a Java class Student with attributes name, age, and grade. Create an array of Student objects and write a program to find the average age of students in the array
public class Question7 {
    String name;
    int age;
    double grade;

    public Question7(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Question7[] students = new Question7[3];
        students[0] = new Question7("Alice", 18, 90.5);
        students[1] = new Question7("Bob", 19, 85.0);
        students[2] = new Question7("Charlie", 20, 92.5);

        int totalAge = 0;
        for (Question7 student : students) {
            totalAge += student.age;
        }

        double averageAge = (double) totalAge / students.length;
        System.out.println("Average Age of Students: " + averageAge);
    }
}
