public class Hom17 {
    protected double balance;
    public void deposits(double amount){
        balance=balance+amount;
    }public void withdraws(double amount){
        balance=balance-amount;
    }

    public double getBalance() {
        return balance;
    }public void addinterest(){
        double rate=((balance*10)/100);
        balance=balance*rate;
    }
}
