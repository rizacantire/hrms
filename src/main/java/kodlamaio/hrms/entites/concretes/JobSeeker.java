package kodlamaio.hrms.entites.concretes;

import javax.persistence.*;

@Entity
@Table(name = "job_seeker")
public class JobSeeker {

    @Id
    @GeneratedValue
    @Column(name = "person_id")
    private int id;

    public JobSeeker() {
    }

    public JobSeeker(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
