import Universidad.Faculty;
import Universidad.Professor;

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor();
        Faculty faculty = new Faculty();

        prof.setId("001");
        prof.setName("Luis");
        prof.setLastname("Perez");
        prof.setTitle("Head of Systems Engineering Department");
        prof.setCoordination(1000, "Systems Engineering");

        faculty.setId(1010);
        faculty.setName("Engineering Faculty");
        faculty.setBuilding("Main building");
        faculty.addCoordination(prof.m_Coordination.getCode(), prof.m_Coordination.getName());
        faculty.addCoordination(1020, "Civil Engineering");
        faculty.addCoordination(1030, "Mechanical Engineering");

        System.out.println(faculty);
    }
}
