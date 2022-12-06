package OOPs.generics.comparing;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
//    int rollno;
//    float marks;
//
//    public Student(int rollno, float marks) {
//        this.rollno = rollno;
//        this.marks = marks;
//    }
//
//    @Override
//    public String toString() {
//        return marks + "";
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        System.out.println("in compareto method");
//        int diff = (int)(this.marks - o.marks);
//
//        // if diff == 0: means both are equal
//        // if diff < 0: means o is bigger else o is smaller
//
//        return diff;
//    }
public static void main(String[] args) {
    Student ashvin=new Student(12,89.78f);
    Student rahul=new Student(5,94.68f);
    Student Arpit=new Student(2,99.68f);
    Student KAran=new Student(13,88.68f);
    Student sachin=new Student(9,92.60f);
    Student[] list={ashvin,rahul,Arpit,KAran,sachin};

    System.out.println(Arrays.toString(list));

    Arrays.sort(list);
    System.out.println(Arrays.toString(list));


//    if (ashvin.compareTo(rahul)<0){
//        System.out.println(ashvin.compareTo(rahul));
//        System.out.println("Rahul has more marks");
//    }

}
}
