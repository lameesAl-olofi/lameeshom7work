public class Hom37 extends Questions{
    public Hom37(String text, String answer) {
        super(text, answer);
    }

    private double answer;

    public void setAnswer(double answer) {
        this.answer = answer;
    }public boolean check(String response){
        double responsedouble=Double.parseDouble(response);

        return false;
    }

    private boolean abs() {
        double responsedouble=0;
        return Math.abs(responsedouble-answer)<=0.01;
    }
}
