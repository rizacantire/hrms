package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entites.concretes.Employer;

import java.util.List;

public interface EmpolyerService {

    List<Employer> getAll();

    void add(Employer employer);
    void delete(Employer employer);
    void update(Employer employer);
}
