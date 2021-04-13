public class Main {
    public static void main(String[] args) {
        int account = 300;
        int pay = 1005;
        int bonus = 0;
        if (pay > 1000) {
            bonus = (pay/100);
        }
        account = account + pay + bonus;
        System.out.println("Account = " + account);
    }
}