package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.WorkService;
import kodlamaio.hrms.dataAccess.abstracts.WorkDao;
import kodlamaio.hrms.entites.concretes.Person;
import kodlamaio.hrms.entites.concretes.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class WorkManager implements WorkService {

    private WorkDao workDao;

    @Autowired
    public WorkManager(WorkDao workDao) {
        this.workDao = workDao;
    }


    @Override
    public List<Work> getAll() {

        return this.workDao.findAll();
    }


    @Override
    @Transactional
    public void add(Work work) {

        if (this.workDao.findAllByName(work.getName()).stream().count() != 0) {
            System.out.println("İş sistemde kayıtlı");;
        } else {
            this.workDao.save(work);
        }


    }

    @Override
    public void delete(Work work) {

    }

    @Override
    public void update(Work work) {

    }

    @Override
    public Optional<Work> getById(int id) {

        return this.workDao.findById(id);
    }
}
