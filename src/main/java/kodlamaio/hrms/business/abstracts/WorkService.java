package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entites.concretes.Work;

import java.util.List;
import java.util.Optional;


public interface WorkService {
    DataResult<List<Work>> getAll();

    Result add(Work work);
    Result delete(Work work);
    Result update(Work work);
    DataResult<Optional<Work>> getById(int id);
}
