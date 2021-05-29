package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entites.concretes.Employer;

import java.util.List;

public interface EmployerService {

    List<Employer> getAll();

    void register(Employer employer);
    void delete(Employer employer);
    void update(Employer employer);
}
