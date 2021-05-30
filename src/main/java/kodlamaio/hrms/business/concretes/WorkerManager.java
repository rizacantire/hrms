package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.WorkerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.WorkerDao;
import kodlamaio.hrms.entites.concretes.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerManager implements WorkerService {
    private WorkerDao workerDao;
    @Autowired
    public WorkerManager(WorkerDao workerDao) {
        this.workerDao = workerDao;
    }


    @Override
    public DataResult<List<Worker>> getAll() {

        return new SuccessDataResult<List<Worker>>(this.workerDao.findAll());
    }

    @Override
    public Result register(Worker worker) {

        this.workerDao.save(worker);
        return new SuccessResult("Çalışan kaydı gerçekleşti");
    }

    @Override
    public Result delete(Worker worker) {
        this.workerDao.delete(worker);
        return new SuccessResult("Çalışan kaydı güncellendi");
    }

    @Override
    public Result update(Worker worker) {
        this.workerDao.save(worker);
        return new SuccessResult("Çalışan kaydı silindi");
    }
}
