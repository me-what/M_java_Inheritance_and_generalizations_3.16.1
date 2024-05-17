public class Main {
    public static void main(String[] args) {
        DepositAccount<Integer, String> dAccount1 = new DepositAccount(20, "Tom");
        System.out.println(dAccount1.getId() + " : " + dAccount1.getName());

        DepositAccount<String, Integer> dAccount2 = new DepositAccount("12345", 23456);
        System.out.println(dAccount2.getId() + " : " + dAccount2.getName());
        System.out.println();

        DepositAccount<Integer, String> depAccount = new DepositAccount<>(111, "Bob");
        Account<Integer> account = (Account<Integer>) depAccount;
        System.out.println(account.getId());
        System.out.println(depAccount.getName());
    }
}