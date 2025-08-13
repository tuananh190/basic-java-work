package get_set;
import java.util.Scanner;
public class Main {
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("tên chủ tài khoản : ");
        String name = scanner.nextLine();

        System.out.print("Nhập số dư ban đầu: ");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(name, balance);

        System.out.println("hãy nhập số tiền muốn rút : ");
        double amount = scanner.nextDouble();


        account.withdraw(amount);

        System.out.println("Chủ tài khoản: " + account.getAccountHolder());
        System.out.println("Số dư hiện tại: " + account.getBalance());

        scanner.close();
    }
}