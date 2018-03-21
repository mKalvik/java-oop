import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentProc {

//    public static Map<String, Integer> students = new HashMap<>();
//
//    public static void addStudent (String name) {
//        students.put(name, 0);
//    }
//
//    public static void addPoints (String studentName, int pointsToAdd) {
//        if (students.containsKey(studentName)) {
//            students.put(studentName, students.get(studentName) + pointsToAdd);
//        } else {
//            students.put(studentName, pointsToAdd);
//        }
//    }
//
//
//    public static int getPoints (String studentName) {
//        return students.get(studentName);
//    }
//






    public static void main(String[] args) {

        List<Apple> apples = new ArrayList<>();
        Apple apple1 = new Apple("red", 40);
        Apple apple2 = new Apple("red", 40);
        Apple apple3 = new Apple("blue", 40);
        Apple apple4 = new Apple("keke", 40);
        Apple apple5 = new Apple("midagi", 40);
        Apple apple6 = new Apple("rfak", 40);
        Apple apple7 = new Apple("re", 40);

        apples.add(apple7);
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
        apples.add(apple4);
        apples.add(apple5);
        apples.add(apple6);

        System.out.println(apples.stream().filter(apple -> apple.getColor().equals("red")).mapToInt(Apple::getWeight).sum());
    }

}
