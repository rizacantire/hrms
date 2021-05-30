package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.WorkService;
import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.dataAccess.abstracts.WorkDao;
import kodlamaio.hrms.entites.concretes.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class WorkManager implements WorkService {

    private WorkDao workDao;

    @Autowired
    public WorkManager(WorkDao workDao) {
        this.workDao = workDao;
    }


    @Override
    public DataResult<List<Work>>  getAll() {

        return new SuccessDataResult<List<Work>>(this.workDao.findAll(),"İş listesi getirildi");
    }


    @Override
    @Transactional
    public Result add(Work work) {

        if (this.workDao.findAllByName(work.getName()).stream().count() != 0) {
            return new ErrorResult("İş sistemde kayıtlı");
        } else {
            this.workDao.save(work);
            return new SuccessResult("İş Eklendi");
        }

    }

    @Override
    public Result delete(Work work) {
        this.workDao.delete(work);
        return new SuccessResult("İş silindi");
    }

    @Override
    public Result update(Work work) {
        if (this.workDao.findAllByName(work.getName()).stream().count() != 0) {
            return new ErrorResult("İş sistemde kayıtlı");
        } else {
            this.workDao.save(work);
            return new SuccessResult("İş Güncellendi");
        }
    }

    @Override
    public DataResult<Optional<Work>> getById(int id) {

        return new SuccessDataResult<Optional<Work>>(this.workDao.findById(id));
    }
}
