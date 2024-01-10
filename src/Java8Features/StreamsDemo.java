package Java8Features;
import lombok.*;
import java.util.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Student
{
    private int rollNumber;
    private int age;
    private String name;
}
public class StreamsDemo {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(1,23,"dhianesh"));
        studentList.add(new Student(2,35,"santosh"));
        studentList.add(new Student(3,22,"kumar"));
        studentList.add(new Student(4,19,"Rahul"));

        List<Integer> studentAge=studentList.stream()
                .map(Student::getAge)
                .filter(age -> age >20)
                .toList();
        studentList.stream()
                .filter(s->s.getAge()<30)
                .forEach(s->System.out.println(s.getName()));
        for (Integer age: studentAge)
        {
            System.out.println(age);
        }
        Comparator<Student> c= Comparator.comparingInt(Student::getAge);
        studentList.sort(c);
        studentList.stream()
                        .map(Student::getAge)
                . forEach(System.out::println);
        System.out.println(studentList);
        }
}
