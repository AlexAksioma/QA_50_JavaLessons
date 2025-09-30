package lesson17;

import java.util.Comparator;

public class ComparatorByGrade implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int result = Double.compare(s1.getAverageGrade(), s2.getAverageGrade());
        if (result != 0)
            return result;
        return s1.compareTo(s2);
    }
}
