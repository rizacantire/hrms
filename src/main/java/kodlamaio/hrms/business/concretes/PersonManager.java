package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.PersonService;
import kodlamaio.hrms.core.utilities.results.*;
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
    public DataResult<List<Person>> getAll() {

        return new SuccessDataResult<List<Person>>(this.personDao.findAll());
    }

    @Override
    public Result register(Person person) {

        if (this.personDao.findAllByMail(person.getMail()).stream().count() != 0) {
                return new ErrorResult("Mail adresi kayıtlı");
            } else {
                this.personDao.save(person);
                return new SuccessResult("Kayıt işlemi başarılı");
            }

    }

    @Override
    public Result delete(Person person) {

        this.personDao.delete(person);
        return new SuccessResult("Kişi silindi");
    }

    @Override
    public Result update(Person person) {
        if (this.personDao.findAllByMail(person.getMail()).stream().count() != 0) {
            return new ErrorResult("Mail adresi kayıtlı");
        } else {
            this.personDao.save(person);
            return new SuccessResult("Kayıt işlemi başarılı");
        }
    }

}
