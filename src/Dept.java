import java.util.ArrayList;

public class Dept extends RLJIT{
    private String departmentname;
    private String HOD;
    private ArrayList<Student>students;

    public Dept(String departmentname,String HOD){
        this.departmentname=departmentname;
        this.HOD=HOD;
        students=new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }
    public void ListStudent(){
        for(Student stud:students){
            stud.displayInfo();
        }
    }
    public Student findStudentByUSN(String USN){
        for(Student Stud:students){
            if(Stud.getUSN().equals(USN)){
                return Stud;
            }
        }return null;
    }

    public String getname(){
        return departmentname;
    }
}
