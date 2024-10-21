public class Main {
    public static void main(String[] args) {

        //lidi
        Human Ales = new Human();
        Ales.name = "Ales";
        Ales.age = 39;
        
        Human Nikolas = new Human();
        Nikolas.name = "Nikolas";
        Nikolas.age = 28;

        //ucty
        Bankacc alesacc = new Bankacc();
        alesacc.balance = 1000000;
        alesacc.number = 11111;
        alesacc.owner = "Ales";
        Ales.account = alesacc;

        alesacc.add(60);

        Bankacc nikacc = new Bankacc();
        nikacc.balance = 30000;
        nikacc.number = 22222;
        nikacc.owner = "Nikolas";
        Nikolas.account = nikacc;

        nikacc.substruct(365);

        //banka
        Bank ab = new Bank();
        ab.name = "Air/Bank";
        ab.code = 1234;
        ab.setInfo();

        ab.deposit(11111, 69);
        ab.withdraw(22222, 420);

        System.out.println(alesacc.balance);

        System.out.println(alesacc.owner);
        System.out.println(nikacc.owner);


    }
}