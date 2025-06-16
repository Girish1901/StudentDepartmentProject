import java.util.ArrayList;

public class RLJIT {
    private final ArrayList<Dept> Department;

    public RLJIT(){
        Department=new ArrayList<>();
    }
    public void AddDpt(Dept dept){
        Department.add(dept);
    }
    public void DisplayDep(){
        for(Dept departments:Department){
            System.out.println(departments.getname());
        }
    }
    public Dept findDepartmentbyname(String deptname){
        for(Dept deartments:Department){
            if(deartments.getname().equals(deptname)){
                return deartments;
            }
        }
        return null;
    }
}
