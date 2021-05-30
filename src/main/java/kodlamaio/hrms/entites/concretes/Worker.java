package kodlamaio.hrms.entites.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "worker")
public class Worker {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @OneToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "person_id")
    private Person person;






}
