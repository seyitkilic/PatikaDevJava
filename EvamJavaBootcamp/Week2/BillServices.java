package Week2;

import java.util.Date;

public class BillServices {
    boolean status = true;

    Response payment(int billType, String memberCode, double balance, double amount) throws CustomExeption {

        if (balance < amount) {
            throw new CustomExeption("Islem icin Bakiye Yetersizdir!!");
        } else {
            return new Response("0", "2022-10-10");
        }
    }

    public Response inquire(int billType, String memberCode, double amount, Date billDate) {
        if (status) {
            return new Response("0", "2022-10-10");

        } else {
            return new Response("1", "2022-10-10");

        }
    }

    public Response cancelPayment(int billType, String memberCode, double amount, int paymentId, Date billDate) {

        return new Response("0", "2022-10-10");
    }
}