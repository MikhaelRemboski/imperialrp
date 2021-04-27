package net.imperialrp.imperialrpweb.repositories;

import net.imperialrp.imperialrpweb.model.AppAccounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppAccountsRepository extends JpaRepository<AppAccounts, Long> {
    AppAccounts findByUser(String user);




}
