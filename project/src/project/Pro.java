package project;
import java.util.*;
import java.lang.*;
import java.time.*;
import java.util.List;


public class Pro {
//    ceate array list type: User(Super class)
    static ArrayList<Intermediary> intermediaryList = new  ArrayList<Intermediary>();
    static ArrayList<Donor> DonorList = new  ArrayList<Donor>();
    static ArrayList<Donee> DoneeList = new  ArrayList<Donee>();
    public static ArrayList <String> MessageList = new  ArrayList<String>();
    static ArrayList<Donee>DoneeRequests= new ArrayList<Donee>();
    static ArrayList<Donee>DoneeReservation= new ArrayList<Donee>();
    static ArrayList<Reservation>ResrvationList= new ArrayList<Reservation>();
    static ArrayList<Intermediary>Intermediaryadd= new ArrayList<Intermediary>();
  
//    main_menu
 static String main_menu=" \n\n\t\t\t\t\t\t\t*** Welcome to Chiraty System ヽ(•‿•)ノ ❤ ***\n "
         + "\n  \t\t\t\t\t\t\t     Remember, we only have what we give \n";
         
//    main menue has Intermediary Sub-system, Donee Sub-system, Donor Sub-system, will exit the system if user enter (0)
static String main_menu2=" You must choose: "
         + "\n 1/ Donee "
         + "\n 2/ Intermediary"
         + "\n 3/ donor"
         + "\n 0/ to exit"
         + "\n\n •  Your Choice number: ";

// Intermediary Sub-system menue
 static String Intermediary_menu="\n\t\t\t\t*** Welcome to Intermediary Sub-system ***\n\n"+
 "\t1- Make new account \n" +
 "\t2- add a new clothes \n"+
 "\t3- update your information \n"+
 "\t4- Delete your information \n"+
 "\t5- Print all your information \n"+
 "\t0  Back to the Main Menu."+      
 "\n\n •  Your Choice number: " ; 
 
 // Donor Sub-system menue
 static String Donor_menu="\n\t\t\t\t*** Welcome to Donor Sub-system ***\n\n"+
 "\t1- Make new account \n" +
 "\t2- update your information \n"+
 "\t3- Delete your account \n"+
 "\t4- Print all your information \n"+
 "\t5- make a new money donation \n"+
 "\t6- make a new clothe donation \n"+
 "\t7- Write a message  \n"
         + "\t0 Back to the Main Menu."+      
 "\n\n •  Your Choice number: " ;
 
  // Donee Sub-system menue
 static String Donee_menu="\n\t\t\t\t*** Welcome to Donee Sub-system ***\n\n"+
 "\t1- Make new account \n" +
 "\t2- Update your personal information \n"+
 "\t3- Delete your personal information \n"+
 "\t4- Print all your information \n"+
 "\t5- Add donation request \n"+
 "\t6- Add clothe reservation request \n"+
 "\t7- Write a message  \n"
         + "\t0 Back to the Main Menu."+      
 "\n\n •  Your Choice number: " ; 
 
           static Scanner input=new Scanner(System.in);
//           creating objects
           static User newIntermediary;
           static User newDonor;
           static User newDonee;


    public static void main(String[] args) {
    
        // to show the main menue
             System.out.println(main_menu); 
             
//          int a; will allow user enter a number to go to Intermediary Sub-system, Donee Sub-system, Donor Sub-system, will exit the system if user enter (0)
            int a;
            
//          int b; will allow Intermediary enter a number, will exit the Intermediary and go to main if Intermediary enter (0)
            int b;
            
//          int c; will allow Donor enter a number, will exit the Donor and go to main if Donor enter (0)
            int c;
            
//          int D; will allow Donee enter a number, will exit the Donee and go to main if Donee enter (0)
            int d;
            
                     while(true) {
//                          will print menue while a doesnt =0
                            System.out.println(main_menu2);
                            
//                          enter value of a
                            a =input.nextInt();
                            
//                          Switch to go to Intermediary Sub-system, Donee Sub-system, Donor Sub-system
            switch (a){
//          case 1: Donee Sub-system  
                        case 1:
                       {
                do {
    //           will print Donee menue while d doesnt =0   
                              System.out.println(Donee_menu);
                               d=input.nextInt();
                               
                switch (d){

               case 1: 
//                 go to method to add donee information 
                   addDoneeInformation();
                   break;

               case 2:
//                 go to method to update
                   updateDonee();
                   break;

               case 3: 
//                 go to method to delete
                   deleteDonee();
                   break;

               case 4:
//                 print all donee information 
                   printDoneeInformation();
                   break; 

               case 5: 
                   AddDonationRequest();
                   break;
                    
               case 6: 
                  AddReservation();
                  break;
               case 7:
               {
                                       System.out.println("\t Write your message :  ");
                                       String M=input.next();
                                       MessageList.add(M);
                                       System.out.println(" message added :) ");
                                       boolean mmm=false ;
                                       do {
                                       System.out.println( "\n \t do you want to see all messages ? "
                                               + "\n 1 - if Yes press (1) "
                                               + "\n 2 - if No press (2)");
                                       int mm= input.nextInt();
                                       switch (mm){
                                           case 1 :
                                                message m;
                                                m=new Donee();
                                                m.printMessage();
                                                mmm= true;
                                                
                                                break;
                                           case 2 :
                                               mmm= true;
                                               break;
                                           default:
                                               System.out.println("\n  \t\t\t\t\t Sorry invalid choice \n");
                                       }
                                       }while ( mmm == false);
               }
                   break;
               case 0: break;

               default: System.out.println("\n  \t\t\t\t\t Sorry invalid choice \n"); 

           }

}

while(d!=0);}

                           break;   
                           
//          case 2: Intermediary Sub-system
                       case 2:
        {
            do {
//           will print Intermediary menue while b doesnt =0      

                              System.out.println(Intermediary_menu);
                               b=input.nextInt();
                               
               switch (b){
//              to add intermediarry informations
                   
               case 1: addIntermediary ();
                  break;
                  
               case 2: addclothe();
                  break;
                  
                case 3: updateIntermediary();
                  break;
             
               case 4:  deleteInter();
                   break;

               case 5: printIntermediary();
               break;
               
               case 0:
                   break;
                   
               default: System.out.println("\n  \t\t\t\t\t Sorry invalid choice \n"); 
           }
           }
           while (b!=0);}
                           break;
                           
//          case 3: Donor Sub-system    
          case 3:
                do {
              input.nextLine();
                            System.out.println(Donor_menu);
                            c=input.nextInt();
                               switch (c){
                                   
                                   case 1 :
                                       addDonor ();
                                    break;
                                    
                                   case 2:
                                       updateDonor();
                                    break;
                                    
                                   case 3:
                                       deleteDonor();
                                    break;
                                    
                                   case 4:{  
                                       printDonorInformation();
                                   }
                                       break;
                                   case 5:{
                                       AddDonation();
                                   }
                                       break;
                                   case 6:{
                                       AddPyment();
                                   }
                                   break;
                                   case 7:{
                                     
                                       System.out.println("\t Write your message :  ");
                                       String M=input.nextLine();
                                       MessageList.add(M);
                                       input.nextLine();
                                       System.out.println(" message added :) ");
                                       boolean mmm=false ;
                                       do {
                                           
                                       System.out.println( "\n \t do you want to see all messages ? "
                                               + "\n 1 - if Yes press (1) "
                                               + "\n 2 - if No press (2)");
                                       int mm= input.nextInt();
                                       switch (mm){
                                           case 1 :
                                               message m;
                                                m=new Donor();
                                                m.printMessage();
                                                mmm= true;
                                                break;
                                           case 2 :
                                               mmm= true;
                                               break;
                                           default:
                                               System.out.println("\n  \t\t\t\t\t Sorry invalid choice \n");
                                       }
                                       }while ( mmm == false);   
                                   }
                                   break;
                                   
                                 case 0: break;
                   
                                 default: System.out.println("\n  \t\t\t\t\t Sorry invalid choice \n"); 
                               }
                           }while (c != 0);
                       
                           break;
//          case 0: exit the system
                       case 0:
                           System.exit(0);
                                break;
                           
//          Default: if user choose wrong number will tell hem that his number is invalid and he will enter a new number        
                       default:
                       System.out.println("\n  \t\t\t\t\t Sorry invalid choice \n");
                         
                   }
              
          }
      
    }
    
