public class Hom27 extends Hom17 {
    public void withdraws(double amount){
        if(amount<=this.balance){
            super.withdraws(amount);
        }else
            super.withdraws(amount+30);
        System.out.println("you withdraw more");
    }
}
