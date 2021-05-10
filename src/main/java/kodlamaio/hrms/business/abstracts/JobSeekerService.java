package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entites.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {
    List<JobSeeker> getAll();

    void add(JobSeeker jobSeeker);
    void delete(JobSeeker jobSeeker);
    void update(JobSeeker jobSeeker);

}
