package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entites.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public List<Employer> getAll() {
        return this.employerDao.findAll();
    }

    @Override
    public void register(Employer employer) {
        this.employerDao.save(employer);

    }

    @Override
    public void delete(Employer employer) {
        this.employerDao.delete(employer);
    }

    @Override
    public void update(Employer employer) {
        this.employerDao.save(employer);
    }
}
