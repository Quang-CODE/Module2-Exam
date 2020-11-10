import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    Scanner scanner = new Scanner(System.in);
    public String checkPhoneNumber(){
        String number;
        String input = scanner.nextLine();
        String regex ="^([0])+([0-9]{9})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            number = input;
        }else{
            System.out.println("Please enter again!");
            number = checkPhoneNumber();
        }
        return number;
    }
    public String checkEmail(){
        String email;
        String input = scanner.nextLine();
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            email = input;
        }else{
            System.out.println("Please enter again!");
            email = checkEmail();
        }
        return email;
    }
}
