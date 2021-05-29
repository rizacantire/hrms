package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.entites.concretes.Employer;
import kodlamaio.hrms.entites.concretes.JobSeeker;
import kodlamaio.hrms.entites.concretes.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/jobseekers/")
public class EmployersController {
    private EmployerService employerService;

    public EmployersController(EmployerService employerService){

        this.employerService = employerService;
    }

    @GetMapping("getall")
    public List<Employer> getAll(){

        return this.employerService.getAll();
    }

    @PostMapping("register")
    public void register(@RequestBody Employer employer){
        this.employerService.register(employer);
    }

}
