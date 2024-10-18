public class Main {
    public static void main(String[] args) {

        Human clovek = new Human();
        clovek.name = "Ales";
        clovek.age = 39;

        Bankacc acc = new Bankacc();
        acc.balance = 1000000;
        acc.number = 3145;

        acc.add(3000);
        acc.substruct(210345);

        System.out.println(acc.balance);


    }
}