    public static void addIntermediary (){
        
                    input.nextLine();
//                    name
                  System.out.print("\tPlease enter your name:");
                   String name=input.nextLine();
                   
//                   phone number
                   System.out.print("\tPlease enter your phone number:");
                   String phone=input.nextLine();   
                   // check if the entered is a true fon number
                   while (true){
//                       phoe number is true :)
                       if (phone.length()==10&&phone.startsWith("0"))
                           break;
                       else 
                       {
//                           check on phoe length 
                           if (phone.length()!=10)
                           {
                               System.out.println("\tSorry you entered "+ phone+" & it has "+phone.length()+" numbers, your phone number must contain 10 numbers,\n \tPlease enter your phone number again: ");
                       phone=input.nextLine(); 
                           }
//                           check for first number (must be zero
                           else 
                           {
                                System.out.println("\tSorry you entered "+ phone+" & it starts with  "+phone.charAt(0)+" ,your phone number must start with 0,\n \t Please enter your phone number again:  ");
                                phone=input.nextLine(); 
                           }
                       }
                   }
//                   email
                   System.out.print("\tPlease enter your email :");
                   String email=input.nextLine();  
                   String userName="";
                   String org="";
                   boolean match;
//                check if user entered true email
                   do
                   {
                   int firstAt = email.indexOf("@");
                   int firstdot = email.indexOf(".");
                   if (firstAt!=-1){
                    userName=email.substring(0, firstAt);
                   }
                   if (firstdot!=-1){
                   org=email.substring(firstdot+1, email.length());

                   }
                   
                       match=userName.contains("^")||userName.contains("{")||userName.contains( "(")||userName.contains("]")||userName.contains("{")||userName.contains("{")||userName.contains("/")||userName.contains(";")||userName.contains(".")||userName.contains(",")||userName.contains("\\");

                       if (email.length()>254)
//                           check for email length
                         System.out.print("\t wrong email it must has less than 254 character, Please enter the email  again:");   
//                      check that email has (@)
                       else if (firstAt==-1)
                        {
                             System.out.print("\t wrong email you must have (@),\n\tPlease enter the email again:");
                        email=input.nextLine(); 
                        }
                       //                      check that email has (.)

                         else if (firstdot==-1)
                        {
                             System.out.print("\t wrong email you must have (.),\n\tPlease enter the email again:");
                        email=input.nextLine(); 
                        }
                        else if (match==true)
                        {
                        System.out.print("\t wrong email you can not have [( ) < > , ; : \\ / \"  [ ] { } ] in email,\n\tPlease enter the email again:");
                        email=input.nextLine(); 
                        }
//                      check that the last part of email has 3 digit  
                        else if (org.length()!=3)
                            {
                        System.out.print("\t sorry the last part of your email must contain 3 letters, like(.com) & you entered: " +org.length()+"\n\tPlease enter the email again:");
                        email=input.nextLine(); }
//                                         check that email at least has 6 char
                       else if(userName.length()<5)
                       {
                            System.out.print("\t wrong email you must have at least 6 character before @,\n\tPlease enter the email again:");
                        email=input.nextLine(); 
                       }
//                        the email is true :) 
                        else break;
                   }
                   while (true);
//                 yob
                    

                   System.out.print("\tPlease enter Year of birth :");
                   int yob=input.nextInt(); 
                   int age = calculateAge(yob);
                   checkAge(age); 

                   System.out.print("\tPlease enter Gender (Female, Male) :");

                   String gender=input.next();  
//                 make sure that gender is (Female, Male)
                   while(gender.compareToIgnoreCase("male")!=0){
                       if (gender.compareToIgnoreCase("female")==0)
                       break;                      
                       else
                       {
                            System.out.print("\t Sorry, you must enter Gender (Female, Male) :");
                            gender=input.next(); 
                       }
                   }
                   
//               creat an object and send its information to super by suing Intermediary constructer   
                    newIntermediary=new Intermediary(name,phone,email,yob,gender); 
 //                 create & print the ID by using method in Intermediary class
                    ((Intermediary)newIntermediary).ceateID();
//                  add the intermediarry to the array list
                    intermediaryList.add((Intermediary)newIntermediary);
    }
    public static void printIntermediary(){
//         check ID:
                    int index=-1;
                    System.out.println("Enter your ID: ");
                    String ID;
                    StringBuilder existID;
                    ID=input.next();
                    boolean check=false;    
                     while (check!=true){
                         StringBuilder ID2=new StringBuilder(ID);
                          for (int i=0;i<intermediaryList.size();i++)
                          {
                              existID=(intermediaryList.get(i)).getIntermediaryID();
          
                              if (existID.toString().equals(ID2.toString())==true){
                                 check=true;
                                 index=i;
                                 System.out.println("Welcome "+ intermediaryList.get(i).getFullName());
                                 break;
                          }}
                          
                                    if(check!=true)
                          {
                              
                              System.out.println("Sorry your ID is wrong, try again");
                                             ID=input.next(); 
                          }  
                     }
                     
                     
//                     print personal info
                     System.out.println("\n •	Your personal informations:\n\n "+(intermediaryList.get(index).toString())+"\n");
//                    print clothes info
                     System.out.println("\n•	Clothe Informations: "+"=You have entered "+(intermediaryList.get(index)).getNumberOfItems()+" items,\n" );
                     for (int i=0;i<(intermediaryList.get(index)).getNumberOfItems();i++){
                         System.out.println((intermediaryList.get(index)).toString(i)+"\n"); 
                     }
    }
    public static void printallIntermediary(){
        for (int i=0;i<intermediaryList.size();i++){
            System.out.println(intermediaryList.get(i).getIntermediaryID());
            for (int j=0;j<(intermediaryList.get(i)).getNumberOfItems();j++){
                         System.out.println((intermediaryList.get(i)).toString(j)+"\n"); 
                     }
        }
    }
    public static void updateIntermediary(){
//        update method
//        check the ID
        int index=-1;
                    System.out.println("Enter your ID: ");
                    String ID;
                    StringBuilder existID;
                    ID=input.next();
                    boolean check=false;
                    
                    
                                
                     while (check!=true){
                         StringBuilder ID2=new StringBuilder(ID);
                          for (int i=0;i<intermediaryList.size();i++)
                          {
                              
                              existID=(intermediaryList.get(i)).getIntermediaryID();
          
                              if (existID.toString().equals(ID2.toString())==true){
                                 check=true;
                                 index=i;
                                 System.out.println("Welcome "+ intermediaryList.get(i).getFullName());
                                 break;
                          }}
                          
                          
                                    if(check!=true)
                          {
                              
                              System.out.println("Sorry your ID is wrong, try again");
                                             ID=input.next(); 
                          }  
                     }
               
//                           determine what he wants to update

                           System.out.println("\n\nif you want to update press: "
                                   + "\n •   (1) Name"
                                   + "\n •   (2) Phone"
                                   + "\n •   (3) Email"
                                   + "\n •   (4) Year of birth"
                                   + "\n •   (5) Gender");
                         
                          int update=input.nextInt();
//                         switch the chice
                          switch(update){
         
                              
                              case 1: {
//                                   name
                  System.out.print("\tPlease enter your name:");
                                                    input.nextLine();
                   String username=input.nextLine();
                   (intermediaryList.get(index)).setFullName(username);
                              }
                                  break;
                                  
                                  case 2:
                                   {
//                                           phone number
                                    input.nextLine();

                   System.out.print("\tPlease enter your phone number:");
                   String phone=input.nextLine();   
                   // check if the entered is a true fon number
                   while (true){
//                       phoe number is true :)
                       if (phone.length()==10&&phone.startsWith("0"))
                           break;
                       else 
                       {
//                            check on phoe length 
                           if (phone.length()!=10)
                           {
                               System.out.println("\tSorry you entered "+ phone+" & it has "+phone.length()+" numbers, your phone number must contain 10 numbers,\n \tPlease enter your phone number again: ");
                       phone=input.nextLine(); 
                           }
//                           check for first number (must be zero
                           else 
                           {
                                System.out.println("\tSorry you entered "+ phone+" & it starts with  "+phone.charAt(0)+" ,your phone number must start with 0,\n \t Please enter your phone number again:  ");
                                phone=input.nextLine(); 
                           }
                       }
                       (intermediaryList.get(index)).setPhoneNumber(phone);
                   }
                                   }
                                    
                                      break;
                                      
                                  case 3:{
                                 input.nextLine();
   
//                                       email
                   System.out.print("\tPlease enter your email :");
                   String email=input.nextLine();  
                   String userName="";
                   String org="";
                   boolean match;
//                check if user entered true email
                   do
                   {
                   int firstAt = email.indexOf("@");
                   int firstdot = email.indexOf(".");
                   if (firstAt!=-1){
                    userName=email.substring(0, firstAt);
                   }
                   if (firstdot!=-1){
                   org=email.substring(firstdot+1, email.length());

                   }
                       match=userName.contains("^")||userName.contains("{")||userName.contains( "(")||userName.contains("]")||userName.contains("{")||userName.contains("{")||userName.contains("/")||userName.contains(";")||userName.contains(".")||userName.contains(",")||userName.contains("\\");

                       if (email.length()>254)
//                           check for email length
                         System.out.print("\t wrong email it must has less than 254 character,\n\tPlease enter the email again:");   
//                      check that email has (@)
                       else if (firstAt==-1)
                        {
                             System.out.print("\t wrong email you must have (@),\n\tPlease enter the email again:");
                        email=input.nextLine(); 
                        }
                       //                      check that email has (.)

                         else if (firstdot==-1)
                        {
                             System.out.print("\t wrong email you must have (.),\n\tPlease enter the email again:");
                        email=input.nextLine(); 
                        }
                        else if (match==true)
                        {
                        System.out.print("\t wrong email you can not have [( ) < > , ; : \\ / \"  [ ] { } ] in email,\n\tPlease enter the email again:");
                        email=input.nextLine(); 
                        }
//                      check that the last part of email has 3 digit  
                        else if (org.length()!=3)
                            {
                        System.out.print("\t sorry the last part of your email must contain 3 letters, like(.com) & you entered: " +org.length()+",\n\tPlease enter the email again:");
                        email=input.nextLine(); }
//                                         check that email at least has 6 char
                       else if(userName.length()<5)
                       {
                            System.out.print("\t wrong email you must have at least 6 character before @,\n\tPlease enter the email again:");
                        email=input.nextLine(); 
                       }
//                        the email is true :) 
                        else break;
                   }
                   while (true);
                   (intermediaryList.get(index)).setEmail(email);
                                  }
                                      break;
                                  case 4: 
                {
//                                                 yob
                   System.out.print("\tPlease enter Year of birth :");
                   int yob=input.nextInt(); 
                   int age = calculateAge(yob);
                   checkAge(age); 

                   System.out.print("\tPlease enter Gender (Female, Male) :");

                   String gender=input.next();  
                }
                                      
                                      break;
                                      
                                  case 5: {
                            input.nextLine();

                                           System.out.print("\tPlease enter Gender (Female, Male) :");
                   String gender=input.next();  
//                 make sure that gender is (Female, Male)
                   while(gender.compareToIgnoreCase("male")!=0){
                       if (gender.compareToIgnoreCase("Female")==0)
                       break;                      
                       else
                       {
                            System.out.print("\t Sorry, you must enter Gender (Female, Male) :");
                            gender=input.next(); 
                       }
                   }
                   (intermediaryList.get(index)).setGender(gender);
                                  }
                                      break;               
                          }

    }
    public static void deleteInter(){   
//        method to delete
//        check the email
        int index=-1;
         System.out.println("Enter your ID: ");
                    String ID;
                    StringBuilder existID;
                    ID=input.next();
                    boolean check=false;      
                     while (check!=true){
                         StringBuilder ID2=new StringBuilder(ID);
                          for (int i=0;i<intermediaryList.size();i++)
                          {
                              existID=(intermediaryList.get(i)).getIntermediaryID();
          
                              if (existID.toString().equals(ID2.toString())==true){
                                 check=true;
                                 index=i;
                                 break;
                          }}
                          
                          
                                    if(check!=true)
                          {
                              
                              System.out.println("Sorry your ID is wrong, try again");
                                             ID=input.next(); 
                          }
                                    System.out.println();
                     }
                     System.out.println((intermediaryList.get(index)).getFullName()+" Are you sure? yes or no ");
                   String sure; 
                   sure=input.next();
                   do{
                       if (sure.equalsIgnoreCase("yes")==true)
                           break;
                       else if(sure.equalsIgnoreCase("no")==true)
                           break;
                       else 
                           System.out.println("you must type Yes or No");
                                          sure=input.next();
                   }
                   while (sure.equalsIgnoreCase("yes")==false||sure.equalsIgnoreCase("no")==false);
//                   remove Intermediary from list
                       if (sure.equalsIgnoreCase("yes"))
                     intermediaryList.remove(intermediaryList.get(index));
    }
    
