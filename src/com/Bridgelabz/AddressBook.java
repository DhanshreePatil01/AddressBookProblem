package com.Bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class AddressBook {

	Scanner input=new Scanner(System.in);
		
		Contact array[]=new Contact[10] ;
		int indexCount=0;
		
		void pushData(Contact contactobj)
		{
			this.array[indexCount]=contactobj;
			indexCount++;
		}

		void dynamicMathod(){
			boolean waitTillSomeOneExit=true;
			
			do
			{
				System.out.println("Enter the option you want to choose: ");
				System.out.println(" 1.Add Contact \n 2.Edit Contact \n 3.Exit");
				int option=input.nextInt();
				
				switch(option)
				{
				case 1:
					addContact();
					break;
				case 2:
					editContact();
					break;
				case 3:
					waitTillSomeOneExit=false;
					System.out.println("Exit");
				}
			}
			while(waitTillSomeOneExit);
		}
		void addContact(){
			
			System.out.println("Enter First Name: ");
			String firstName=input.next();
			
			System.out.println("Enter Last Name: ");
			String lastName=input.next();
			
			System.out.println("Enter Address: ");
			String address=input.next();
			
			System.out.println("Enter city: ");
			String city=input.next();
			
			System.out.println("Enter state: ");
			String state=input.next();
			
			System.out.println("Enter Email: ");
			String email=input.next();
			
			System.out.println("Enter Zip code: ");
			int zipCode=input.nextInt();
			
			System.out.println("Enter phone number: ");
			long pNumber=input.nextLong();
			
			Contact person=new Contact(firstName,lastName,address,city,state,email,zipCode,pNumber);
			pushData(person);
		}
		
		void editContact(){
			
			System.out.println("Which person you want to Search:: ");
			String firstName1=input.next();
			System.out.println(firstName1);
			
			for(Contact contact:array)
			{
			 if(contact==null)
			  {
					
			   }
			 else
			  {
				 if(firstName1.equals(contact.getFirstName()))
				  {
					System.out.println("Congrats....found--"+firstName1);
					
					System.out.println("Choose the field to edit:");
					System.out.println(" 1.First Name \n 2.Last Name \n 3.Address \n 4.city \n 5.state \n 6.email \n 7.Zipcode \n 8.phone number");
					int choice=input.nextInt();
					
					switch(choice)
					{
					case 1:
				        System.out.println("Enter correct First name: ");
				        String firstName=input.next();
				        contact.setFirstName(firstName);
				        break;
				  case 2:
				        System.out.println("Enter correct last name: ");
				        String lastName=input.next();
				        contact.setLastName(lastName);
				        break;
				  case 3:
					     System.out.println("Enter correct address: ");
					     String address=input.next();
					     contact.setAddress(address);
					     break;
				  case 4:
					     System.out.println("Enter correct city: ");
					     String city=input.next();
					     contact.setCity(city);
					     break;
				  case 5:
					     System.out.println("Enter correct state: ");
					     String state=input.next();
					     contact.setState(state);
					     break;
				  case 6:
					     System.out.println("Enter correct email: ");
					     String email=input.next();
					     contact.setEmail(email);
					     break;
				  case 7:
					     System.out.println("Enter correct zip code: ");
					     int zipCode=input.nextInt();
					     contact.setZipCode(zipCode);
					     break;
				  case 8:
					  System.out.println("Enter correct phone number: ");
					  long pNumber=input.nextLong();
					  contact.setpNumber(pNumber);
					  break;
					    
					 }
					System.out.println(contact);
				   }
				    
				 else
				    {
					System.out.println("Contact not exist");
				    }
				
			  }
			}
			
		}
		
		@Override
		public String toString() {
			return "AddressBook [array=" + Arrays.toString(array) + "]";
		}
		
	
}
