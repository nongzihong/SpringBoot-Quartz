package com.ealen.dao;

import com.ealen.entity.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JobEntityRepository extends JpaRepository<JobEntity, Long> {

    JobEntity getById(Integer id);

}
