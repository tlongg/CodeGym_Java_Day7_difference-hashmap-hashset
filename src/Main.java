import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Long", 25, "Hanoi");
        Student student2 = new Student("Khang", 20, "Ninh Binh");
        Student student3 = new Student("Mai", 19, "Bac Ninh");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }

        System.out.println("...............Set");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student student: students){
            System.out.println(student.toString());
        }

    }
}