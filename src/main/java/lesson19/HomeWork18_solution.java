package lesson19;

import lesson17.Student;

import java.util.*;

import static lesson18.HashMapMethods.printMap;

public class HomeWork18_solution {
    public static void main(String[] args) {
        Map<Student, List<Integer>> students = new HashMap<>();
        Student student1 = new Student("Bob", "Ivanov", 22, 7.7);
        List<Integer> list1 = List.of(6, 10, 3, 5, 7);
        Student student2 = new Student("Alex", "Alekseev", 18, 9.0);
        List<Integer> list2 = List.of(4, 9, 10, 5);
        Student student3 = new Student("Masha", "Petrova", 21, 7.0);
        List<Integer> list3 = List.of(6, 10, 3, 5, 7);
        Student student4 = new Student("Petr", "Petrov", 22, 5.7);
        List<Integer> list4 = List.of(7, 7, 9);
        Student student5 = new Student("Ivan", "Ivanov", 22, 7.7);
        List<Integer> list5 = List.of(7, 9, 9, 9);

        List<Integer> list5_v1 = new ArrayList<>(list5);
        list5_v1.add(33);
        System.out.println(list5_v1);

        students.put(student1, list1);
        students.put(student2, list2);
        students.put(student3, list3);
        students.put(student4, list4);
        students.put(student5, list5);
        students.put(null, list1);

        printMap(students);
        System.out.println(getAverageGradeStudents(students));
        Map<String, Boolean> map = Map.of("Ivan", true, "Sveta", true, "Dasha", false);
        System.out.println(getKeys(map));

        LinkedHashMap<String, Boolean> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Ivan", true);
        linkedHashMap.put("Sveta", true);
        linkedHashMap.put("Dasha", false);
        System.out.println(getKeys(linkedHashMap));

    }

    static String getKeys(Map<String, Boolean> map){
        if(map == null || map.isEmpty())
            return "ERROR";
        StringBuilder result = new StringBuilder();
        for (String name : map.keySet()){
            if(name != null && !name.isEmpty())
                result.append(name).append(':');
        }
        return result.toString();
    }

    static Double getAverageGradeStudents(Map<Student, List<Integer>> students){
        if(students == null || students.isEmpty())
            return 0.;
        List<List<Integer>> grades = new ArrayList<>(students.values());
        System.out.println(grades);
        double result = 0.;
        for (List<Integer> el : grades){
            if(el != null){
                double res= 0.;
                for (Integer grade : el){
                    res += grade;
                }
                result += res/el.size();
                System.out.println("result --> " + result);
            }
        }
        return result/grades.size();
    }

}
