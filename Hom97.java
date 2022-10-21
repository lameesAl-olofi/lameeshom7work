public class Hom97 {
    protected String name;
    protected String birthday;

    public Hom97(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String toString(){
        String full=name+" "+birthday;
        return full;
    }
}
