package com.skcc.pims.sample.service;

import com.skcc.pims.model.Program;
import com.skcc.pims.sample.dto.result.ProgramResultDto;

import java.util.List;

public interface SampleService {

    List<ProgramResultDto> getPrograms(String projectNo);

    List<Program> getPrograms(String projectNo, String subProjectNo);

}
