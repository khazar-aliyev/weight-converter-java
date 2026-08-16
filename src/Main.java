import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("---------\nHello Dear User!!!\n---------");
        System.out.println("Dou you want to measure your weight? Yes/No ");
        String yn = scanner.nextLine();
        yn = yn.toLowerCase();
        if(yn.equalsIgnoreCase("yes")){
            System.out.print("Enter your weight: ");
            double weight = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Is it kgs or lbs? ");
            String kl = scanner.nextLine();
            kl = kl.toLowerCase();
            if(kl.equalsIgnoreCase("kgs")){
                double toLbs = weight* 2.2046;
                System.out.printf("Your weight is %.2f lbs",toLbs);
            } else if (kl.equalsIgnoreCase("lbs")) {
                double toKgs = weight/2.2046;
                System.out.printf("Your weight is %.2f kgs",toKgs);
            }
            else{
                System.out.println("You stupid");
            }
        }
        else{
            System.out.println("Okey bye");
        }



    }
}
