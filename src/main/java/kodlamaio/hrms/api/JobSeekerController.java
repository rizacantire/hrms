package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.entites.concretes.JobSeeker;
import kodlamaio.hrms.entites.concretes.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/jobseekers/")
public class JobSeekerController {
    private JobSeekerService jobSeekerService;

    public JobSeekerController(JobSeekerService jobSeekerService){

        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping("getall")
    public List<JobSeeker> getAll(){

        return this.jobSeekerService.getAll();
    }

    @PostMapping("register")
    public void register(@RequestBody JobSeeker jobSeeker){
        this.jobSeekerService.register(jobSeeker);
    }

}
