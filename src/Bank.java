public class Bank {
    Bankacc acc;
    
    public String name;
    public int code;
    public void deposit(int cod, int amount) {
        if (acc.number != cod) {
            System.out.println("Bad pin");
        } else {
            acc.add(amount);
        }
    }
    public void withdraw(int cod, int amount) {
        if (acc.number != cod) {
            System.out.println("Bad pin");
        } else {
            acc.add(amount);
        }
    }
}
