import java.util.Date;
import java.util.Scanner;

public class Validate {
    Scanner input = new Scanner(System.in);

    public int getInt() {
        try {
            return Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return getInt();
        }
    }
    public String getStr(){
        return String.valueOf(input.nextLine());
    }
    public int getDate(){
        try{
            return  Integer.parseInt(input.nextLine());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
            return getDate();
        }
    }
}
