public class Main {

    public static void main(String[] args) {

        Bank account = new Bank(1000);

        Transactions.withdraw(account, 100, new TransactionsListener() {
            @Override
            public void onLoading() {
                System.out.println("Please wait...");
            }

            @Override
            public void onSuccess() {
                System.out.printf("Your balance is: %d%n", account.getTotal());
            }

            @Override
            public void onError(String error) {
                System.out.printf("Error : %s%n", error);
            }
        });

        System.out.println("On est sortie du listener");
        System.out.println("On continue");
    }
}
