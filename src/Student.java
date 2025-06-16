public class Student{
    private String name;
    private final String USN;


    public Student(String name,String  USN){
        this.name=name;
        this.USN=USN;
    }

    public void displayInfo(){
        System.out.println("Name: "+name+" "+"USN: "+" "+USN);
    }
    public String getUSN(){
        return USN;
    }
}
