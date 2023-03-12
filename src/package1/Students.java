package package1;
/*
 * @author HoangDang COSC2034 RMIT
 * @version 1.0
 */
public class Students {
    /*
     * Public access modifiers
     * those fields can be accessed by classes from any package outsides.
     */
    public String name;
    public String studentId;
    public String major;
    /*
     * default access modifiers
     * those fields can be accessed by classes from the same package only.
     */
    // String name;
    // String studentId;
    // String major;
    public Students(){}
    public Students(String name, String studentId, String major) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
    }

}
