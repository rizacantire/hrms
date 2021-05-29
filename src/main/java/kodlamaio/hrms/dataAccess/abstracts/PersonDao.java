package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entites.concretes.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonDao extends JpaRepository<Person,Integer> {
    List<Person> findAllByMail(String mail);
}
