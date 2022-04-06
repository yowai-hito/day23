package giphy.pikachu.Models;

import java.sql.Date;

public class DataObject {
    public String email;
    public String name;
    public int phone;
    public String status;
    public Date dob;
    public String passphrase;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public String getStatus() {
        return status;
    }
    public String getPassphrase() {
        return passphrase;
    }
    public void setPassphrase(String passPhrase) {
        this.passphrase = passPhrase;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }

    

    
}
