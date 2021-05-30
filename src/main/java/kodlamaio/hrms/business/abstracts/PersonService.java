package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.entites.concretes.Person;

import java.util.List;

public interface PersonService {
    DataResult<List<Person>> getAll();

    Result register(Person person);
    Result delete(Person person);
    Result update(Person person);
}
