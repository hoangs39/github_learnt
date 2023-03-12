package package1;

public class Lecturer {
    String name;
    String employeeId;
    int rank;
    Project projectLed;

    public Lecturer(String name, String employeeId, int rank) {
        this.name = name;
        this.employeeId = employeeId;
        this.rank = rank;
    }

    public boolean leadProject(Project project) {
        if (projectLed == null || project.getLeader() == null) {
            projectLed = project;
            project.getLeader();
            return true;
        }
        return false;
    }

    public void joinProject(Project project) {
        project.addMember(this);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("name: %s, employeeId: %s, rank: %d", name, employeeId, rank);
    }
}
