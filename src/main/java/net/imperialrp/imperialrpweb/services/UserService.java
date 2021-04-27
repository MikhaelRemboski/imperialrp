package net.imperialrp.imperialrpweb.services;

import net.imperialrp.imperialrpweb.model.Users;

public interface UserService {
    Users getByName(String name);
    String setVip(Users users, int vip, String group, String phoneNumber);
}
