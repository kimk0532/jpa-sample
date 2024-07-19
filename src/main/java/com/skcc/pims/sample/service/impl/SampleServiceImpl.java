package com.skcc.pims.sample.service.impl;

import com.skcc.pims.model.Program;
import com.skcc.pims.sample.dto.result.ProgramResultDto;
import com.skcc.pims.sample.repository.SampleRepository;
import com.skcc.pims.sample.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SampleServiceImpl implements SampleService {

    private final SampleRepository sampleRepository;

    @Override
    @Transactional
    public List<ProgramResultDto> getPrograms(String projectNo) {
        return sampleRepository.findByProjectNo(projectNo);
    }

    @Override
    @Transactional
    public List<Program> getPrograms(String projectNo, String subProjectNo) {
        return sampleRepository.findByProjectNoAndSubProjectNo(projectNo, subProjectNo);
    }

}
