/**
 * 
 * Template design pattern is used when there some specific steps has to be followed by all the subclasses to implement some
 * functionality.
 * However the way the eaach steps are perfomed may vary in different classes.
 * But all the steps has to followed.
 */

 // Consider the example of payment system : There is B2B payment & B2C payement.
 // Both the payment system has to follow the same steps to perform the payment.
 // In B2B the gst calculation is 18%, in B2C gst is 12%


 public abstract class Payment{
    abstract void validate();
    abstract void calculateGST();
    abstract void debit();
    abstract void credit();
    abstract void generateInvoice();
    public final void pay(){
      validate();
      calculateGST();
      debit();
      credit();
      generateInvoice();
    }
 }

 class B2BPayment extends Payment{

   @Override
   void validate() {
      System.out.println("Validate : B2B");
   }

   @Override
   void calculateGST() {
      System.out.println("Apply 18% gst : B2B");
   }

   @Override
   void debit() {
      System.out.println("debit : B2B");
   }

   @Override
   void credit() {
      System.out.println("credit : B2B");
   }

   @Override
   void generateInvoice() {
      System.out.println("generate invoice : B2B");
   }  
 }


 class B2CPayment extends Payment{

   @Override
   void validate() {
      System.out.println("Validate : B2C");
   }

   @Override
   void calculateGST() {
      System.out.println("Apply 18% gst : B2C");
   }

   @Override
   void debit() {
      System.out.println("debit : B2C");
   }

   @Override
   void credit() {
      System.out.println("credit : B2C");
   }

   @Override
   void generateInvoice() {
      System.out.println("generate invoice : B2C");
   }  
 }

class Main{
   public static void main(String[] args) {
      Payment payment = new B2BPayment();
      payment.pay(); // will use the steps but will follow the implementation in B2B class
   }
}