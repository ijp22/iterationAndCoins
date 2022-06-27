public class Coins {
    public static void calculateChange(int cost, int amount) {
        int balance = amount - cost;
        int fiftyPound = 0;
        int twentyPound = 0;
        int tenPound = 0;
        int fivePound = 0;
        int twoPound = 0;
        int onePound = 0;
        int fiftyPence = 0;
        int twentyPence = 0;
        int tenPence = 0;
        int fivePence = 0;
        int twoPence = 0;
        int onePence = 0;

        System.out.println("Balance: " + balance);

        while (balance > 0){
            if(balance >= 5000){
                fiftyPound++;
                balance -= 5000;
            } else if (balance >= 2000) {
                twentyPound++;
                balance -= 2000;
            }else if (balance >= 1000) {
                tenPound++;
                balance -= 1000;
            }else if (balance >= 500) {
                fivePound++;
                balance -= 500;
            }else if (balance >= 200) {
                twoPound++;
                balance -= 200;
            }else if (balance >= 100) {
                onePound++;
                balance -= 100;
            }else if (balance >= 50) {
                fiftyPence++;
                balance -= 50;
            }else if (balance >= 20) {
                twentyPence++;
                balance -= 20;
            }else if (balance >= 10) {
                tenPence++;
                balance -= 10;
            }else if (balance >= 5) {
                fivePence++;
                balance -= 5;
            }else if (balance >= 2) {
                twoPence++;
                balance -= 2;
            }else {
                onePence++;
                balance -= 1;
            }
        }

        System.out.println(fiftyPound + " -> £50 Note");
        System.out.println(twentyPound + " -> £20 Note");
        System.out.println(tenPound + " -> £10 Note");
        System.out.println(fivePound + " -> £5 Note");
        System.out.println(twoPound + " -> £2 coin");
        System.out.println(onePound + " -> £1 coin");
        System.out.println(fiftyPence + " -> 50p coin");
        System.out.println(twentyPence + " -> 20p coin");
        System.out.println(tenPence + " -> 10p coin");
        System.out.println(fivePence + " -> 5p coin");
        System.out.println(twoPence + " -> 2p coin");
        System.out.println(onePence + " -> 1p coin");
    }
}
