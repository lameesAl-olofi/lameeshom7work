public class Hom47 extends Questions{

    public Hom47(String text, String answer) {
        super(text, answer);
    }

    public void settext(String text){super.setText(text);}
    public void display(){
        int i=0;
        while (i<text.length()){
            if(text.charAt(i)=='_')break;
            System.out.println(text.charAt(i));
            i++;
        }
        System.out.println("--------------");
    }public String gettextWithAnswer(){
        return text;
    }
}
