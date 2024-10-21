public class Main {
    public static void main(String[] args) {

        //lidi
        Human clovek = new Human();
        clovek.name = "Ales";
        clovek.age = 39;
        
        Human clovek2 = new Human();
        clovek2.name = "Nikolas";
        clovek2.age = 28;

        //ucty
        Bankacc alesacc = new Bankacc();
        alesacc.balance = 1000000;
        alesacc.number = 11111;
        alesacc.owner = "Ales";
        clovek.account = alesacc;

        alesacc.add(60);
        alesacc.substruct(365);

        Bankacc nikacc = new Bankacc();
        nikacc.balance = 30000;
        nikacc.number = 22222;
        nikacc.owner = "Nikolas";
        clovek2.account = nikacc;

        nikacc.add(60);
        nikacc.substruct(365);

        //banka
        Bank ab = new Bank();
        ab.name = "Air/Bank";
        ab.code = 1234;

        ab.deposit(11111, 69);
        ab.withdraw(22222, 420);

        System.out.println(alesacc.balance);
        System.out.println(alesacc.number);
        System.out.println(nikacc.number);

        System.out.println(alesacc.owner);
        System.out.println(nikacc.owner);


    }
}