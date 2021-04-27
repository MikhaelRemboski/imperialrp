package net.imperialrp.imperialrpweb.services;

import net.imperialrp.imperialrpweb.model.AppAccounts;
import net.imperialrp.imperialrpweb.repositories.AppAccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppAccountServiceImpl implements UserDetailsService {
    @Autowired
    AppAccountsRepository repo;

    @Override
    public UserDetails loadUserByUsername(String user) throws UsernameNotFoundException {
        AppAccounts us = repo.findByUser(user);
        List<GrantedAuthority> userRols = new ArrayList<>();
        userRols.add(new SimpleGrantedAuthority("Admin"));
        return new User(us.getUser(), us.getPassword(),userRols);
    }
}
