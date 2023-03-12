package package1;

public class StudentsTest {
    public static void main(String[] args) {
        Students stu = new Students();
        stu.major = "Mathematics";
        stu.name = "Dang Tran Thu Thuy";
        stu.studentId = "s3924568";

        System.out.println(stu.major + " " + stu.name + " " + stu.studentId);
        System.out.printf("%s %s %s\n", stu.major, stu.name, stu.studentId);
    }
    
}
