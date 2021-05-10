package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entites.concretes.Person;
import kodlamaio.hrms.entites.concretes.Work;
import kodlamaio.hrms.entites.concretes.Worker;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WorkService {
    List<Work> getAll();

    void add(Work work);
    void delete(Work work);
    void update(Work work);
}
