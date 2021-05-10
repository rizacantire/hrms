package kodlamaio.hrms.entites.concretes;

import javax.persistence.*;

@Entity
@Table(name = "employer")
public class Employer {
    @Id
    @GeneratedValue
    @Column(name = "person_id")
    private int id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_site")
    private String webSite;

    @Column(name = "phone")
    private String phone;

    public Employer() {
    }

    public Employer(int id, String companyName, String webSite, String phone) {
        this.id = id;
        this.companyName = companyName;
        this.webSite = webSite;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
