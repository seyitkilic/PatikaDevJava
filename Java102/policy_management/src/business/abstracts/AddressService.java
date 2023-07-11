package business.abstracts;

import entities.abstracts.User;

public interface AddressService {
    public void addAddress(User user);

    public void deleteAddress(User user);
}
