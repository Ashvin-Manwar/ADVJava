package OOPs.generics.comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
@Override
    public String toString(){
        return rollno+" ";// to dispaly roll no
}

//   / @Override
//    public int compareTo(Student o) {
//        int diff = (int)(this.marks - o.marks);
//        return diff;
//        // if diff == 0: means both are equal
//        // if diff < 0: means o is bigger else o is smaller
//
//    }

//    @Override
//    public String toString() {
//        return marks + "";
//    }

}
