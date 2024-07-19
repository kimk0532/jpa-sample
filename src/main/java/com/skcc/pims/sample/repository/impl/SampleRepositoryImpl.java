package com.skcc.pims.sample.repository.impl;

import com.querydsl.core.QueryResults;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.skcc.pims.model.Program;
import com.skcc.pims.model.QCodeItem;
import com.skcc.pims.sample.dto.result.ProgramResultDto;
import com.skcc.pims.sample.dto.result.QProgramResultDto;
import com.skcc.pims.sample.repository.SampleRepositoryCustom;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.skcc.pims.model.QProgram.program;
import static org.springframework.util.StringUtils.*;

@Repository
@RequiredArgsConstructor
public class SampleRepositoryImpl implements SampleRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<ProgramResultDto> findByProjectNo(String projectNo) {

        QCodeItem programDivCodeItem = new QCodeItem("programDivCodeItem");
        QCodeItem difficultyDivCodeItem = new QCodeItem("difficultyDivCodeItem");
        QCodeItem weightyCdCodeItem = new QCodeItem("weightyCdCodeItem");

        return jpaQueryFactory
                .select(new QProgramResultDto(
                        program.projectNo,
                        program.programUid,
                        program.subProjectNo,
                        program.difficultyDiv,
                        difficultyDivCodeItem.codeName.as("difficultyDivName")
                        )
                )
                .from(program)
                .leftJoin(program.project)
                .leftJoin(programDivCodeItem)
                .on(
                        program.projectNo.eq(programDivCodeItem.projectUid),
                        program.programDiv.eq(programDivCodeItem.codeXd),
                        programDivCodeItem.codeGroupId.eq("CG_PJGUBUN"),
                        programDivCodeItem.localeXd.eq("ko_KR"),
                        programDivCodeItem.useYn.eq("Y")
                )
                .leftJoin(difficultyDivCodeItem)
                .on(
                        program.projectNo.eq(difficultyDivCodeItem.projectUid),
                        program.difficultyDiv.eq(difficultyDivCodeItem.codeXd),
                        difficultyDivCodeItem.codeGroupId.eq("CG_PJDEGREE_C_P"),
                        difficultyDivCodeItem.localeXd.eq("ko_KR"),
                        difficultyDivCodeItem.useYn.eq("Y")
                )
                .leftJoin(programDivCodeItem)
                .on(
                        program.projectNo.eq(programDivCodeItem.projectUid),
                        program.programDiv.eq(programDivCodeItem.codeXd),
                        programDivCodeItem.codeGroupId.eq("CG_PJGUBUN"),
                        programDivCodeItem.localeXd.eq("ko_KR"),
                        programDivCodeItem.useYn.eq("Y")
                )
                .leftJoin(weightyCdCodeItem)
                .on(
                        program.projectNo.eq(weightyCdCodeItem.projectUid),
                        program.programDiv.eq(weightyCdCodeItem.codeXd),
                        weightyCdCodeItem.codeGroupId.eq("CG_IMPORTANCE_C_P"),
                        weightyCdCodeItem.localeXd.eq("ko_KR"),
                        weightyCdCodeItem.useYn.eq("Y")
                )
                .where(
                        program.projectNo.eq(projectNo),
                        program.project.delYn.eq("N"),
                        program.registTypeDiv.ne("003"),
                        program.realProgressRate.in(0, 50, 80),
                        projectNoEq(projectNo)
                )
                .orderBy(program.programUid.asc())
                .fetch()
                ;
    }

    @Override
    public Page<Program> searchPageSimple(String projectNo, Pageable pageable) {

        QCodeItem programDivCodeItem = new QCodeItem("programDivCodeItem");
        QCodeItem difficultyDivCodeItem = new QCodeItem("difficultyDivCodeItem");
        QCodeItem weightyCdCodeItem = new QCodeItem("weightyCdCodeItem");

        QueryResults<Program> results = jpaQueryFactory
                .selectFrom(program)
                .leftJoin(program.project).fetchJoin()
                .leftJoin(programDivCodeItem).fetchJoin()
                .on(
                        program.projectNo.eq(programDivCodeItem.projectUid),
                        program.programDiv.eq(programDivCodeItem.codeXd),
                        programDivCodeItem.codeGroupId.eq("CG_PJGUBUN"),
                        programDivCodeItem.localeXd.eq("ko_KR"),
                        programDivCodeItem.useYn.eq("Y")
                )
                .where(
                        program.projectNo.eq(projectNo),
                        program.project.delYn.eq("N"),
                        program.registTypeDiv.ne("003"),
                        program.realProgressRate.in(0, 50, 80)
                )
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .fetchResults();
        /**
         * fetchResults() : deprecated 됨,
         */

        List<Program> programResults = results.getResults();
        long total = results.getTotal();

        return new PageImpl<>(programResults, pageable, total);

    }

    @Override
    public Page<Program> searchPageComplex(String projectNo, Pageable pageable) {
        return null;
    }


    /**
     * 재사용가능!! 같은조건의 다른쿼리 작성할때 그대로 사용가능
     * 함수명에 조건이 들어가므로 가독성 증가
     * 이 함수들이 where절에 들어가면됨
     * 여러 condition을 and로 묶어서 리턴 가능
     */
    private BooleanExpression projectNoEq(String projectNo) {
        return hasText(projectNo) ? program.projectNo.eq(projectNo) : null;
    }


    /**
     * DTO
     * 조회
     * - 조회조건
     * - 조회결과
     * 입력/수정/삭제
     * - Request
     * - Response : 성공/실패
     */
}
