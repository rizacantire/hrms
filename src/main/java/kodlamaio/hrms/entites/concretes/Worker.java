package kodlamaio.hrms.entites.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "worker")
public class Worker {

    @Id
    @GeneratedValue
    @Column(name = "person_id")
    private int id;


}
