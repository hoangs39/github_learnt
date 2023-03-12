package package2;

public class PackageTest {
    public static void main(String[] args) {
        var stu = new package1.Students();
        stu.major = "Mathematics";
        stu.name = "Dang Tran Thu Thuy";
        stu.studentId = "s3924568";
        
        System.out.println(stu.major + " " + stu.name + " " + stu.studentId);
        System.out.printf("%s %s %s\n", stu.major, stu.name, stu.studentId);
    }
    
}
