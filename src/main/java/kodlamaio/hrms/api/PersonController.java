package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.PersonService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
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
    public DataResult<List<Person>> getAll(){

       return this.personService.getAll();
    }

    @PostMapping("register")
    public Result register(@RequestBody Person person){

        return this.personService.register(person);
    }

}
