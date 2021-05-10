package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entites.concretes.JobSeeker;
import org.springframework.stereotype.Service;

import java.util.List;

public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;

    public JobSeekerManager(JobSeekerDao jobSeekerDao) {
        this.jobSeekerDao = jobSeekerDao;
    }

    @Override
    public List<JobSeeker> getAll() {
        return null;
    }

    @Override
    public void add(JobSeeker jobSeeker) {

    }

    @Override
    public void delete(JobSeeker jobSeeker) {

    }

    @Override
    public void update(JobSeeker jobSeeker) {

    }
}
