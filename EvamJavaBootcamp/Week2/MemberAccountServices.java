package Week2;

public class MemberAccountServices {

    MemberAccount memberAccount; // Yeni bir MemberAccount objesi olusturuldu

    public MemberAccountServices(MemberAccount memberAccount) {
        this.memberAccount = memberAccount;
    }

    public MemberAccount create(MemberAccount memberAccount) {
        System.out.println("Yeni bir customer eklendi");
        this.memberAccount = memberAccount;
        return null;
    }

    public MemberAccount read() {
        System.out.println("Customer bilgileri getirildi");
        return this.memberAccount;
    }

    public MemberAccount update(MemberAccount memberAccount) {
        System.out.println("Customer bilgileri guncellendi");
        this.memberAccount = memberAccount;
        return this.memberAccount;
    }

    public void delete() {
        System.out.println("Customer bilgileri silindi");
        this.memberAccount = null;
    }
}
