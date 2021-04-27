package net.imperialrp.imperialrpweb.repositories;

import net.imperialrp.imperialrpweb.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByName(String name);

    @Modifying
    @Query(value = "UPDATE Users SET Users.vip = ?1, Users.group = ?2, Users.phoneNumber = ?3  where  Users.name = ?4", nativeQuery = true)
    int setVip(int vip,String group, String phoneNumber, String name);
}
