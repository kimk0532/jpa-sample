package com.skcc.pims.sample.service;

import com.skcc.pims.model.Program;

import java.util.List;

public interface SampleService {

    List<Program> getPrograms(String projectNo);

    List<Program> getPrograms(String projectNo, String subProjectNo);

}
