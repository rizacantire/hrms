package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entites.concretes.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerDao extends JpaRepository<Worker,Integer> {
}
