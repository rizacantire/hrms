package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entites.concretes.Worker;

import java.util.List;

public interface WorkerService {
    DataResult<List<Worker>> getAll();

    Result register(Worker worker);
    Result delete(Worker worker);
    Result update(Worker worker);
}
