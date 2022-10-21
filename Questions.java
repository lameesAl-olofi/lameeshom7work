public class Questions {
    protected String text;
    private String answer;

    public Questions(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }public void display(){
        System.out.println(text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }public boolean check(String respons){
        int i=0,sum=0;
        String cap_respons=respons.toUpperCase();
        String cap_answer=answer.toUpperCase();
        while (i<answer.length()&&cap_answer.charAt(i)==cap_respons.charAt(i)){
            i++;
            sum++;
        }if(sum==answer.length()) return true;
        else return false;
    }
}
