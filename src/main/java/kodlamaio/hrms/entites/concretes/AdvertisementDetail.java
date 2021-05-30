package kodlamaio.hrms.entites.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "advertisement_detail")
public class AdvertisementDetail {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "advertisement_id")
    private int advertisementId;

    @Column(name = "work_id")
    private int workId;

    @Column(name = "city_id")
    private int cityId;


}
