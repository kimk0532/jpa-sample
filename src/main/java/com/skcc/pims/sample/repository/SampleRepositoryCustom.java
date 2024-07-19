package com.skcc.pims.sample.repository;

import com.skcc.pims.sample.dto.result.ProgramResultDto;
import com.skcc.pims.model.Program;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SampleRepositoryCustom {

    List<ProgramResultDto> findByProjectNo(String projectNo);

    Page<Program> searchPageSimple(String projectNo, Pageable pageable);
    Page<Program> searchPageComplex(String projectNo, Pageable pageable);

}
