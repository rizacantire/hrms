package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entites.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {
}
