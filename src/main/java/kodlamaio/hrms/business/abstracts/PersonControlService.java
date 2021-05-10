package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entites.concretes.Person;

public interface PersonControlService {

    boolean checkFirstName(Person person);
    boolean checkLastName(Person person);
    boolean checkEMail(Person person);
    boolean checkPassword(Person person);
}
