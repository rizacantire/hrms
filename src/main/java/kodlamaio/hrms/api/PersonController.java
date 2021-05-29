package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.PersonService;
import kodlamaio.hrms.entites.concretes.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/persons/")
public class PersonController {
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @GetMapping("getall")
    public List<Person> getAll(){

       return this.personService.getAll();
    }

    @PostMapping("register")
    public void register(@RequestBody Person person){
        this.personService.register(person);
    }

}
