package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entites.concretes.Person;
import kodlamaio.hrms.entites.concretes.Work;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkDao extends JpaRepository<Work,Integer> {
    List<Work> findAllByName(String name);

}
