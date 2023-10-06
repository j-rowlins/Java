import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        
        System.out.println("Please reply with:");
        System.out.println("0:Check Balance");
        System.out.println("1:Okoa 250");
        System.out.println("2:Okoa 100");
        System.out.println("3:Okoa 50");
        System.out.println("4:Okoa 20");
        System.out.println("5:Okoa 10");
        System.out.println("6:Okoa 5");
        System.out.println("7:Okoa Bundles");
        System.out.println("8:Okoa SMS");
        System.out.println("9:Unsubscribe");
        System.out.println("10:HOME");
        
        
        int choice = input.nextInt();
        System.out.println("Enter your Choice:");
        
               

            
            switch(choice){
                case 0:
                System.out.println("You selected option 0\n");
                break;
                case 1:
                System.out.println("You selected option 1\n");
                break;
                case 2:
                System.out.println("You selected option 2\n");
                break;                
                case 3:
                System.out.println("You selected option 3\n");
                break;
                case 4:
                System.out.println("You selected option 4\n");
                break;
                case 5:
                System.out.println("You selected option 5\n");
                break;
                case 6:
                System.out.println("You selected option 6\n");
                break;               
                case 7:
                System.out.println("You selected option 7\n");
                break;
                case 8:
                System.out.println("You selected option 8\n");
                break;
                case 9:
                System.out.println("You selected option 9\n");
                break;
                case 10:
                System.out.println("You selected option 10\n");
                break;
                default: 
                {
                    System.out.println("Invalid choice");
                }
            }
            
        while (choice==0){
            System.out.println("Dear customer,Okoa Jahazi balance is");
            System.out.println("kshs 50 due on 05-10-2024");
            System.out.println("98:more\t 0:Back");
            option= input.nextInt();
            System.out.println(" ");
            break;
        }
        do{
            System.out.println("Please reply with:");
        System.out.println("0:Check Balance");
        System.out.println("1:Okoa 250");
        System.out.println("2:Okoa 100");
        System.out.println("3:Okoa 50");
        System.out.println("4:Okoa 20");
        System.out.println("5:Okoa 10");
        System.out.println("6:Okoa 5");
        System.out.println("7:Okoa Bundles");
        System.out.println("8:Okoa SMS");
        System.out.println("9:Unsubscribe");
        System.out.println("10:HOME");
        
        
        
        System.out.println("Enter your Choice:");
            continue;
        }while(choice==0);
            input.close();
    }
        
    }
    
