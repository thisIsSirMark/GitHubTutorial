import animal.Animal;
import animal.Dog;
import java.util.Scanner;

import javax.swing.JFrame;

public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JFrame mFrame = new JFrame();

    
        Dog myDog = new Dog();

        myDog.eat();
        myDog.rest();

        myDog.name = "kobi";

        System.out.print("Enter dogs name: ");
		myDog.name = sc.nextLine();

        System.out.println("Your dog's name is "+myDog.name +".");

        sc.close();
    }
}