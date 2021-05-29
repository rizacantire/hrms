package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entites.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;
    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao) {
        this.jobSeekerDao = jobSeekerDao;
    }

    @Override
    public List<JobSeeker> getAll() {
        return null;
    }

    @Override
    public void register(JobSeeker jobSeeker) {
        this.jobSeekerDao.save(jobSeeker);

    }

    @Override
    public void delete(JobSeeker jobSeeker) {
        this.jobSeekerDao.delete(jobSeeker);
    }

    @Override
    public void update(JobSeeker jobSeeker) {
        this.jobSeekerDao.save(jobSeeker);
    }
}
