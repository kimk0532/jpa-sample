package com.skcc.pims.sample.repository;

import com.skcc.pims.model.Program;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SampleRepository extends JpaRepository<Program, String>, SampleRepositoryCustom {

//    List<Program> findByProjectNo(String projectNo);

    List<Program> findByProjectNoAndSubProjectNo(String projectNo, String subProjectNo);

}