class Wallet {
    private double totalAmount;

    public void addMoney(double money) {
        if (money > 0) totalAmount += money;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

public class program4 {
    public static void main(String[] args) {
        Wallet myWallet = new Wallet();
        myWallet.addMoney(500);
        System.out.println(myWallet.getTotalAmount());
    }
}
