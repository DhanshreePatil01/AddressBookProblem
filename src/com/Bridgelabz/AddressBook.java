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
				System.out.println(" 1.Add Contact \n 2.Exit");
				int option=input.nextInt();
				
				switch(option)
				{
				case 1:
					addContact();
					break;
					
				case 2:
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
		@Override
		public String toString() {
			return "AddressBook [array=" + Arrays.toString(array) + "]";
		}
		
	
}
