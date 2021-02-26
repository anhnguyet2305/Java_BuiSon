package Account;



public class Account {
    int id;
    String name;
    int balance;

    public Account(){

    }
    public Account(int id, String name, int balance){
        this.id=id;
        this.name=name;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void credit(int amount){
        this.balance += amount;
    }

    public void debit(int amount){
        if (amount > this.balance){
            System.out.println("thanh toan thanh cong");
        }else {
            this.balance -= amount;
        }
    }
    public void tranferTo(Account account, int amount){
        if (amount > this.balance){
            System.out.println("chuyen tien k thanh cong");
        }else {
            this.balance -= amount;
            account.credit(amount);
        }
    }

}
