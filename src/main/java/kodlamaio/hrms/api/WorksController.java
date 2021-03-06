package kodlamaio.hrms.api;

import kodlamaio.hrms.business.abstracts.WorkService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entites.concretes.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/works/")
public class WorksController {

    private WorkService workService;

    @Autowired
    public WorksController(WorkService workService) {
        this.workService = workService;
    }

    @GetMapping("getall")
    public DataResult<List<Work>> getAll(){

        return this.workService.getAll();
    }

    @PostMapping("add")
    @Transactional
    public Result add(@RequestBody Work work){

        return this.workService.add(work);

    }

    @GetMapping(value="get/{id}")
    public DataResult<Optional<Work>> getById(@PathVariable int id){
        return this.workService.getById(id);
    }

}
