public class Bank {
    public Bankacc accounts;
    public String name;
    public int code;
    public void deposit(int code, int amount) {
        if (accounts.getNumber() == code) {
            accounts.add(amount);
        }
    }
    public void withdraw(int code, int amount) {
        if (accounts.getNumber() == code) {
            accounts.substruct(amount);
        }
    }
}
