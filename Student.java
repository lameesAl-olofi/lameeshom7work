public class Student extends Hom97 {
    private String major;
    public Student(String name, String birthday,String major){
        super(name,birthday);
        major=major;

    }public String toString(){
        String full=super.toString()+ " "+major;
        return full;
    }
}