    public static void addDoneeInformation(){
                    input.nextLine();
//                    name
                  System.out.print("\tPlease enter your name:");
                   String name=input.nextLine();
//                   phone number
                   System.out.print("\tPlease enter your phone number:");
                   String phone=input.nextLine();   
                   // check if the entered is a true fon number
                   while (true){
//                       phoe number is true :)
                       if (phone.length()==10&&phone.startsWith("0"))
                           break;
                       else 
                       {
//                           check on phoe length 
                           if (phone.length()!=10)
                           {
                               System.out.println("\tSorry you entered"+ phone+" & it has "+phone.length()+"numbers,your phone number must contain 10 numbers,\n \tPlease enter your phone number again: ");

                       phone=input.nextLine(); 
                           }
//                           check for first number (must be zero
                           else 
                           {
                                System.out.println("\tSorry you entered"+ phone+" & it starts with  "+phone.charAt(0)+",your phone number must start with 0,\n \tPlease enter your phone number again:  ");

                                phone=input.nextLine(); 
                           }

                       }

                   }

//                   email

                   System.out.print("\tPlease enter your email :");

                   String email=input.nextLine();  

                   String userName="";

                   String org="";

                   boolean match;

//                check if user entered true email

                   do
                   {
                   int firstAt = email.indexOf("@");
                   int firstdot = email.indexOf(".");
                   if (firstAt!=-1){
                    userName=email.substring(0, firstAt);
                   }
                   if (firstdot!=-1){
                   org=email.substring(firstdot+1, email.length());
                   }
                       match=userName.contains("^")||userName.contains("{")||userName.contains( "(")||userName.contains("]")||userName.contains("{")||userName.contains("{")||userName.contains("/")||userName.contains(";")||userName.contains(".")||userName.contains(",")||userName.contains("\\");
                       if (email.length()>254)
//                           check for email length
                         System.out.print("\t wrong email it must has less than 254 character, Please enter the email  again:");   
//                      check that email has (@)
                       else if (firstAt==-1)
                        {
                             System.out.print("\t wrong email you must have (@),\n\tPlease enter the email again:");
                        email=input.nextLine(); 
                        }
                       //                      check that email has (.)
                         else if (firstdot==-1)
                        {
                             System.out.print("\t wrong email you must have (.),\n\tPlease enter the email again:");
                        email=input.nextLine(); 
                        }
                        else if (match==true)
                        {
                        System.out.print("\t wrong email you can not have [( ) < > , ; : \\ / \"  [ ] { } ] in email,\n\tPlease enter the email again:");
                        email=input.nextLine(); 
                        }
//                      check that the last part of email has 3 digit  
                        else if (org.length()!=3)
                            {
                        System.out.print("\t sorry the last part of your email must contain 3 letters, like(.com) & you entered: " +org.length()+"\n\tPlease enter the email again:");
                        email=input.nextLine(); }
//                                         check that email at least has 6 char
                       else if(userName.length()<5)
                       {
                            System.out.print("\t wrong email you must have at least 6 character before @,\n\tPlease enter the email again:");
                        email=input.nextLine(); 
                       }
//                        the email is true :) 
                        else break;
                   }
                   while (true);
//                 yob>>> year of birth (age) 
                   System.out.print("\tPlease enter Year of birth :");
                   int yob=input.nextInt(); 
                   int age = calculateAge(yob);
                   checkAge(age); 
                   System.out.print("\tPlease enter Gender (Female, Male) :");
                   String gender=input.next();  
//                 make sure that gender is (Female, Male)
                   while(gender.compareToIgnoreCase("male")!=0){
                       if (gender.compareToIgnoreCase("Female")==0)
                       break;                      
                       else
                       {
                            System.out.print("\t Sorry, you must enter Gender (Female, Male) :");
                            gender=input.next(); 
                       }
                   }
//                account number 
                   System.out.print("\tPlease enter your iban number, it must start with SA and has 22 digit:");
                   String  Iban=input.next();   
                   // check if the entered is a true account number
                   while (true){
//                       account number is true :)
                       if (Iban.length()==24 && (Iban.startsWith("sa") || Iban.startsWith("SA")))
                           break;
                       else 
                       {
//                           check on Iban length 
                           if (Iban.length()!=24)
                           {
                               System.out.println("\tSorry you entered"+ Iban+" & it has "+Iban.length()+"numbers,your account number must contain 24 numbers,\n \tPlease enter your account number again: ");
                       Iban=input.next(); 
                           }
//                           check for first character (must be sa
                           else 
                           {
                                System.out.println("\tSorry you entered"+ Iban+" & it starts with  "+Iban.charAt(0)+Iban.charAt(1)+",your account number must start with sa,\n \tPlease enter your account number again:  ");
                                Iban=input.nextLine();
                           }
                       }}
//                   amount of salary 
                    System.out.println("\tPlease enter your salary:");
                            double salaryAmount = input.nextDouble();
                            while(true){
                                // if it is true 
                                if(salaryAmount > 0 )
                                    break;
                                // check the salary amount is not negative number
                                else{
                                    System.out.println("\t sorry, you entered number less than 0. \n please try again.");
                                    salaryAmount = input.nextDouble();
                            }
                            }
//                   number of family member
                    System.out.println("\tPlease enter your family member number :");
                    int familyMember = input.nextInt();
                    while(true){
                                // if it is true 
                                if(familyMember >1 && familyMember < 20 )
                                    break;
                                // check the salary amount is not negative number
                                else{
                                    if(familyMember < 1){
                                    System.out.println("\t sorry, you entered member number less than the allowed number. \n it must be greater than 1, please try again.");
                                    familyMember = input.nextInt();
                                    }
                                    else{
                                    System.out.println("\t sorry, you entered member number greater than the allowed number. \n it must be less than 20, please try again.");
                                    familyMember = input.nextInt();
                                    }
                            }
                            }  
                    System.out.println("what is the maximum date to achieve your order");
                              System.out.println(" Day: ");
                              int day=input.nextInt();
                              System.out.println(" Month: ");
                              int month=input.nextInt();
                              System.out.println(" Year: ");

                              int year=input.nextInt();
//               creat an object and send its information to super by suing Intermediary constructer   
                    newDonee =new Donee(name,phone,email,yob,gender,Iban,salaryAmount,familyMember,day,month,year); 
 //                 create & print the ID by using method in Intermediary class
                    ((Donee)newDonee).ceateID();
//                  add the intermediarry to the array list
                    DoneeList.add((Donee)newDonee);
               }
    
