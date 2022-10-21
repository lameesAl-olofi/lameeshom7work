public class Instructor extends Hom97 {

    public Instructor(String name, String birthday) {
        super(name, birthday);
    }
    public Instructor(String name,String birthday,Double salary){
        super(name,birthday);
        salary=salary;
    }public String toString(){
        String salary = null;
        String full=super.toString()+" "+salary;
        return full;
    }
}
