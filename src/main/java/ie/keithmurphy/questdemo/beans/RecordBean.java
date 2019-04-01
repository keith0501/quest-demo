package ie.keithmurphy.questdemo.beans;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class RecordBean {


    private String name;

    @Id
    private String pps;

    @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    private Date dob;

    private String phone;

    public RecordBean(String name, String pps, Date dob, String phone) {
        this.name = name;
        this.pps = pps;
        this.dob = dob;
        this.phone = phone;
    }

    public RecordBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPps() {
        return pps;
    }

    public void setPps(String pps) {
        this.pps = pps;
    }

    @DateTimeFormat(pattern="dd-MMM-YYYY")
    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String number) {
        this.phone = number;
    }
}
