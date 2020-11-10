import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBookMethods methods = new PhoneBookMethods();
        Scanner scanner = new Scanner(System.in);
        CSV csv = new CSV();
        File file = csv.getFile();
        do {
            System.out.println("---PHONE BOOK---");
            System.out.println("1.Show contact list");
            System.out.println("2.Add client");
            System.out.println("3.Edit client");
            System.out.println("4.Delete client");
            System.out.println("5.Search for client");
            System.out.println("6.Read from file");
            System.out.println("7.Write to file");
            System.out.println("8.Exit");
            switch (Integer.parseInt(scanner.nextLine())){
                case 1:
                    methods.showClientList();
                    break;
                case 2:
                    methods.addClientsToContact(methods.createClients());
                    break;
                case 3:
                    System.out.println("Please enter client phone number to edit");
                    String input = scanner.nextLine();
                    methods.editClient(input);
                    break;
                case 4:
                    System.out.println("Please enter client phone number to delete");
                    String input1 = scanner.nextLine();
                    methods.removeClientOutOfContact(input1);
                    break;
                case 5:
                    System.out.println("1.Search by name");
                    System.out.println("2.Search by phone number");
                    switch(Integer.parseInt(scanner.nextLine())){
                        case 1:
                            System.out.println("Please enter name to find");
                            String input2 = scanner.nextLine();
                            methods.findClientUsingName(input2);
                            break;
                        case 2:
                            System.out.println("Please enter phone number to find");
                            String input3 = scanner.nextLine();
                            methods.findClientUsingPhoneNumber(input3);
                            break;
                    }
                    break;
                case 6:
                    csv.readFile(file);
                    break;
                case 7:
                    csv.writeToFile(methods.getClientList(),file);
                    break;
                case 8:
                    System.exit(1);
            }

        }while(true);
    }
}
