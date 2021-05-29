package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entites.concretes.Work;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface WorkService {
    List<Work> getAll();

    void add(Work work);
    void delete(Work work);
    void update(Work work);
    Optional<Work> getById(int id);
}
