import java.util.Timer;
import java.util.TimerTask;

public class Transactions {

    public static void withdraw(Bank account, int value,  TransactionsListener event) {
       
        if(value == 0 ){
            event.onError("La valeur a deduire n'est pas valable ");
        }

        event.onLoading();

        int time = (int) (Math.random() * ((1000 - 500) + 1)) + 500;
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                account.setTotal(account.getTotal() - value);
                event.onSuccess();
            }
        }, time);
    }

   
}
