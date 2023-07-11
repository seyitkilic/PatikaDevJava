package business.concretes;

import business.abstracts.AccountService;
import core.InvalidAuthenticationStatus;
import entities.abstracts.Account;
import entities.abstracts.EnumAuthenticationStatus;

import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager implements AccountService {
    private Scanner scanner = new Scanner(System.in);
    TreeSet<Account> ourAccounts = new TreeSet<>();

    @Override
    public Account login() {
        Account realAccount = null;
        Account tempAccount = null;

        System.out.println("Lütfen email adresinizi giriniz: ");
        String email = scanner.nextLine();

        System.out.println("Lütfen şifrenizi giriniz: ");
        String password = scanner.nextLine();

        if (ourAccounts.stream().anyMatch((p) -> p.getUser().getEmail().equals(email))) {
            for (Account account : ourAccounts) {
                if (account.getUser().getEmail().equals(email)) {
                    tempAccount = account;
                }
            }

            try {
                if (tempAccount.login(email, password) == EnumAuthenticationStatus.success) {
                    realAccount = tempAccount;
                }
            }  catch (InvalidAuthenticationStatus e) {
                throw new RuntimeException(e);
            }
        }

        return realAccount;
    }
}
