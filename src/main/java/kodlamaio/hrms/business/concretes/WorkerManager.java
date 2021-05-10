package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.WorkService;
import kodlamaio.hrms.dataAccess.abstracts.WorkerDao;
import kodlamaio.hrms.entites.concretes.Work;

import java.util.List;


public class WorkerManager implements WorkService {
    private WorkerDao workerDao;

    public WorkerManager(WorkerDao workerDao) {
        this.workerDao = workerDao;
    }

    @Override
    public List<Work> getAll() {
        return null;
    }

    @Override
    public void add(Work work) {

    }

    @Override
    public void delete(Work work) {

    }

    @Override
    public void update(Work work) {

    }
}
