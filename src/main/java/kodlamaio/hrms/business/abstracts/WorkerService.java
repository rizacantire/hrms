package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entites.concretes.Worker;

import java.util.List;

public interface WorkerService {
    List<Worker> getAll();

    void register(Worker worker);
    void delete(Worker worker);
    void update(Worker worker);
}
