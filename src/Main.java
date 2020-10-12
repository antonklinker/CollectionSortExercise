import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> StringNames = new ArrayList<>();
        StringNames.add("Albert");
        StringNames.add("Berta");
        StringNames.add("Robert");
        StringNames.add("Aisha");
        StringNames.add("Aske");

        List<Integer> IntegerList = new ArrayList<>();
        IntegerList.add(10);
        IntegerList.add(1);
        IntegerList.add(5);
        IntegerList.add(8);
        IntegerList.add(7);
        IntegerList.add(2);

        for (int i=0; i<IntegerList.size(); i++) {
            System.out.println("index " + i + " is item " + IntegerList.get(i));
        }


        for (String s : StringNames) {
            System.out.println(s);
        }

        //Collections.sort(IntegerList);
        //IntegerList.sort(Integer::compareTo);
        IntegerList.sort(new ReverseComparator());


        //Collections.sort(StringNames);
        StringNames.sort(String::compareTo);

        for (int i=0; i<IntegerList.size(); i++) {
            System.out.println("index " + i + " is item " + IntegerList.get(i));
        }

        for (String s : StringNames) {
            System.out.println(s);
        }

        for (int i=0; i<IntegerList.size(); i++) {
            System.out.println("index " + i + " is item " + IntegerList.get(i));
        }

        List<Student> MyStudents = new ArrayList<>();
        MyStudents.add(new Student("Albert", 27, 'M', 10));
        MyStudents.add(new Student("Berta", 25, 'F', 7));
        MyStudents.add(new Student("Robert", 26, 'M', 7));
        MyStudents.add(new Student("Aisha", 15, 'F', 12));
        MyStudents.add(new Student("Aske", 22, 'M', 12));

        for (Student s : MyStudents) {
            System.out.println(s.getName() + ", " + s.getAge() + ", " + s.getSex() + ", " + s.getGrade());
        }

        MyStudents.sort(new AgeComparator());

        for (Student s : MyStudents) {
            System.out.println(s.getName() + ", " + s.getAge() + ", " + s.getSex() + ", " + s.getGrade());
        }
    }
}

class ReverseComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return -o1.compareTo(o2);
    }

}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}