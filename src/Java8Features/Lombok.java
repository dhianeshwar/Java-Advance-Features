package Java8Features;

import lombok.*;
import java.time.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

 class  LombokDemo extends RuntimeException {
    private  int rollNo;
    @NonNull
    private String name;
    private int age;
    private LocalDate dateOfRegistration;
    private LocalTime timeOfRegistration;

    public LombokDemo(String message)
    {
        super(message);
        System.out.println("Object created with empty constructor");
    }

}
class Lombok{
    public static void main(String[] args) throws NullPointerException {
//        try{
//        LombokDemo obj1=new LombokDemo();
//        obj1.setRollNo(12);
//        System.out.println(obj1.getRollNo());
//        System.out.println("Object 1="+obj1);
        LombokDemo obj2=new LombokDemo(22,null,34,LocalDate.now(),LocalTime.now());
        System.out.println("Object 2="+obj2);
//        }
//        catch (NullPointerException npe)
//        {
////            System.out.println();
//            throw new LombokDemo("name should not be null");
//        }
    }
}

