package net.imperialrp.imperialrpweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @Column (name = "identifier")
    private String identifier;
    @Column(name = "license")
    private String license;
    @Column(name = "money")
    private int money;
    @Column(name = "name")
    private String name;
    @Column(name = "skin")
    private String skin;
    @Column(name = "job")
    private String job;
    @Column(name = "job_grade")
    private int jobGrade;
    @Column(name = "loadout")
    private String loadout;
    @Column(name = "position")
    private String position;
    @Column(name = "bank")
    private int bank;
    @Column(name = "permission_level")
    private int permissionLevel;
    @Column(name = "group")
    private String group;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "dateofbirth")
    private String dateOfBirth;
    @Column(name = "sex")
    private String sex;
    @Column(name = "height")
    private String height;
    @Column(name = "is_dead")
    private int isDead;
    @Column(name = "status")
    private String status;
    @Column(name = "tattoos")
    private String tattoos;
    @Column(name = "last_property")
    private String lastProperty;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "vip")
    private int vip;
    @Column(name = "secondjob")
    private String secondJob;
    @Column(name = "secondjob_grade")
    private String secondJobGrade;
    @Column(name = "question_rp")
    private String questionRp;


    public String getIdentifier() {
        return identifier;
    }

    public String getLicense() {
        return license;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public String getSkin() {
        return skin;
    }

    public String getJob() {
        return job;
    }

    public int getJobGrade() {
        return jobGrade;
    }

    public String getLoadout() {
        return loadout;
    }

    public String getPosition() {
        return position;
    }

    public int getBank() {
        return bank;
    }

    public int getPermissionLevel() {
        return permissionLevel;
    }

    public String getGroup() {
        return group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public String getHeight() {
        return height;
    }

    public int getIsDead() {
        return isDead;
    }

    public String getStatus() {
        return status;
    }

    public String getTattoos() {
        return tattoos;
    }

    public String getLastProperty() {
        return lastProperty;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getVip() {
        return vip;
    }

    public String getSecondJob() {
        return secondJob;
    }

    public String getSecondJobGrade() {
        return secondJobGrade;
    }

    public String getQuestionRp() {
        return questionRp;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setJobGrade(int jobGrade) {
        this.jobGrade = jobGrade;
    }

    public void setLoadout(String loadout) {
        this.loadout = loadout;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public void setPermissionLevel(int permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setIsDead(int isDead) {
        this.isDead = isDead;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTattoos(String tattoos) {
        this.tattoos = tattoos;
    }

    public void setLastProperty(String lastProperty) {
        this.lastProperty = lastProperty;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }

    public void setSecondJob(String secondJob) {
        this.secondJob = secondJob;
    }

    public void setSecondJobGrade(String secondJobGrade) {
        this.secondJobGrade = secondJobGrade;
    }

    public void setQuestionRp(String questionRp) {
        this.questionRp = questionRp;
    }
}
