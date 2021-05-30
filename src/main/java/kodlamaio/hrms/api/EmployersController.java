package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entites.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employers/")
public class EmployersController {
    private EmployerService employerService;

    @Autowired
    public EmployersController(EmployerService employerService){

        this.employerService = employerService;
    }

    @GetMapping("getall")
    public DataResult<List<Employer>> getAll(){

        return this.employerService.getAll();
    }

    @PostMapping("register")
    public Result register(@RequestBody Employer employer){

        return this.employerService.register(employer);
    }

}
