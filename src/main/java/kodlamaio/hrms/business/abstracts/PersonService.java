package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entites.concretes.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAll();

    void register(Person person);
    void delete(Person person);
    void update(Person person);
}
