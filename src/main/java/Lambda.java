import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface Filter {
    boolean run(Student student);
}

@FunctionalInterface
interface Sum {
    void run(Student student);
}

public class Lambda {
    public static List<Student> studentFiltering(List<Student> studentList, int score){
        List<Student> filteredStudents = new ArrayList<>();
        Filter filter = student -> student.getAvgScore() > score;

        for(Student student : studentList){
            if(filter.run(student)){
                filteredStudents.add(student);
            }
        }

        return filteredStudents;
    }

    public static void sortByName(List<Student> studentList){
        studentList.sort(Comparator.comparing(Student::getName));
    }

    public static void sortByScore(List<Student> studentList){
        studentList.sort(Comparator.comparing(Student::getAvgScore));
    }

    public static void addScoreForEach(List<Student> studentList, int score){
        Sum addScore = student -> student.setAvgScore(student.getAvgScore() + score);
        for(Student student : studentList){
            addScore.run(student);
        }
    }
}