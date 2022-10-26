import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

      List<Student> list = Arrays.asList( new Student("Dmitrii", 17, Gender.MAN),
                new Student("Max", 20, Gender.MAN),
                new Student("Ekaterina", 20, Gender.WOMAN),
                new Student("Michael", 28, Gender.MAN));

        System.out.println(list.stream().filter(x -> x.getGender().equals(Gender.MAN))
                .map(Student::getAge)
                .reduce((x, y) -> (x + y) / 2)
                .orElse(0));
    }
}
