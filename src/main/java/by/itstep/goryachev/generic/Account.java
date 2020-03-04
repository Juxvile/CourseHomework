package by.itstep.goryachev.generic;


public class Account implements Accountable{
    private String id;
    private int sum;

    <T> Account (T id, int sum) {
        this.id = id.toString();
        this.sum = sum;
    }

    @Override
    public Object getId() {
        return id;
    }

    @Override
    public int getSum() {
        return sum;
    }

    @Override
    public void setSum(int sum) {
        this.sum = sum;
    }

    public Account() {
    }

    public static void main(String[] args) {
        Account account = new Account (3525,412421);
        System.out.println(account.getId());

    }

}
