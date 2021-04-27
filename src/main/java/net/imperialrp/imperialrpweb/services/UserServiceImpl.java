package net.imperialrp.imperialrpweb.services;


import net.imperialrp.imperialrpweb.model.Users;
import net.imperialrp.imperialrpweb.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UsersRepository repo;

    @Override
    public Users getByName(String name) {
        Users us = repo.findByName(name);
        return us;
    }

    @Override
    public String setVip(Users users, int vip, String group, String phoneNumber) {
        users.setVip(vip);
        users.setGroup(group);
        if (phoneNumber.length() > 4) {
            users.setPhoneNumber(phoneNumber);
        }
        repo.setVip(users.getVip(), users.getGroup(),users.getPhoneNumber(), users.getName());
        return users.getIdentifier();
    }
}
