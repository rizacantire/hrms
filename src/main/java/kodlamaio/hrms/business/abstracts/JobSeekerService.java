package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.*;
import kodlamaio.hrms.entites.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {
    DataResult<List<JobSeeker>> getAll();

    Result register(JobSeeker jobSeeker);
    Result delete(JobSeeker jobSeeker);
    Result update(JobSeeker jobSeeker);

}
