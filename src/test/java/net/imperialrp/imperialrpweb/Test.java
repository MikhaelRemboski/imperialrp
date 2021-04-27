package net.imperialrp.imperialrpweb;

import net.imperialrp.imperialrpweb.model.AppAccounts;
import net.imperialrp.imperialrpweb.repositories.AppAccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootTest
public class Test {
    @Autowired
    AppAccountsRepository repo;

    @Autowired
    BCryptPasswordEncoder encoder;
    @org.junit.jupiter.api.Test
    public void createUserTest(){
        AppAccounts us = new AppAccounts();
        us.setId(3);
        us.setPassword(encoder.encode("neoBlue"));
        us.setUser("Ne0Blue");
        repo.save(us);

    }
}
