package kodlamaio.hrms.entites.concretes;

import javax.persistence.*;

@Entity
@Table(name = "mail_verify")
public class MailVerify {
    @Id
    @GeneratedValue
    @Column(name = "person_id")
    private int id;

    @Column(name = "verify_code")
    private String verifyCode;

    public MailVerify(int id, String verifyCode) {
        this.id = id;
        this.verifyCode = verifyCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }
}
