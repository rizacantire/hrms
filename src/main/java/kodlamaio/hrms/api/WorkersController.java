package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.WorkerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entites.concretes.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/workers/")
public class WorkersController {

    private WorkerService workerService;

    @Autowired
    public WorkersController(WorkerService workerService) {

        super();
        this.workerService = workerService;
    }

    @GetMapping("getall")
    public DataResult<List<Worker>> getAll(){

        return this.workerService.getAll();
    }

    @PostMapping("register")
    public Result add(@RequestBody Worker worker){
        return this.workerService.register(worker);

    }


}
