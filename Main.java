
import java.util.Scanner;



public class Main {
    public static void main(String[] args){
        //

        System.out.println("Choose your PC type: Gaming or Office");
        System.out.println("Write 'gaming' for Gaming PC or 'office' for Office PC");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("gaming")){

            GamingBuilder gamingBuilder = new GamingBuilder();
            Director director = new Director(gamingBuilder);
            PC gamingPC = director.constructGamingPC();

            System.out.println(gamingPC);
            System.out.println("Your Gaming PC is ready!");

    }else if (choice.equalsIgnoreCase("office")){
            OfficeBuilder officeBuilder = new OfficeBuilder();
            Director director = new Director(officeBuilder);
            PC officePC = director.constructOfficePC();

            System.out.println(officePC);
            System.out.println("Your Office PC is ready!");

        } else {
            System.out.println("Invalid input. Please choose 'gaming' or 'office'.");
        }
        scanner.close();
    }
}
