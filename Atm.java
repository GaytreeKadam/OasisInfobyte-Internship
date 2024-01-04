//import required classes and packages
import java.util.*;
class  UserBank{
    String customerName;
    int customerAge;
    int accountid;
    String accountType;
    double balance=0;
    //create scanner class object to get input from the user
    Scanner sc = new Scanner(System.in);
    void createAccount(){  //method to create an Account
        System.out.println("Enter the name:"); //printing on console
        customerName=sc.nextLine(); //taking customer name as input from user
        System.out.println("Enter the account type:");
        accountType=sc.nextLine(); //taking account type as input from user
        System.out.println("Enter the account id:");
        accountid=sc.nextInt(); //taking account id as input from user
        System.out.println("Enter Balance:");
        balance=sc.nextDouble(); //taking balance as input from user
        System.out.println("enter the age:");
        customerAge=sc.nextInt(); //taking customer age as input from user
        //check whether the age is less than 18
        if(customerAge<18){
            do{
                System.out.println("Minimum age should be 18 to create an account.\nPlease enter valid age: ");
                customerAge=sc.nextInt();
            }while(customerAge<18);
            System.out.println("Account created Successful!!");

        }

    }
    //method to Display Account Information
    void displayAccountInformation(){
        System.out.println("Welcome  "+customerName+"  following are your account details:");
        System.out.println("Age :"+customerAge );
        System.out.println("Account Id :"+accountid);
        System.out.println("Account Type :"+accountid);
        System.out.println("Balance :"+balance);
        System.out.println("");
    }
    //method to Deposit Ammount
    void depositeAmount(){
        double deposit;
        System.out.println("Enter money to be Deposited:");
        // get the deposit amount from user
        deposit=sc.nextDouble();
        balance=balance+deposit;// previous balance +deposit
        System.out.println("Your Money has been Successfully deposit");


    }
    void withdrawAmount(){
        double withdraw;
        // get the withdraw money from user
        System.out.println("Enter Amount you want to withdraw :");
        withdraw=sc.nextDouble();
        //check whether the balance is greater than or equal to the withdrawal amount
        if(balance<=withdraw){
            //show custom error message
            System.out.println("Insufficient Balance");
            System.out.println("Transaction Decline !!");
            System.out.println("=================================================================");

        }else{
            //remove the withdrawl amount from the total balance
            balance=balance-withdraw;
            System.out.println("Remaining balace in the Account :"+balance
            );
            System.out.println("===================================================================");

        }



    }
    void totalBalance(){
        //display Total balance
        System.out.println("total balance :"+balance);
    }
}

public class Atm {
    public static void main (String args []){
        Scanner a=new Scanner(System.in);
        //creating the object of class Details
       UserBank d=new UserBank() ;
       do{
            //menu driven program
            System.out.println("1.Create Account");
            System.out.println("2.Display Account ");
            System.out.println("3.Check Balance");
            System.out.println("4.Deposit Account");
            System.out.println("5.Withdraw Amount");
            System.out.println("6.Exit");
            System.out.println("_____________________________________________________");
            System.out.println("Enter your Choice :");
            int choice=a.nextInt();
            switch(choice){
                //switch case
                case 1:
                    d.createAccount(); //calling createAccount method by using reference
                    System.out.println("============================================");
                    break;
                case 2:
                    d.displayAccountInformation(); //calling displayAccountInformation method
                    System.out.println("============================================");
                    break;
                case 3:
                    d.totalBalance();    //calling totalBalance method
                    System.out.println("============================================");
                    break;
                case 4:
                    d.depositeAmount();//calling depositAmount method
                    System.out.println("============================================");
                    break;
                case 5:
                    d.withdrawAmount(); //calling withdrawAmount method
                    System.out.println("============================================");
                    break;
                case 6:
                    System.out.println("============================================");
                    return; //stop execution of program
                default:
                    System.out.println("INVALID INPUT !!");
                    System.out.println("============================================");
                    break;
            }
        }while(true);


    }
}


