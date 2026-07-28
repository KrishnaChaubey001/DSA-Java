package revision;
import java.util.Scanner;
public class Variables_input {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Name : ");
        String name=input.nextLine();
        System.out.print("Age : ");
        int age= input.nextInt();
        System.out.println("My name is "+name+" and my age is "+age);
    }

}
