package com.skcc.pims.sample.dto.result;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProgramResultDto {

    private String projectNo;
    private String programUid;
    private String subProjectNo;

    private String difficultyDiv;
    private String difficultyDivCodeName;

    @QueryProjection
    public ProgramResultDto(String projectNo, String programUid, String subProjectNo, String difficultyDiv, String difficultyDivCodeName) {
        this.projectNo = projectNo;
        this.programUid = programUid;
        this.subProjectNo = subProjectNo;
        this.difficultyDiv = difficultyDiv;
        this.difficultyDivCodeName = difficultyDivCodeName;
    }

}
