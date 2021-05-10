package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.WorkService;
import kodlamaio.hrms.entites.concretes.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/works/")
public class WorksController {

    private WorkService workService;

    @Autowired
    public WorksController(WorkService workService) {
        this.workService = workService;
    }

    @GetMapping("getall")
    public List<Work> getAll(){
        return this.workService.getAll();
    }


}
