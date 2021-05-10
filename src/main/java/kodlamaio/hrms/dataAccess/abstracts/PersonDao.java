package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entites.concretes.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person,Integer> {
}
