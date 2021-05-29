package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.WorkService;
import kodlamaio.hrms.business.abstracts.WorkerService;
import kodlamaio.hrms.dataAccess.abstracts.WorkerDao;
import kodlamaio.hrms.entites.concretes.Work;
import kodlamaio.hrms.entites.concretes.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerManager implements WorkerService {
    private WorkerDao workerDao;
    @Autowired
    public WorkerManager(WorkerDao workerDao) {
        this.workerDao = workerDao;
    }


    @Override
    public List<Worker> getAll() {
        return this.workerDao.findAll();
    }

    @Override
    public void register(Worker worker) {
        this.workerDao.save(worker);
    }

    @Override
    public void delete(Worker worker) {
        this.workerDao.delete(worker);
    }

    @Override
    public void update(Worker worker) {
        this.workerDao.save(worker);
    }
}
