package Java8Features;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

//-----------------------------Lombok--------------------------------------
@AllArgsConstructor
@Getter
@Setter
@ToString
class StudentDetails
{
    private String name;
    private int rollNo;
    private int age;
}

public class AllinOne {
    public static void main(String[] args) {
        List<StudentDetails> list=new ArrayList<>();
        list.add(new StudentDetails("santosh",1,18));
        list.add(new StudentDetails("kumar",2,19));
        list.add(new StudentDetails("raja",3,30));
        list.add(new StudentDetails("senthil",4,45));
        list.add(new StudentDetails("roshan",5,15));

        //---------------------Functional Interface-------------------------------
        //---------------------Method Reference----------------------------
        Comparator<StudentDetails> nameComparator= Comparator.comparing(StudentDetails::getName);
        list.sort( Comparator.comparing(StudentDetails::getName));

        //----------------------------Streams-------------------------------------
        AtomicInteger i= new AtomicInteger(1);
        list.forEach(student->student.setRollNo(i.getAndIncrement()));

        list.forEach(System.out::println);

        IntStream is=IntStream.of(0,5);
        is.forEach(System.out::println);

    }
}
