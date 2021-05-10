package kodlamaio.hrms.entites.concretes;

import javax.persistence.*;

@Entity
@Table(name = "worker")
public class Worker {

    @Id
    @GeneratedValue
    @Column(name = "person_id")
    private int id;

    public Worker() {
    }

    public Worker(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
