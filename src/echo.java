//**Author : Bethlehem Teshome
//* echo using variables
//*09/14/2017
import java.util.Scanner;
import javax.swing.JOptionPane;
public class echo {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);

        byte n1;
        short n2;
        int n3;
        long n4;
        double n5;
        float n6;
        boolean n7;
        char n8;

        System.out.println("Enter a byte, short, int, long, double, float, boolean, and a char");
        n1 = keyboard.nextByte();
        n2 = keyboard.nextShort();
        n3 = keyboard.nextInt();
        n4 = keyboard.nextLong();
        n5 = keyboard.nextDouble();
        n6 = keyboard.nextFloat();
        n7 = keyboard.nextBoolean();
        n8 = keyboard.next().charAt(0);

        JOptionPane.showMessageDialog(null, "you just entered a byte , short, int, long,double,float, boolean,and a " +
                "character");
    }
}