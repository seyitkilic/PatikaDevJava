package Week2;

import java.util.Date;

public interface Client {

    Response payment(int billType, String memberCode, double balance, double amount) throws CustomExeption;

    Response inquire(int billType, String memberCode);

    Response inquire(int billType, String memberCode, double amount, Date billDate);

    Response cancelPayment(int billType, String memberCode, double amount, int paymentId, Date billDate);
}
