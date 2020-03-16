package by.itstep.goryachev.patterns;


public class FasadeMain {
    public static void main(String[] args) {

    }
}

class User {
    int wallet;
    void addWallet (int c){
        this.wallet += c;
    }

    void removeWallet(int c){
        this.wallet -= c;
    }

}
class ATM {
    int cash;
    void addCash (int c){
        this.cash += c;
    }

    void removeCash (int c){
        this.cash -= c;
    }
}
class Bank {
    int balance;

    void addBalance (int c){
        this.balance += c;
    }

    void removeBalance (int c){
        this.balance -= c;
    }
}

class Fasade {
    void addMoney (int c){
        
    }
}
