import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {
    @Test
    void studentFiltering(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Іван", 85));
        students.add(new Student("Марія", 92));
        students.add(new Student("Петро", 78));
        students.add(new Student("Олена", 97));

        int score = 90;

        List<Student> correctStudents = new ArrayList<>();
        correctStudents.add(new Student("Марія", 92));
        correctStudents.add(new Student("Олена", 97));

        Assertions.assertEquals(correctStudents, Lambda.studentFiltering(students, 90));
    }

    @Test
    void sortByName(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Іван", 85));
        students.add(new Student("Марія", 92));
        students.add(new Student("Петро", 78));
        students.add(new Student("Олена", 97));

        List<Student> correctStudents = new ArrayList<>();
        correctStudents.add(new Student("Іван", 85));
        correctStudents.add(new Student("Марія", 92));
        correctStudents.add(new Student("Олена", 97));
        correctStudents.add(new Student("Петро", 78));

        Lambda.sortByName(students);

        Assertions.assertEquals(correctStudents, students);
    }

    @Test
    void sortByScore(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Іван", 85));
        students.add(new Student("Марія", 92));
        students.add(new Student("Петро", 78));
        students.add(new Student("Олена", 97));

        List<Student> correctStudents = new ArrayList<>();
        correctStudents.add(new Student("Петро", 78));
        correctStudents.add(new Student("Іван", 85));
        correctStudents.add(new Student("Марія", 92));
        correctStudents.add(new Student("Олена", 97));

        Lambda.sortByScore(students);

        Assertions.assertEquals(correctStudents, students);
    }

    @Test
    void addScoreForEach(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Іван", 85));
        students.add(new Student("Марія", 92));
        students.add(new Student("Петро", 78));
        students.add(new Student("Олена", 97));

        int score = 10;

        List<Student> correctStudents = new ArrayList<>();
        correctStudents.add(new Student("Іван", 95));
        correctStudents.add(new Student("Марія", 102));
        correctStudents.add(new Student("Петро", 88));
        correctStudents.add(new Student("Олена", 107));

        Lambda.addScoreForEach(students, score);

        Assertions.assertEquals(correctStudents, students);
    }
}
