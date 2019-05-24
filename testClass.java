package javaapplication1;
public class JavaApplication1 
{
    public static void main(String[] args) {
        // Create a Customer object for Julie James.
         Customer myCustomer = new Customer("Julie James", "123 Main Street", "555-1212",
        "147-A049", true);
         // Display the object's data.
         System.out.println("Name: " + myCustomer.getName());
         System.out.println("Address: " + myCustomer.getAddress());
         System.out.println("Telephone: " + myCustomer.getPhone());
         System.out.println("Customer Number: " + myCustomer.getCustomerNumber());
         if (myCustomer.getMailingList())
             System.out.println("Mailing List: YES");
         else
             System.out.println("Mailing List: NO");
         // Create a PreferredCustomer object for Julie James.
         // She has $1750.00 in purchases. That entitles her to a 7% discount on future purchases.
         PreferredCustomer myPCustomer = new PreferredCustomer("Julie James", "123 Main Street", "555-1212", "147-A049", true, 1750.00);
         // Display the object's data.
         System.out.println("Name: " + myPCustomer.getName());
         System.out.println("Address: " + myPCustomer.getAddress());
         System.out.println("Telephone: " + myPCustomer.getPhone());
         System.out.println("Customer Number: " + myPCustomer.getCustomerNumber());
         if (myPCustomer.getMailingList())
             System.out.println("Mailing List: YES");
         else
             System.out.println("Mailing List: NO");
         System.out.println("Purchases: $" + myPCustomer.getPurchases());
         System.out.println("Discount level: " + myPCustomer.getDiscountLevel());
    } 
}
