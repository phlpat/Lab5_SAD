package Behavior;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Observer Behavioral Design Pattern");

        StringPublisher publisher = new StringPublisher();

        StringSubscriber subscriber1 = new AlphabetSubscriber();
        StringSubscriber subscriber2 = new NumberSubscriber();
        StringSubscriber subscriber3 = new SymbolSubscriber();

        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);
        publisher.subscribe(subscriber3);

        Scanner scanner = new Scanner(System.in);
        String inp="";

        while(true){
            System.out.print("Enter Input : ");
            inp=scanner.nextLine();

            if(inp.equals("exit")){
                break;
            }

            publisher.publish(inp);
        }
        scanner.close();

    }
}