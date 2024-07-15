package com.skcc.pims.sample.repository;

import com.skcc.pims.model.Program;

import java.util.List;

public interface SampleCustomRepository {

    List<Program> findByProjectNo(String projectNo);

}
