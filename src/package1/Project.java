package package1;

public class Project {
    String name;
    int budget;
    Lecturer leader;
    Lecturer[] members;
    static final int MAX_MEM = 10;
    int memCounts = 0;

    public Project(String name, int budget){
        this.name = name;
        this.budget = budget;
        members = new Lecturer[MAX_MEM];
    }

    public Lecturer getLeader(){
        return this.leader;
    }

    public void addMember(Lecturer member){
        members[memCounts++] = member;
    }

    public void displayMember(){
        for (int i = 0; i < memCounts; i++) {
            // System.out.printf("Name: %s\n",member.name);
            System.out.println(members[i].name);
        }
    }


}
