package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.WorkerService;
import kodlamaio.hrms.entites.concretes.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/workers/")
public class WorkersController {

    private WorkerService workerService;

    @Autowired
    public WorkersController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping("getall")
    public List<Worker> getAll(){

        return this.workerService.getAll();
    }


}
