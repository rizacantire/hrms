package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entites.concretes.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkDao extends JpaRepository<Work,Integer> {
}
