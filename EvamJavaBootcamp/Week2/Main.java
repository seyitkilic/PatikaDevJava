package Week2;

public class Main {
    public static void main(String[] args) throws CustomExeption {
        BillServices bs = new BillServices();
        Response r = bs.payment(1, "araba", 16, 11);

        if (r.getCode().equals("0")) {
            System.out.println("Islem " + r.getDate() + " tarihinde Basariyla tamamlandi");
        } else if (r.getCode().equals("1")) {
            System.out.println("Islem " + r.getDate() + " tarihinde Basarisiz oldu");
        } else {
            System.out.println("HATA olustu!");
        }

        MemberAccount m = new MemberAccount("555555555", "seyit", "kilic", "2sma", 1100, 111);
        MemberAccountServices m2 = new MemberAccountServices(m);
        System.out.println(m.memberCode());
        m2.read();

        m.setBalance(100.0);
        m2.update(m);

    }
}
