package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.PersonService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.dataAccess.abstracts.PersonDao;
import kodlamaio.hrms.entites.concretes.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonManager implements PersonService {

    private PersonDao personDao;

    public PersonManager(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public List<Person> getAll() {
        return null;
    }

    @Override
    public void add(Person person) {

    }

    @Override
    public void delete(Person person) {

    }

    @Override
    public void update(Person person) {

    }
}
