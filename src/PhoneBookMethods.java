import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookMethods {
    ArrayList<Clients> contactList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Regex regex = new Regex();
    public void addClientsToContact(Clients a){
        contactList.add(a);
        System.out.println("Client added to phonebook!");
    }
    public void removeClientOutOfContact(String input){
        boolean check = false;
        for (Clients a:contactList) {
            if(input.equals(a.getPhoneNumber())){
                contactList.remove(a);
                check = true;
            }
        }
        if(check){
            System.out.println("Successfully removed!");
        }else{
            System.out.println("Can't find phone number");
        }
    }
    public Clients createClients(){
        Clients client = new Clients();
        System.out.println("Enter name");
        client.setName(scanner.nextLine());
        System.out.println("Enter phone number");
        client.setPhoneNumber(regex.checkPhoneNumber());
        System.out.println("Enter gender");
        client.setGender(scanner.nextLine());
        System.out.println("Enter address");
        client.setAddress(scanner.nextLine());
        System.out.println("Enter contact group");
        client.setContactGroup(scanner.nextLine());
        System.out.println("Enter date of birth");
        client.setDateOfBirth(scanner.nextLine());
        System.out.println("Enter email");
        client.setEmail(regex.checkEmail());
        return client;
    }
    public void editClient(String input){
        boolean check = false;
        for (Clients a:contactList){
            if(input.equals(a.getPhoneNumber())){
                contactList.remove(a);
                contactList.add(createClients());
                check = true;
            }
        }
        if(check){
            System.out.println("Successfully edit client");
        }else{
            System.out.println("Can't find the client to edit");
        }
    }
    public void findClientUsingName(String input){
        boolean check = false;
        for (Clients a:contactList){
            if(input.equals(a.getName())){
                System.out.println(a.toString());
                check = true;
            }
        }
        if(!check){
            System.out.println("Can't find any client with that name");
        }
    }
    public void findClientUsingPhoneNumber(String input){
        boolean check = false;
        for (Clients a:contactList){
            if(input.equals(a.getPhoneNumber())){
                System.out.println(a.toString());
                check = true;
            }
        }
        if(!check){
            System.out.println("Can't find any client with that name");
        }
    }
    public void showClientList(){
        for (Clients a:contactList) {
            System.out.println(a.toString());
        }
    }
    public ArrayList<Clients> getClientList(){
        return contactList;
    }

}
