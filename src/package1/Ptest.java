package package1;

public class Ptest {
    public static void main(String[] args) {
        Project project1 = new Project("project1",1000);
        Project project2 = new Project("project2",20000);

        Lecturer lecturer1 = new Lecturer("Son","A1",1);
        Lecturer lecturer2  = new Lecturer("Hoang","A2",2);
        Lecturer lecturer3 = new Lecturer("Thuy","A3",3);
        Lecturer lecturer4  = new Lecturer("Gau","A4",4);
        Lecturer lecturer5 = new Lecturer("Hong","A5",6);
        Lecturer lecturer6  = new Lecturer("Hoa","A6",7);

        lecturer1.joinProject(project2);
        lecturer2.joinProject(project2);
        boolean l3 = lecturer3.leadProject(project2);
        System.out.println(l3);
        boolean l4 = lecturer4.leadProject(project1);
        System.out.println(l4);
        lecturer5.joinProject(project1);
        lecturer6.joinProject(project1);
        project1.displayMember();
        project2.displayMember();
    }
}
