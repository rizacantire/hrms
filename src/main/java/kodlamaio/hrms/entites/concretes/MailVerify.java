package kodlamaio.hrms.entites.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mail_verify")
public class MailVerify {
    @Id
    @GeneratedValue
    @Column(name = "person_id")
    private int id;

    @Column(name = "verify_code")
    private String verifyCode;


}
