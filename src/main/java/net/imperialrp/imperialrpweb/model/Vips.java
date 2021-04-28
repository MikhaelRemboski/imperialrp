package net.imperialrp.imperialrpweb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Vips {
    @Id
    private int id;
    private String steamName;
    private String steamHex;
    private String vipType;
    private Date vipStart;
    private Date vipEnd;
    private boolean permanentVip;

    public String getSteamName() {
        return steamName;
    }

    public String getSteamHex() {
        return steamHex;
    }

    public String getVipType() {
        return vipType;
    }

    public Date getVipStart() {
        return vipStart;
    }

    public Date getVipEnd() {
        return vipEnd;
    }

    public boolean isPermanentVip() {
        return permanentVip;
    }

    public int getId() {
        return id;
    }

    public void setSteamName(String steamName) {
        this.steamName = steamName;
    }

    public void setSteamHex(String steamHex) {
        this.steamHex = steamHex;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public void setVipStart(Date vipStart) {
        this.vipStart = vipStart;
    }

    public void setVipEnd(Date vipEnd) {
        this.vipEnd = vipEnd;
    }

    public void setPermanentVip(boolean permanentVip) {
        this.permanentVip = permanentVip;
    }

    public void setId(int id) {
        this.id = id;
    }
}
