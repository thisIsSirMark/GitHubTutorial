import animal.Animal;
import animal.Dog;
import java.util.Scanner;

import javax.swing.JFrame;

public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JFrame mFrame = new JFrame("JFrameExmaple);
						JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        JLabel label = new JLabel("JFrame By Example");  
        JButton button = new JButton();  
        button.setText("Button");  
        panel.add(label);  
        panel.add(button);  
        frame.add(panel);  
        frame.setSize(200, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);      
        
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