package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.PersonService;
import kodlamaio.hrms.dataAccess.abstracts.PersonDao;
import kodlamaio.hrms.entites.concretes.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonManager implements PersonService {

    private PersonDao personDao;

    @Autowired
    public PersonManager(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public List<Person> getAll() {

        return this.personDao.findAll();
    }

    @Override
    public void register(Person person) {

        if (this.personDao.findAllByMail(person.getMail()).stream().count() != 0) {
                System.out.println("Mail adresi sistemde kayıtlı");;
            } else {
                this.personDao.save(person);
            }

    }

    @Override
    public void delete(Person person) {
        this.personDao.delete(person);
    }

    @Override
    public void update(Person person) {
        List<Person> users = getAll();

        for (Person user : users) {
            if (user.getMail() == person.getMail()) {
                System.out.println("Mail adresi sistemde kayıtlı");;
            } else {
                this.personDao.save(person);
            }
        }
    }

}
