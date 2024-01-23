import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите 1-4:\n");
        Scanner scan = new Scanner(System.in);
        int slct = 3;
        switch (slct) {
            case 1:
                Zadanie_1 Z1 = new Zadanie_1();
                Z1.task1();
                break;
            case 2:
                Zadanie_2 Z2 = new Zadanie_2();
                Z2.task2();
                break;
           case 3:
                Zadanie_3 Z3 = new Zadanie_3();
                Z3.task3(); break;
/*             case 4:
                z4 Z4 = new z4();
                Z4.zz4(); break;*/
            default:
                System.out.println("Такого варианта нет:");
                scan.close();
        }
    }
}