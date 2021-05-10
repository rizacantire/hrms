package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.WorkService;
import kodlamaio.hrms.dataAccess.abstracts.WorkDao;
import kodlamaio.hrms.entites.concretes.Work;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkManager implements WorkService {

    private WorkDao workDao;

    public WorkManager(WorkDao workDao) {
        this.workDao = workDao;
    }

    @Override
    public List<Work> getAll() {
        return this.workDao.findAll();
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