   public static void addclothe(){
//                                 here we are going to check the ID
                     int index=-1;
                    System.out.println("Enter your ID: ");
                    String ID;
//                    We did it as StringBuilder because we created the ID by using StringBuilder
                    StringBuilder existID;
                    ID=input.next();
//                    to enter the loop
                    boolean check=false;
                      while (check!=true){
//                       assign ID2 with input ID
                         StringBuilder ID2=new StringBuilder(ID);
//                         go through all existing IDs and compare it with the entered ID
                          for (int i=0;i<intermediaryList.size();i++)
                          {
//                              assign existID with the IDs stored in DoneeList
                              existID=(intermediaryList.get(i)).getIntermediaryID();
//                              compare 
                              if (existID.toString().equals(ID2.toString())==true){
//                                  if true will leave the loop 
                                 check=true;
//                                 get the index 
                                 index=i;
                                 System.out.println("Welcome "+ intermediaryList.get(i).getFullName());
//                                 leave the loap
                                 break;
                          }}
                          
//                          complete if it still false
                          if(check!=true)
                          {
                              System.out.println("Sorry your ID is wrong, try again");
                                             ID=input.next(); 
                          }  
                     }
               
                             int numberOfItems;
//                             it is allowed until 50
               do
               {
                    System.out.println("How many items do you want to add (maximum 50)");
                    numberOfItems=input.nextInt();
               }
               while(numberOfItems>50);
//               creatring arrays and fill them with information by using index 
               (intermediaryList.get(index)).setNumberOfItems(numberOfItems);
              String []type=new String [numberOfItems];
              String []size=new String [numberOfItems];
              int []colorNumber=new int [numberOfItems];
              int []materialNumber=new int [numberOfItems];
              double []price=new double[numberOfItems];
              boolean []checkb=new boolean[numberOfItems] ;
              
               for (int f=0;f<numberOfItems;f++){
                   System.out.println("You material number is "+(f)+"\n\n\n");
                   materialNumber[f]=f;
                   checkb[f]=false;
                   System.out.println(
"\n•	  (0) Beige \n" +
"•	  (1) Black \n"+  
"•	  (2) Blue \n" +
"•	  (3) Blue-Green \n" +
"•	  (4) Bronze \n" +
"•	  (5) Browns \n" +
"•	  (6) burgundy \n" +
"•	  (7) Checks \n" +
"•	  (8) Clear \n" +
"•	  (9) Gold \n" +
"•	  (10) Green \n" +
"•	  (11) Grey \n" +
"•	  (12) Metallic \n" +
"•	  (13) Monochrome \n" +
"•	  (14) Multicolor \n" +
"•	  (15) Navy \n" +
"•	  (16) Neon \n" +
"•	  (17) Neutrals \n" +
"•	  (18) Orange \n" +
"•	  (19) Pink \n" +
"•	  (20) Prints \n" +
"•	  (21) Purple \n" +
"•	  (22) Red \n" +
"•	  (23) Silver \n" +
"•	  (24) Stripes \n" +
"•	  (25) White \n" +
"•	  (26) Yellow ");
                   do
                   {
                       System.out.println("Enter the color number of material number "+(f+1));
                   colorNumber[f]=input.nextInt();
                   }
                   while(colorNumber[f]>26||colorNumber[f]<0);
        System.out.println("Enter a type of material number  "+(f+1)+",for example Jeans,Dresse");
                            type[f]=input.next();
                             boolean check4=false;
                            do{
                                 System.out.println("Enter a size of material number"+(f+1)+"available size: One size, S, M, L, XL, 2XL, 3 XL,4 XL,5 XL");
                            size[f]=input.next();
                            switch( size[f]){
                                case "S":
                                    check4=true;
                                            break;
                                case "M":
                                    check4=true;
                                            break; 
                               case "L":
                                    check4=true;
                                            break;  
                                case "XL":
                                    check4=true;
                                            break;  
                                case "2XL":
                                    check4=true;
                                            break;  
                                case "3XL":
                                    check4=true;
                                            break;  
                                case "4XL":
                                    check4=true;
                                            break;   
                                case "5XL":
                                    check4=true;
                                            break;             
                            }
                            }
                            while(check4==false); 
       
        System.out.println("Enter the price of material number"+(f+1));
                            price[f]=input.nextDouble();                    
               }
               (intermediaryList.get(index)).setMaterialNumber(materialNumber);
               (intermediaryList.get(index)).setPrice(price);
               (intermediaryList.get(index)).setType(type);
               (intermediaryList.get(index)).setSize(size);
               (intermediaryList.get(index)).setColorNumber(colorNumber); 
               (intermediaryList.get(index)).setCheckState(checkb);
               Intermediaryadd.add(intermediaryList.get(index));
    }
    public static void updateDonee(){
//        update method
//        check the ID
        int index=-1;
                    System.out.println("Enter your ID: ");
                    String ID;
                    StringBuilder existID;
                    ID=input.next();
                    boolean check=false;
                     while (check!=true){
                         StringBuilder ID2=new StringBuilder(ID);
                          for (int i=0;i<DoneeList.size();i++)
                          {
                              existID=(DoneeList.get(i)).getDoneeID();
                              if (existID.toString().equals(ID2.toString())==true){
                                 check=true;
                                 index=i;
                                 System.out.println("Welcome "+ DoneeList.get(i).getFullName());
                                 break;
                          }}
                                    if(check!=true)

                          {
                              System.out.println("Sorry your ID is wrong, try again");
                                             ID=input.next(); 
                          }
                     }
//                           determine what he wants to update
                           System.out.println("\n\nif you want to update press: "
                                   + "\n •   (1) Name"
                                   + "\n •   (2) Phone"
                                   + "\n •   (3) Email"
                                   + "\n •   (4) Year of birth"
                                   + "\n •   (5) Gender");
                          int update=input.nextInt();
//                         switch the chice
                          switch(update){
                              case 1: {
//                                   name
                  System.out.print("\tPlease enter your name:");
                                                    input.nextLine();
                   String username=input.nextLine();
                   (DoneeList.get(index)).setFullName(username);
                              }
                                  break;
                                  case 2:
                                   {
//                                           phone number
                                    input.nextLine();
                   System.out.print("\tPlease enter your phone number:");
                   String phonen=input.nextLine();   
                   // check if the entered is a true fon number
                   while (true){
//                       phoe number is true :)
                       if (phonen.length()==10&&phonen.startsWith("0"))
                           break;
                       else 
                       {
//                           check on phoe length 
                           if (phonen.length()!=10)
                           {
                               System.out.println("Sorry "+ phonen+" has "+phonen.length()+"numbers & your phone number must contain 10 numbers,/n Please enter your phone number again: ");
                       phonen=input.nextLine(); 
                           }
//                           check for first number (must be zero
                           else 
                           {
                                System.out.println("Sorry "+ phonen+" starts with  "+phonen.charAt(0)+"& your phone number must start with 0,/n Please enter your phone number again:  ");

                                phonen=input.nextLine(); 
                           }

                       }

                       (DoneeList.get(index)).setPhoneNumber(phonen);
                   } }
                                      break;
                                  case 3:{
                                 input.nextLine();
//                                       email

                   System.out.print("\tPlease enter your email :");
                   String email=input.nextLine();  
                   String userName="";
                   String org="";
                   boolean match;
//                check if user entered true email
                   do
                   {
                   int firstAt = email.indexOf("@");
                   int firstdot = email.indexOf(".");
                   if (firstAt!=-1){
                    userName=email.substring(0, firstAt);

                   }

                   if (firstdot!=-1){
                   org=email.substring(firstdot+1, email.length());
                   }

                       match=userName.contains("^")||userName.contains("{")||userName.contains( "(")||userName.contains("]")||userName.contains("{")||userName.contains("{")||userName.contains("/")||userName.contains(";")||userName.contains(".")||userName.contains(",")||userName.contains("\\");

                       if (email.length()>254)
//                           check for email length
                         System.out.print("\t wrong email it must has less than 254 character, Please enter the email  again:");   
//                      check that email has (@)
                       else if (firstAt==-1)
                        {
                             System.out.print("\t wrong email you must have (@),/n Please enter the email again:");
                        email=input.nextLine(); 

                        }
                       //                      check that email has (.)
                         else if (firstdot==-1)

                        {
                             System.out.print("\t wrong email you must have (.),/n Please enter the email again:");
                        email=input.nextLine(); 
                        }
                        else if (match==true)
                        {
                        System.out.print("\t wrong email you can not have [( ) < > , ; : \\ / \"  [ ] { } ] in email,/n Please enter the email again:");
                        email=input.nextLine(); 
                        }
//                      check that the last part of email has 3 digit  
                        else if (org.length()!=3)
                            {
                        System.out.print("\t sorry the last part of your email must contain 3 letters, like(.com) & you entered: " +org.length()+"/n Please enter the email again:");

                        email=input.nextLine(); }

//                                         check that email at least has 6 char
                       else if(userName.length()<5)
                       {
                            System.out.print("\t wrong email you must have at least 6 character before @,/n Please enter the email again:");
                        email=input.nextLine(); 
                       }
//                        the email is true :) 
                        else break;
                   }
                   while (true);
                   (DoneeList.get(index)).setEmail(email);
                                  }
                                      break;
                                  case 4: 
                {

//                                                 yob

                   System.out.print("\tPlease enter YOB :");
                   int yob=input.nextInt();
                   int age = calculateAge(yob);
                   checkAge(age);
                   (DoneeList.get(index)).setYearOfBirth(yob);

                }
                                      break;
                                  case 5: {
                            input.nextLine();
                                           System.out.print("\tPlease enter Gender (Female, Male) :");
                   String gender=input.next();  
//                 make sure that gender is (Female, Male)
                   while(gender.compareToIgnoreCase("male")!=0){
                       if (gender.compareToIgnoreCase("Female")==0)
                       break;                      
                       else
                       {
                            System.out.print("\t Sorry, you must enter Gender (Female, Male) :");
                            gender=input.next(); 
                       }
                   }
                   (DoneeList.get(index)).setGender(gender);
                                  }
                                      break;     
                          }

    }public static void deleteDonee(){   
//        method to delete
//        check the email
        int index=-1;
         System.out.println("Enter your ID: ");
                    String ID;
                    StringBuilder existID;
                    ID=input.next();
                    boolean check=false;
                     while (check!=true){
                         StringBuilder ID2=new StringBuilder(ID);
                          for (int i=0;i<DoneeList.size();i++)
                          {
                              existID=(DoneeList.get(i)).getDoneeID();
                              if (existID.toString().equals(ID2.toString())==true){
                                 check=true;
                                 index=i;
                                 break;
                          }}
                                    if(check!=true)
                          {
                              System.out.println("Sorry your ID is wrong, try again");
                                             ID=input.next(); 
                          }  
                     }
                     System.out.println((DoneeList.get(index)).getFullName()+ " Are you sure? yes or no ");
                     String sure = input.next();
                     do{
                         if(sure.equalsIgnoreCase("yes")==true)
                             break;
                         else if(sure.equalsIgnoreCase("no")==true)
                             break;
                         else
                             System.out.println("you must type yes or no");
                         sure= input.next();
                     }while(sure.equalsIgnoreCase("yes")==false || sure.equalsIgnoreCase("no")==false);
                     
//                     remove Donee from list
                    if(sure.equalsIgnoreCase("yes"))
                     DoneeList.remove(DoneeList.get(index));

    }public static void printDoneeInformation(){
//                   check ID:
                    int index=-1;
                    System.out.println("Enter your ID: ");
                    String ID;
                    StringBuilder existID;
                    ID=input.next();
                    boolean check=false;
                     while (check!=true){
                         StringBuilder ID2=new StringBuilder(ID);
                          for (int i=0;i<DoneeList.size();i++)
                          {
                              existID=(DoneeList.get(i)).getDoneeID();
                              if (existID.toString().equals(ID2.toString())==true){
                                 check=true;
                                 index=i;
                                 System.out.println("Welcome "+ DoneeList.get(i).getFullName());
                                 break;

                          }}

                                    if(check!=true)
                          {
                              System.out.println("Sorry your ID is wrong, try again");
                                             ID=input.next(); 
                          }  
                     }
//                     print personal info
                     System.out.println("\n •	Your personal informations:\n\n "+(DoneeList.get(index).toString())+"\n");
                     }
public static int calculateAge(int yearOfBirth){
           int age = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
                return age;    }
    public static void checkAge(int age){
        if(age >18)
            System.out.println("your age is:" + age + " and you are allowed to use our system.");
        else{
            System.out.println("sorry, you are not allowed to use the system. ");
            System.exit(0);
    }
}
    public static void addDonor (){
                 input.nextLine();
//                    name
                  System.out.print("\tPlease enter your name:");
                   String name=input.nextLine();
                   
                   
                   // bank id 
                     System.out.print("\tPlease enter your iban number, it must start with SA and has 22 digit :");
                   String  Iban=input.next();   
                   // check if the entered is a true account number
                   while (true){
//                       account number is true :)
                       if (Iban.length()==24 && (Iban.startsWith("sa") || Iban.startsWith("SA")))
                           break;
                       else 
                       {
//                           check on Iban length 
                           if (Iban.length()!=24)
                           {
                               System.out.println("\tSorry you entered"+ Iban+" & it has "+Iban.length()+"numbers,your account number must contain 24 numbers,\n \tPlease enter your account number again: ");
                       Iban=input.next(); 
                           }
//                           check for first character (must be sa
                           else 
                           {
                                System.out.println("\tSorry you entered"+ Iban+" & it starts with  "+Iban.charAt(0)+Iban.charAt(1)+",your account number must start with sa,\n \tPlease enter your account number again:  ");
                                Iban=input.nextLine();
                           }
                       }}
                   input.nextLine();
//                   phone number
                   System.out.print("\tPlease enter your phone number:");
                   String phone=input.nextLine();   
                   // check if the entered is a true fon number
                   while (true){
//                       phoe number is true :)
                       if (phone.length()==10&&phone.startsWith("0"))
                           break;
                       else 
                       {
//                           check on phoe length 
                           if (phone.length()!=10)
                           {
                               System.out.println("\tSorry you entered "+ phone+" & it has "+phone.length()+" numbers, your phone number must contain 10 numbers,\n \tPlease enter your phone number again: ");
                       phone=input.nextLine(); 
                           }
//                           check for first number (must be zero
                           else 
                           {
                                System.out.println("\tSorry you entered "+ phone+" & it starts with  "+phone.charAt(0)+" ,your phone number must start with 0,\n \t Please enter your phone number again:  ");
                                phone=input.nextLine(); 
                           }
                       }
                   }
//                   email
                   System.out.print("\tPlease enter your email :");
                   String email=input.nextLine();  
                   String userName="";
                   String org="";
                   boolean match;
//                check if user entered true email
                   do
                   {
                   int firstAt = email.indexOf("@");
                   int firstdot = email.indexOf(".");
                   if (firstAt!=-1){
                    userName=email.substring(0, firstAt);
                   }
                   if (firstdot!=-1){
                   org=email.substring(firstdot+1, email.length());

                   }
                   
                       match=userName.contains("^")||userName.contains("{")||userName.contains( "(")||userName.contains("]")||userName.contains("{")||userName.contains("{")||userName.contains("/")||userName.contains(";")||userName.contains(".")||userName.contains(",")||userName.contains("\\");

                       if (email.length()>254)
//                           check for email length
                         System.out.print("\t wrong email it must has less than 254 character, Please enter the email  again:");   
//                      check that email has (@)
                       else if (firstAt==-1)
                        {
                             System.out.print("\t wrong email you must have (@),\n\tPlease enter the email again:");
                        email=input.nextLine(); 
                        }
                       //                      check that email has (.)

                         else if (firstdot==-1)
                        {
                             System.out.print("\t wrong email you must have (.),\n\tPlease enter the email again:");
                        email=input.nextLine(); 
                        }
                        else if (match==true)
                        {
                        System.out.print("\t wrong email you can not have [( ) < > , ; : \\ / \"  [ ] { } ] in email,\n\tPlease enter the email again:");
                        email=input.nextLine(); 
                        }
//                      check that the last part of email has 3 digit  
                        else if (org.length()!=3)
                            {
                        System.out.print("\t sorry the last part of your email must contain 3 letters, like(.com) & you entered: " +org.length()+"\n\tPlease enter the email again:");
                        email=input.nextLine(); }
//                                         check that email at least has 6 char
                       else if(userName.length()<5)
                       {
                            System.out.print("\t wrong email you must have at least 6 character before @,\n\tPlease enter the email again:");
                        email=input.nextLine(); 
                       }
//                        the email is true :) 
                        else break;
                   }
                   while (true);
//                 yob
                    

                   System.out.print("\tPlease enter Year of birth :");
                   int yob=input.nextInt(); 
                   int age = calculateAge(yob);
                   checkAge(age); 

                   System.out.print("\tPlease enter Gender (Female, Male) :");

                   String gender=input.next();  
//                 make sure that gender is (Female, Male)
                   while(gender.compareToIgnoreCase("male")!=0){
                       if (gender.compareToIgnoreCase("female")==0)
                       break;                      
                       else
                       {
                            System.out.print("\t Sorry, you must enter Gender (Female, Male) :");
                            gender=input.next(); 
                       }
                   }
//               creat an object and send its information to super by suing Donor constructer   
                    newDonor=new Donor(Iban,name,phone,email,yob,gender); 
 //                 create & print the ID by using method in Donor class
                    ((Donor)newDonor).ceateID();
//                  add the Donor to the array list
                    DonorList.add((Donor)newDonor);
    }
   public static void updateDonor(){

//        update method

//        check the ID

        int index=-1;

                    System.out.println("Enter your ID: ");

                    String ID;

                    StringBuilder existID;

                    ID=input.next();

                    boolean check=false;
                     while (check!=true){

                         StringBuilder ID2=new StringBuilder(ID);

                          for (int i=0;i<DonorList.size();i++)

                          {

                              existID=(DonorList.get(i)).getDonoerID();

                              if (existID.toString().equals(ID2.toString())==true){

                                 check=true;

                                 index=i;

                                 System.out.println("Welcome "+ DonorList.get(i).getFullName());

                                 break;

                          }}
                                    if(check!=true)

                          {
                              System.out.println("Sorry your ID is wrong, try again");

                                             ID=input.next(); 
                          }
                     }

//                           determine what he wants to update

                           System.out.println("\n\nif you want to update press: "
                                   + "\n •   (1) Name"
                                   + "\n •   (2) Phone"
                                   + "\n •   (3) Email"
                                   + "\n •   (4) Year of birth"
                                   + "\n •   (5) Gender");
                          int update=input.nextInt();

//                         switch the chice

                          switch(update){

                              case 1: {

//                                   name

                  System.out.print("\tPlease enter your name:");

                                                    input.nextLine();

                   String username=input.nextLine();

                   (DonorList.get(index)).setFullName(username);

                              }

                                  break;

                                  

                                  case 2:

                                   {

//                                           phone number

                                    input.nextLine();
                   System.out.print("\tPlease enter your phone number:");
                   String phonen=input.nextLine();   
                   // check if the entered is a true fon number

                   while (true){
//                       phoe number is true :)
                       if (phonen.length()==10&&phonen.startsWith("0"))
                           break;
                       else 
                       {
//                           check on phoe length 
                           if (phonen.length()!=10)
                           {
                               System.out.println("Sorry "+ phonen+" has "+phonen.length()+"numbers & your phone number must contain 10 numbers,/n Please enter your phone number again: ");
                       phonen=input.nextLine(); 
                           }
//                           check for first number (must be zero
                           else 
                           {
                                System.out.println("Sorry "+ phonen+" starts with  "+phonen.charAt(0)+"& your phone number must start with 0,/n Please enter your phone number again:  ");
                                phonen=input.nextLine(); 
                           }
                       }
                       (DonorList.get(index)).setPhoneNumber(phonen);
                   }
                                   }
                                      break;
                                  case 3:{
                                 input.nextLine();

//                                       email

                   System.out.print("\tPlease enter your email :");
                   String email=input.nextLine();  
                   String userName="";
                   String org="";
                   boolean match;
//                check if user entered true email
                   do
                   {
                   int firstAt = email.indexOf("@");
                   int firstdot = email.indexOf(".");
                   if (firstAt!=-1){
                    userName=email.substring(0, firstAt);
                   }

                   if (firstdot!=-1){
                   org=email.substring(firstdot+1, email.length());
                   }
                       match=userName.contains("^")||userName.contains("{")||userName.contains( "(")||userName.contains("]")||userName.contains("{")||userName.contains("{")||userName.contains("/")||userName.contains(";")||userName.contains(".")||userName.contains(",")||userName.contains("\\");
                       if (email.length()>254)
//                           check for email length
                         System.out.print("\t wrong email it must has less than 254 character, Please enter the email  again:");   
//                      check that email has (@)
                       else if (firstAt==-1)
                        {
                             System.out.print("\t wrong email you must have (@),/n Please enter the email again:");
                        email=input.nextLine(); 
                        }

                       //                      check that email has (.)

                         else if (firstdot==-1)

                        {

                             System.out.print("\t wrong email you must have (.),/n Please enter the email again:");
                        email=input.nextLine(); 
                        }
                        else if (match==true)
                        {
                        System.out.print("\t wrong email you can not have [( ) < > , ; : \\ / \"  [ ] { } ] in email,/n Please enter the email again:");
                        email=input.nextLine(); 
                        }
//                      check that the last part of email has 3 digit  
                        else if (org.length()!=3)
                            {
                        System.out.print("\t sorry the last part of your email must contain 3 letters, like(.com) & you entered: " +org.length()+"/n Please enter the email again:");
                        email=input.nextLine(); }

//                                         check that email at least has 6 char
                       else if(userName.length()<5)
                       {
                            System.out.print("\t wrong email you must have at least 6 character before @,/n Please enter the email again:");
                        email=input.nextLine(); 
                       }
//                        the email is true :) 
                        else break;
                   }
                   while (true);
                   (DonorList.get(index)).setEmail(email);
                                  }
                                      break;
                                  case 4: 
                {

//                                                 yob
                   System.out.print("\tPlease enter YOB :");
                   int yob=input.nextInt();
                   int age = calculateAge(yob);
                   checkAge(age);
                   (DonorList.get(index)).setYearOfBirth(yob);
                }
                                      break;
                                  case 5: {
                            input.nextLine();
                                           System.out.print("\tPlease enter Gender (Female, Male) :");
                   String gender=input.next();  
//                 make sure that gender is (Female, Male)
                   while(gender.compareToIgnoreCase("male")!=0){
                       if (gender.compareToIgnoreCase("Female")==0)
                       break;                      
                       else
                       {
                            System.out.print("\t Sorry, you must enter Gender (Female, Male) :");
                            gender=input.next(); 
                       }
                   }
                   (DonorList.get(index)).setGender(gender);

                                  }
                                      break;     
                          }
   } 
   public static void printDonee(){
   
 
        for (int i=0;i<DoneeRequests.size();i++){
            System.out.println(DoneeRequests.get(i).getDoneeID());
            System.out.print("Level of donee need: "+DoneeRequests.get(i).checkout()+"\n maxim date of need: "+DoneeRequests.get(i).getMaximumPeriod()+"\n");
}
}
   public static void deleteDonor(){   
//        method to delete
//        check the id
        int index=-1;
         System.out.println("Enter your ID: ");
                    String ID;
                    StringBuilder existID;
                    ID=input.next();
                    boolean check=false;
                     while (check!=true){
                         StringBuilder ID2=new StringBuilder(ID);
                          for (int i=0;i<DonorList.size();i++)
                          {
                              existID=(DonorList.get(i)).getDonoerID();
                              if (existID.toString().equals(ID2.toString())==true){
                                 check=true;
                                 index=i;
                                 break;
                          }}
                                    if(check!=true)
                          {
                              System.out.println("Sorry your ID is wrong, try again");
                                             ID=input.next(); 
                          }  
                     }
                     System.out.println((DonorList.get(index)).getFullName()+ " Are you sure? yes or no ");
                     String sure = input.next();
                     do{
                         if(sure.equalsIgnoreCase("yes")==true)
                             break;
                         else if(sure.equalsIgnoreCase("no")==true)
                             break;
                         else
                             System.out.println("you must type yes or no");
                         sure= input.next();
                     }while(sure.equalsIgnoreCase("yes")==false || sure.equalsIgnoreCase("no")==false);
                     
//                     remove Donor from list
                    if(sure.equalsIgnoreCase("yes"))
                     DonorList.remove(DonorList.get(index));
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
   public static void printDonorInformation(){
//                   check ID:
                    int index=-1;
                    System.out.println("Enter your ID: ");
                    String ID;
                    StringBuilder existID;
                    ID=input.next();
                    boolean check=false;
                     while (check!=true){
                         StringBuilder ID2=new StringBuilder(ID);
                          for (int i=0;i<DonorList.size();i++)
                          {
                              existID=(DonorList.get(i)).getDonoerID();
                              if (existID.toString().equals(ID2.toString())==true){
                                 check=true;
                                 index=i;
                                 System.out.println("Welcome "+ DonorList.get(i).getFullName());
                                 break;

                          }}

                                    if(check!=true)
                          {
                              System.out.println("Sorry your ID is wrong, try again");
                                             ID=input.next(); 
                          }  
                     }
//                     print personal info
                     System.out.println("\n •	Your personal informations:\n\n "+(DonorList.get(index).toString())+"\n");
                     }
   
   public static void AddDonationRequest(){
            
//                   check ID:
      int index=-1;
                    System.out.println("Enter your ID: ");
                    String ID;
                    StringBuilder existID;
                    ID=input.next();
                    boolean check=false;
                     while (check!=true){
                         StringBuilder ID2=new StringBuilder(ID);
                          for (int i=0;i<DoneeList.size();i++)
                          {
                              existID=(DoneeList.get(i)).getDoneeID();
                              if (existID.toString().equals(ID2.toString())==true){
                                 check=true;
                                 index=i;
                                 System.out.println("Welcome "+ DoneeList.get(i).getFullName()+", Your requist is sent thank you :) \n");
                                 break;
                          }}

                                    if(check!=true)
                          {
                              System.out.println("Sorry your ID is wrong, try again");
                                             ID=input.next(); 
                          } }
                      DoneeRequests.add(DoneeList.get(index));

}
   public static void AddDonation(){
       
             
//                   check ID:
      int index=-1;
                    System.out.println("Enter your ID: ");
                    String ID;
                    StringBuilder existID;
                    ID=input.next();
                    boolean check=false;
                     while (check!=true){
                         StringBuilder BuilderID=new StringBuilder(ID);
                          for (int i=0;i<DonorList.size();i++)
                          {
                              existID=(DonorList.get(i)).getDonoerID();
                              if (existID.toString().equals(BuilderID.toString())==true){
                                 check=true;
                                 index=i;
                                 System.out.println("Welcome "+ DonorList.get(i).getFullName());
                                 break;

                          }}

                                    if(check!=true)
                          {
                              System.out.println("Sorry your ID is wrong, try again");
                                             ID=input.next(); 
                          } } 
                     if (DoneeRequests.isEmpty())
                         System.out.println("Sorry there is no Donee yet ");
                     else{
                     printDonee();
                     int index2=-1; 
                     System.out.println("Enter Donee ID: ");
                    String ID2;
                    StringBuilder existID2;
                    ID2=input.next();
                    boolean check2=false;
                     while (check2!=true){
                         StringBuilder IID2=new StringBuilder(ID2);
                          for (int m=0;m<DoneeRequests.size();m++)
                          {
                              existID2=(DoneeRequests.get(m)).getDoneeID();
                              if (existID2.toString().equals(IID2.toString())==true){
                                 check2=true;
                                 index2=m;
                                 break;

                          }}

                                    if(check2!=true)
                          {
                              System.out.println("Sorry your ID is wrong, try again");
                                             ID2=input.next(); 
                          } }
                          Donation donate=new Donation(DonorList.get(index),DoneeRequests.get(index2));
                          System.out.println(
                                  "Donation information: "
                                  + "\nDonor ID is:"
                                  +DonorList.get(index).getDonoerID()
                                   + "\nDonor iban number is:"+
                                  DonorList.get(index).getBankID()+
                                  "\nDonor phone number is:"+
                                  DonorList.get(index).getPhoneNumber()+
                                          
                                  " \nDonee iban number is: "
                                  +DoneeRequests.get(index2).getDoneeID()+
                                  " \nDonee iban number is: "
                                  +DoneeRequests.get(index2).getBankID()+
                                  " \nDonee phone number is: "
                                  +DoneeRequests.get(index2).getPhoneNumber());
                                  DoneeRequests.remove(index2);
//                              
                   
}}
   public static void printreservation(){
  if(ResrvationList.size()==0){
      System.out.println("sorry there is no reservation yet");
      
  }
  else {
      for(int i=0 ; i<ResrvationList.size() ; i++){
          System.out.println("Reservation number "+i);
          
      }
  }
       
       
       
   }
  
   public static void AddPyment(){
      
       int index=-1;
                    System.out.println("Enter your ID: ");
                    String ID;
                    StringBuilder existID;
                    ID=input.next();
                    boolean check=false;
                     while (check!=true){
                         StringBuilder ID2=new StringBuilder(ID);
                          for (int i=0;i<DonorList.size();i++)
                          {
                              existID=(DonorList.get(i)).getDonoerID();
                              if (existID.toString().equals(ID2.toString())==true){
                                 check=true;
                                 index=i;
                                 System.out.println("Welcome "+ DonorList.get(i).getFullName());
                                 break;

                          }}

                                    if(check!=true)
                          {
                              System.out.println("Sorry your ID is wrong, try again");
                                             ID=input.next(); 
                          } } 
                     if(ResrvationList.isEmpty())
                         System.out.println("Sorry, no payment requests yet ");
                     else{
                     printreservation();
                     System.out.println("enter reservation number :");{
       int x = input.nextInt();
        Payment pay = new Payment (DonorList.get(index) , ResrvationList.get(x));
        System.out.println("\n\nDonee information:\n"
                + "ID: "+ResrvationList.get(x).getDoneeReservation().getDoneeID()+
                "\nPhone number: "+ResrvationList.get(x).getDoneeReservation().getPhoneNumber()
                +"\nBank ID: "+ResrvationList.get(x).getDoneeReservation().getBankID()
                +"\n\nDonor information:\n"+
                "\nID: "+DonorList.get(index).getDonoerID()+
                "\nPhone number: "+DonorList.get(index).getPhoneNumber()
                +"\nBank ID: "+DonorList.get(index).getBankID()
                );
        ResrvationList.remove(ResrvationList.get(x));
  
   }
                     }
   }

public static void AddReservation(){
    
    
    System.out.println("Enter your ID: ");
    int index=-1;
    int index2=-1;
//    
                    String ID;
//                    We did it as StringBuilder because we created the ID by using StringBuilder
                    StringBuilder existID;
                    ID=input.next();
//                    to enter the loop
                    boolean check=false;
                    
                      while (check!=true){
//                       assign ID2 with input ID
                         StringBuilder BuilderID=new StringBuilder(ID);
//                         go through all existing IDs and compare it with the entered ID
                          for (int i=0;i<DoneeList.size();i++)
                          {
//                              assign existID with the IDs stored in DoneeRequests
                              existID=(DoneeList.get(i)).getDoneeID();
//                              compare 
                              if (existID.toString().equals(BuilderID.toString())==true){
//                                  if true will leave the loop 
                                 check=true;
//                                 get the index 
                                 index=i;
                                 System.out.println("Welcome "+ DoneeList.get(i).getFullName());
//                                 leave the loap
                                 break;
                          }}
                          
//                          complete if it still false
                          if(check!=true)
                          {
                              System.out.println("Sorry your ID is wrong, try again");
                                             ID=input.next(); 
                          }  
                     }
                      if(Intermediaryadd.isEmpty()){
                          System.out.println("Sorry no clothe added yet");
                      }
                      else{
                      printallIntermediary();
                      DoneeReservation.add(DoneeList.get(index));
                       System.out.println("Enter Intermediary ID: ");
                      String ID2;
                    StringBuilder existID2;
                    ID2=input.next();
                    boolean check2=false;
                     while (check2!=true){
                         StringBuilder IID2=new StringBuilder(ID2);
                          for (int m=0;m<intermediaryList.size();m++)
                          {
                              existID2=(intermediaryList.get(m)).getIntermediaryID();
                              if (existID2.toString().equals(IID2.toString())==true){
                                 check2=true;
                                 index2=m;
                                 break;

                          }}

                                    if(check2!=true)
                          {
                              System.out.println("Sorry your ID is wrong, try again");
                                             ID2=input.next(); 
                          } }
                    
                      System.out.println("Please Enter a cloth number: ");
                      int clothe=input.nextInt();
                      System.out.println((intermediaryList.get(index2)).getCheckState().length);
                      if((intermediaryList.get(index2)).getCheckState()[clothe]==true)
                           {
                               System.out.println("Sorry this item has been reserved, try again: ");
                           } 
                           else{
                          
                       Reservation newReservation=new Reservation(intermediaryList.get(index2),DoneeReservation.get(index));
                        (intermediaryList.get(index2)).setCheckState(true,clothe);   
                      System.out.println("Information of Reservation"+"\nDonee Id: "+newReservation.getDoneeReservation().getDoneeID()+"\n Intermediary ID: "+newReservation.getIntermediaryReservation().getIntermediaryID());    
                      ResrvationList.add(newReservation);
}
                       
                     }}
}
class User

{
    private String fullName;
    private String phoneNumber ;
    private String email;
    private String gender;
    private int yearOfBirth;
    public static int numberOfUsers=0;

