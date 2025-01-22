public class Account {
 
  private int accNo;
  private String name;

  public Account(int accNo, String name) {
      this.accNo = accNo;
      this.name = name;
  }

  public int getAccNo() {
      return accNo;
  }

  public void setAccNo(int accNo) {
      this.accNo = accNo;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public void displayAccountDetails() {
      System.out.println("Account Number: " + accNo);
      System.out.println("Account Holder: " + name);
  }

  public static void main(String[] args) {

      Account account1 = new Account(101, "John Doe");

      account1.displayAccountDetails();
  }
}
