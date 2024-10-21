public class Bankacc {
    public int number;
    public int balance;
    public String owner;
    public int getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }
    public void add(int pricist) {
        balance+=pricist;
    }
    public void substruct(int odecist) {
        balance-=odecist;
    }

}