    @Override
    public String toString() {
        return "{" + "fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", email=" + email + ", gender=" + gender + ", yearOfBirth=" + yearOfBirth + '}';
    }
    
    //no argument constructor.
    
    public User() {
        super();
        numberOfUsers++;
   
        Intermediary.numberOfIntermediary++;
        Intermediary.intermediarySystemID++;
        
        Donor.DonorSystemID++;
        Donor.numberOfDonor++;
        
        Donee.DoneeSystemID++;
        Donee.NumberofNeeders++;

    }
    
    // argument constructor.
    public User(String fullName, String phoneNumber, String email, int yearOfBirth, String gender) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
        
        numberOfUsers++;
   
        Intermediary.numberOfIntermediary++;
        Intermediary.intermediarySystemID++;
        
        Donor.DonorSystemID++;
        Donor.numberOfDonor++;
        
        Donee.DoneeSystemID++;
        Donee.NumberofNeeders++;
    }
    
    //setter and getter for private data feild.
    public String getFullName() {
        return fullName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getGender() {
        return gender;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    
    }

    class Intermediary extends User{

    public boolean[] getCheckState() {
        return checkState;
    }
//  
         int numberOfItems;
         boolean hasReserved=false;
         private String []type=new String [numberOfItems];
         private String []size=new String [numberOfItems];
         private int []colorNumber=new int [numberOfItems];
         private int []materialNumber=new int [numberOfItems];
         private double []price=new double[numberOfItems];
         private boolean []checkState=new boolean[numberOfItems];

         
         private Reservation [] intermediaryReservations=new Reservation [100];
         public static int numberOfIntermediary=0;
         public static int intermediarySystemID=-1;
         private String intermediaryID="2";
          private StringBuilder MyStringBuilder;
          
    public Intermediary() {
         super("", "", "", 0,"");
        
    }

//         No argument constructor
    public Intermediary(String fullName, String phoneNumber, String email, int yearOfBirth, String gender) {
        super(fullName, phoneNumber, email, yearOfBirth, gender);
     
    }

    public void setHasReserved(boolean hasReserved) {
        this.hasReserved = hasReserved;
    }

    public boolean isHasReserved() {
        return hasReserved;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }


  public void setType(String[] type){
        this.type = type;
}

    public void setSize(String[] size) {
        this.size = size;
    }

    public void setColorNumber(int[] colorNumber) {
        this.colorNumber = colorNumber;
    }

    public void setMaterialNumber(int[] materialNumber) {
        this.materialNumber = materialNumber;
    }

    public void setPrice(double[] price) {
        this.price = price;
    }



    public void setIntermediaryReservations(Reservation[] intermediaryReservations) {
        this.intermediaryReservations = intermediaryReservations;
    }

 

    public static void setNumberOfIntermediary(int numberOfIntermediary) {
        Intermediary.numberOfIntermediary = numberOfIntermediary;
    }

    public static void setIntermediarySystemID(int intermediarySystemID) {
        Intermediary.intermediarySystemID = intermediarySystemID;
    }

//      set methods:
    public void setIntermediaryID(String intermediaryID) {
        this.intermediaryID = intermediaryID;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public String[] getType() {
        return type;
    }

    public String[] getSize() {
        return size;
    }

    public int[] getColorNumber() {
        return colorNumber;
    }

    public int[] getMaterialNumber() {
        return materialNumber;
    }

    public double[] getPrice() {
        return price;
    }



    public Reservation[] getIntermediaryReservations() {
        return intermediaryReservations;
    }



    public void setCheckState(boolean checkState,int f) {
        this.checkState[f] = checkState;
    }

    public void setCheckState(boolean[] checkState) {
        this.checkState = checkState;
    }

   
 

    public static int getNumberOfIntermediary() {
        return numberOfIntermediary;
    }

    public static int getIntermediarySystemID() {
        return intermediarySystemID;
    }

    public StringBuilder getIntermediaryID() {
        return MyStringBuilder;
    }
    public String toString(int i) {
        return   "The information of materialNumber " + materialNumber[i] + ":\n type=" + type[i] + ", size=" + size[i] + ", colorNumber=" + colorNumber[i] + ", price=" + price [i]+ +'}';
           
    }
    public void AddReservation(Reservation reservation) {
      int i=0;
 while (this.intermediaryReservations[i]!=null); //search for a null
 this.intermediaryReservations[i] = reservation;

    }
    public void ceateID (){
//         to make sure that no 2 ID repeat :)
            if (intermediarySystemID%10==0)
                                 Intermediary.intermediarySystemID++;
        this.intermediaryID=this.intermediaryID.concat(Integer.toString(intermediarySystemID));
        MyStringBuilder = new StringBuilder(this.intermediaryID);
        MyStringBuilder.setLength(10);
        for (int w=this.intermediaryID.length();w<10;w++)
        {
            MyStringBuilder.setCharAt(w, '0');
        }
        
      System.out.println("\n\tYour Id Is: "+MyStringBuilder);
      
          }

    }
class Donor extends User implements message {
    
    static public int numberOfDonor =0;
    private double balance ;
    private String message;
    private String bankID; 
    public static int DonorSystemID=-1;
    private String donorID="3" ;
    private Payment [] buy=new Payment[100];
    private Donation [] donations=new Donation [100] ;
    private StringBuilder MyStringBuilder;

    private Reservation [] DonorReservations=new Reservation [100];
    

    //constructors
    
    public Donor() {
    }
    public Donor(String fullName, String phoneNumber, String email, int yearOfBirth, String gender) {
        super(fullName, phoneNumber, email, yearOfBirth, gender);
    }
    // stter  and getter

    public Reservation[] getDonorReservations() {
        return DonorReservations;
    }

    public void setDonorReservations(Reservation[] DonorReservations) {
        this.DonorReservations = DonorReservations;
    }
    

    public Donor(String bankID) {
        this.bankID = bankID;
    }

    public Donor(String bankID, String fullName, String phoneNumber, String email, int yearOfBirth, String gender) {
        super(fullName, phoneNumber, email, yearOfBirth, gender);
        this.bankID = bankID;
    }

    public double getBalance() {
        return balance;
    }

    public String getMassage() {
        return message;
    }

    public String getBankID() {
        return bankID;
    }

    public Donation[] getDonate() {
        return donations;
    }

    public void setDonate(Donation[] donations) {
        this.donations = donations;
    }

    public StringBuilder getDonoerID() {
        return MyStringBuilder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMassage(String message) {
        this.message = message;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
    }
    //methods 
   
    public String toStringDonor() {
        
        return "Donor{" + "balance=" + balance + ", bankID=" + bankID + ", donorID=" + donorID +'}'+"\n";
    }
     public String toString() {
        return "Donee{" + "fullName=" + super.getFullName() + ", phoneNumber=" +
     super.getPhoneNumber() + ", email=" + super.getEmail() + ", gender=" + super.getGender() + ", yearOfBirth=" + super.getYearOfBirth()+ "bankID=" + bankID + ", "
                + '}';
    }
    
    // look hear again
    public void donating(Donation newdonations){
        int i =0;
        while (this.donations[i]!=null&&i<donations.length)
                        i++;
        
            this.donations[i]= newdonations;
        if (i==this.donations.length)
         System.out.print("You've reached the maximum number");
            else
                this.donations[i] = newdonations;
    }
    public void buying (Payment newbuting){
        int i =0;
        while (this.buy[i]!=null&&i<DonorSystemID)
             i++;
        if (i==this.buy.length)
        System.out.print("You've reached the maximum number");
            else
                this.buy[i] = newbuting;
        }
    public void printMessage(){
        
        String array[] = new String[Pro.MessageList.size()];              
		for(int j =0;j<Pro.MessageList.size();j++){
		  array[j] = Pro.MessageList.get(j);
		}
                for(String k: array)
		{
			System.out.println(k);
		}
        //Pro.MessageList.stream().forEach(System.out:: println);
      //for ( int i = 0; i < Pro.MessageList.size(); i++)
           // System.out.println(Pro.MessageList.get(i));
          //System.out.println((i+1) + " : \"  "+ Pro.MessageList.get(i).toString() + "\" \n");
        
    } 
  public void ceateID (){
      //         to make sure that no 2 ID repeat :)
        if (DonorSystemID%10==0)
            Donor.DonorSystemID++;
        this.donorID=this.donorID.concat(Integer.toString(DonorSystemID));
        MyStringBuilder = new StringBuilder(this.donorID);
        MyStringBuilder.setLength(10);
        for (int w=this.donorID.length();w<10;w++)
        {
            MyStringBuilder.setCharAt(w, '0');
        }
        
      System.out.println("Donor Id: "+MyStringBuilder);
      
          }    
   public void AddDonation(Donation AddDon){
            int i =0;
        while (this.donations[i]!=null&&i<this.donations.length){
                       i++;
        if (i==this.donations.length)
         System.out.print("You've reached the maximum number");
            else
              this.donations[i]= AddDon;
    }}
}
 class Donee extends User implements message

    {
 public void printMessage(){
      for ( int i = 0; i < Pro.MessageList.size(); i++)
          System.out.println((i+1) + " -  "+ Pro.MessageList.get(i).toString()+ " \n");
  }
    //instance variables for class Donee
     
private Reservation [] addReservation=new Reservation [100] ;
public static int DoneeSystemID=-1;

public static int NumberofNeeders=0;

private double wantedAmount;

String doneeID="1";

// maximumPeriod if the donee need the mony on specific date 

private LocalDate maximumPeriod;

private String message;

private String bankID;

private double salary;

private int noOfFamilyMembers;

private int day,month,year;

private Donation[]  Donations= new Donation[100];

private  Reservation []  reservations=new  Reservation[100] ;

  private StringBuilder MyStringBuilder;




      //constructors

    public Donee() {

    }
    
    public Donee(String fullName, String phoneNumber, String email, int yearOfBirth, 
            String gender,String bankID,double salary,int noOfFamilyMembers,int day,int month,int year) {

        super(fullName, phoneNumber, email, yearOfBirth, gender);
        this.bankID = bankID;
        this.salary = salary;
        this.noOfFamilyMembers = noOfFamilyMembers;
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public int getDay() {
        return day;

    }
    public int getMonth() {
        return month;

    }
    public int getYear() {
        return year;

    }
    public void setDay(int day) {
        this.day = day;

    }

    public Reservation[] getAddReservation() {
        return addReservation;
    }

    public void setAddReservation(Reservation[] addReservation) {
        this.addReservation = addReservation;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
// get and set methods

        public StringBuilder getDoneeID() {
        return MyStringBuilder;
    }
    public double getWantedAmount() {
        return wantedAmount;

    }
    public LocalDate getMaximumPeriod() {
       maximumPeriod=LocalDate.of(this.year, this.month, this.day);
       return maximumPeriod;
    }
    public String getMessage() {

        return message;

    }
    public String getBankID() {
        return bankID;
    }
    public double getSalary() {
        return salary;
    }

    public int getNoOfFamilyMembers() {
        return noOfFamilyMembers;
    }

    public Donation[] getDonations() {
        return Donations;
    }
    
    public Reservation[] getReservations() {
        return reservations;
    }
    public void setWantedAmount(double wantedAmount) {
        this.wantedAmount = wantedAmount;
    }

    public void setMaximumPeriod(LocalDate maximumPeriod) {
        this.maximumPeriod = maximumPeriod;
    }

    public void setMassage(String message) {
        this.message = message;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
    }

    public void setSalary(double salary) {

        this.salary = salary;

    }
    public void setNoOfFamilyMembers(int noOfFamilyMembers) {
        this.noOfFamilyMembers = noOfFamilyMembers;
    }
    public void setDonations(Donation[] Donations) {
        this.Donations = Donations;
    }
    public void setReservations(Reservation[] reservations) {
        this.reservations = reservations;
    }
    //Here we will check first that the reservation is not null and the size is available ,
    //then we will add the reservation to the reservations array.
    
     public void AddReserv(Reservation RES){
         int i=0;
 while (this.addReservation[i]!=null); //search for a null
 this.addReservation[i] = RES;
}

          public void AddDonation(Donation AddDon){
            int i =0;
        while (this.Donations[i]!=null&&i<this.Donations.length){
                       i++;
        if (i==this.Donations.length)
         System.out.print("You've reached the maximum number");
            else
              this.Donations[i]= AddDon;
    }}
    //This method will return level of need (high,medium,low) 
    //depend on simple calculation  (salary/ noOfFamilyMembers) then decide level of need , 
    public String  checkout ()
    {if (salary/noOfFamilyMembers<500)
        return "high";
    else if (this.salary/this.noOfFamilyMembers>500&this.salary/this.noOfFamilyMembers<1000)
        return "meduim";
    else
        return "Low";
    }
    //This function will take the 5 digit  random number systemID and 
    //turning it to string with adding the digit 3 to the beginning of String.

     public void ceateID (){
         if (DoneeSystemID%10==0)
             Donee.DoneeSystemID++;
        this.doneeID=this.doneeID.concat(Integer.toString(DoneeSystemID));
        MyStringBuilder = new StringBuilder(this.doneeID);
        MyStringBuilder.setLength(10);
        for (int w=this.doneeID.length();w<10;w++)
        {
            MyStringBuilder.setCharAt(w, '0');
        }
      System.out.println("Donee Id is: "+ MyStringBuilder);
          } 

    @Override
    public String toString() {
        return "Donee{" + "fullName=" + super.getFullName() + ", phoneNumber=" +
     super.getPhoneNumber() + ", email=" + super.getEmail() + ", gender=" + super.getGender() + ", yearOfBirth=" + super.getYearOfBirth()+ "bankID=" + bankID + ", "
                + "salary=" + salary + ", noOfFamilyMembers=" + noOfFamilyMembers + '}';
    }
}
class Payment
{
    private Donor paymentDonor  ;
    private Reservation paymentReserve ;
    public static int paymencounter=0;
    
    //constructors with no arguments
    Payment(){
     paymencounter++;
    }
    
    //constructor with argument

    public Payment(Donor paymentDonor, Reservation paymentReserve) {
        this.paymentDonor = paymentDonor;
        this.paymentReserve = paymentReserve;
        paymencounter++;
    }
    
   
   //Use of set and get methods

    public Donor getPaymentDonor() {
        return paymentDonor;
    }

    public void setPaymentDonor(Donor paymentDonor) {
        this.paymentDonor = paymentDonor;
    }

    public Reservation getPaymentReserve() {
        return paymentReserve;
    }

    public void setPaymentReserve(Reservation paymentReserve) {
        this.paymentReserve = paymentReserve;
    }
 }
class Donation
{
    private Donor donorDonation ;
    private Donee doneeDonation ; 
  
    public static int numberOfDonation=0 ;
    //no argument constructor.
    public Donation() {
     
        numberOfDonation++;
    }
    // argument constructor.
    public Donation(Donor donorDonation, Donee doneeDonation) {
        this.donorDonation = donorDonation;
        this.doneeDonation = doneeDonation;
    
        numberOfDonation++;
    }
    
    //setter and getter for private data feild.
    public Donor getDonorDonation() {
        return donorDonation;
    }
    public void setDonorDonation(Donor donorDonation) {
        this.donorDonation = donorDonation;
    }
    public Donee getDoneeDonation() {
        return doneeDonation;
    }
    public void setDoneeDonation(Donee doneeDonation) {
        this.doneeDonation = doneeDonation;
    }
   
}
class Reservation
{
    private Intermediary intermediaryReservation;
    private Donee doneeReservation;
    public static int numberOfReservation=0;
    private Payment paymentReservation;

    public Reservation(Intermediary intermediaryReservation, Donee doneeReservation) {
        this.intermediaryReservation = intermediaryReservation;
        this.doneeReservation = doneeReservation;
    }
    

    //constructors with no arguments
    public Reservation(){ 
        numberOfReservation++;
    }

    public Intermediary getIntermediaryReservation() {
        return intermediaryReservation;
    }

    public Donee getDoneeReservation() {
        return doneeReservation;
    }
    
}
interface message{
    public void printMessage();
}