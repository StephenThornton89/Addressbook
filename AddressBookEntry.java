// Fig. 8.33: AddressBookEntry.java
// JavaBean to represent one address book entry.
//package com.deitel.advjhtp1.jdbc.addressbook;

public class AddressBookEntry {
   private String firstName = "";
   private String lastName = "";
   private String address1 = "";
   private String address2 = "";
   private String address3 = "";
   private String address4 = "";
   private String county = "";
   private String Province = "";
   private String eircode = "";
   private String phoneNumber = "";
   private String phoneNumber2 = "";
   private String emailAddress = "";
   private String emailAddress2 = "";
   private int personID;
   private int addressID;
   private int phoneID;
   private int emailID;
   
   // empty constructor
   public AddressBookEntry()
   {
   }

   // set person's id
   public AddressBookEntry( int id )
   {
      personID = id;
   }
   
   // set person's first name
   public void setFirstName( String first )
   {
      firstName = first;
   }
   
   // get person's first name
   public String getFirstName()
   {
      return firstName;
   }
   
   // set person's last name
   public void setLastName( String last )
   {
      lastName = last;
   }
   
   // get person's last name
   public String getLastName()
   {
      return lastName;
   }
   
   // set first line of person's address
   public void setAddress1( String firstLine )
   {
      address1 = firstLine;
   }
   
   // get first line of person's address
   public String getAddress1()
   {
      return address1;
   }
   
   // set second line of person's address
   public void setAddress2( String secondLine )
   {
      address2 = secondLine;
   }
   
   // get second line of person's address
   public String getAddress2()
   {
      return address2;
   }

   public String getAddress3() {return address3;}

   public void setAddress3(String addressA) {
      address3 = addressA;
   }



   public String getAddress4() {
      return address4;
   }

   public void setAddress4(String addressB) {
      address4 = addressB;
   }
   // set city in which person lives
   public void setcounty( String personCounty )
   {
      county = personCounty;
   }
   
   // get city in which person lives
   public String getcounty()
   {
      return county;
   }
   
   // set state in which person lives
   public void setProvince( String personProvince )
   {
      Province = personProvince;
   }
   
   // get state in which person lives
   public String getProvince()
   {
      return Province;
   }
   
   // set person's zip code
   public void seteircode( String eir )
   {
      eircode = eir;
   }
   
   // get person's zip code
   public String geteircode()
   {
      return eircode;
   }

   // set person's phone number
   public void setPhoneNumber( String number )
   {
      phoneNumber = number;
   }
   
   // get person's phone number 
   public String getPhoneNumber()
   {
      return phoneNumber;
   }
   // get person's phone number
   public String getPhoneNumber2() {
      return phoneNumber2;
   }
   // set person's phone number 2
   public void setPhoneNumber2(String Number2) {
      phoneNumber2 = Number2;
   }
   // set person's email address
   public void setEmailAddress( String email )
   {
      emailAddress = email;
   }
   
   // get person's email address
   public String getEmailAddress()
   {
      return emailAddress;
   }

   public void setEmailAddress2(String email2)
   {
      emailAddress2 = email2;
   }
   // get person's ID
   public String getEmailAddress2()
   {
      return emailAddress2;
   }


   public int getPersonID()
   {
      return personID;
   }
   
   // set person's addressID
   public void setAddressID( int id )
   {
      addressID = id;
   }
   
   // get person's addressID
   public int getAddressID()
   {
      return addressID;
   }
   
   // set person's phoneID
   public void setPhoneID( int id )
   {
      phoneID = id;
   }
   
   // get person's phoneID
   public int getPhoneID()
   {
      return phoneID;
   }
   
   // set person's emailID
   public void setEmailID( int id )
   {
      emailID = id;
   }
   
   // get person's emailID
   public int getEmailID()
   {
      return emailID;
   }
}  // end class AddressBookEntry


/**************************************************************************
 * (C) Copyright 2001 by Deitel & Associates, Inc. and Prentice Hall.     *
 * All Rights Reserved.                                                   *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
