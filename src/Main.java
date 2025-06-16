public class Main {
    public static void main(String[] args) {

        RLJIT college=new RLJIT();
        Dept CSE=new Dept("CSE","CSE");
        Dept ECE=new Dept("ECE","ECE");
        Dept ME=new Dept("ME","ME");
        Dept DS=new Dept("Data Science","XX");

        Student s1=new Student("Xyx","cd011");
        Student s2=new Student("YYY","cd022");

        DS.addStudent(s1);
        DS.addStudent(s2);


        college.DisplayDep();
        System.out.println();
        Student found= DS.findStudentByUSN("cd022");
        if(found!=null){
            System.out.println("student fond");
            found.displayInfo();
        }else{
            System.out.println("student not found");
        }
    }

}
