package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmpolyerService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entites.concretes.Employer;
import org.springframework.stereotype.Service;

import java.util.List;


public class EmployerManager implements EmpolyerService {
    private EmployerDao employerDao;


    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public List<Employer> getAll() {
        return this.employerDao.findAll();
    }

    @Override
    public void add(Employer employer) {

    }

    @Override
    public void delete(Employer employer) {

    }

    @Override
    public void update(Employer employer) {

    }
}
