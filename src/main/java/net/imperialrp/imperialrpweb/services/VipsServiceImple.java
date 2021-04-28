package net.imperialrp.imperialrpweb.services;

import net.imperialrp.imperialrpweb.model.Vips;
import net.imperialrp.imperialrpweb.repositories.VipsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VipsServiceImple implements VipsService{

    @Autowired
    VipsRepository repo;

    @Override
    public List<Vips> getVipsList() {
        List<Vips> vipsList = repo.findAll();
        return vipsList;
    }


}
