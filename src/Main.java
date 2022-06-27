public class Main {
    public static void main(String[] args) {
        // Exercise 1
        int a = 100;
        while (a < 200){
            System.out.println("A: " + a);
            a++;
        }

        System.out.println();
        System.out.println("----------------------");
        System.out.println();

        // Exercise 2
        int b = 100;
        while(b <= 200){
            if(b % 2 == 0){
                System.out.println("-");
                b++;
            }
            System.out.println("*");
            b++;
        }

        System.out.println();
        System.out.println("----------------------");
        System.out.println();

        // Exercise 3
        for(int c = 1; c <= 10; c++){
            for(int d = 1; d <= 10; d++){
                System.out.println(d);
            }
        }

        System.out.println();
        System.out.println("----------------------");
        System.out.println();

        // Exercise 4
        for(int e = 100; e < 201; e++){
            System.out.println(e);
        }

        System.out.println();
        System.out.println("----------------------");
        System.out.println();

        for(int f = 100; f < 201; f++){
            if(f % 2 == 0){
                System.out.println("-");
            }
            System.out.println("*");
        }

        System.out.println();
        System.out.println("----------------------");
        System.out.println();

        // Exercise 5
        for(int g = 1; g <= 10; g++){
            for(int h = 1; h <= g; h++){
                System.out.print(g + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("----------------------");
        System.out.println();


        // Coins Challenge
        Coins.calculateChange(402, 2000);
    }
}