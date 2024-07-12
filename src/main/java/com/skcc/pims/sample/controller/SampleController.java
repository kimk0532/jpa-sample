package com.skcc.pims.sample.controller;

import com.skcc.pims.model.Program;
import com.skcc.pims.sample.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sample")
@RequiredArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @GetMapping("/jpa-test")
    public ResponseEntity<List<Program>> jpaTest() {
        List<Program> programs = sampleService.getPrograms("20240101-D001", "1");

        return ResponseEntity
                .ok(programs)
                ;
    }

    @GetMapping("/jpa-test2")
    public ResponseEntity<List<Program>> jpaTest2() {
        return ResponseEntity
                .ok(sampleService.getPrograms("20240101-D001"))
                ;
    }

}
