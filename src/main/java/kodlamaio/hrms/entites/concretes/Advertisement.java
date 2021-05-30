package kodlamaio.hrms.entites.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "advertisement")
public class Advertisement {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @ManyToOne()
    @JoinColumn(name="employer_id")
    private Employer employer;

    @Column(name = "description")
    private String description;

    @Column(name = "salary")
    private int salary;

    @Column(name = "number")
    private int number;

    @Column(name = "publish_date")
    private Date publishDate;

    @Column(name = "last_application_date")
    private Date lastApplicationDate;

    @Column(name = "is_active")
    private boolean isActive;


    @ManyToOne()
    @JoinColumn(name="work_id")
    private Work work;

    @ManyToOne()
    @JoinColumn(name="city_id")
    private City city;


}
