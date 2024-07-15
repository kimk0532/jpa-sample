package com.skcc.pims.sample.repository.impl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.skcc.pims.model.Program;
import com.skcc.pims.model.QProgram;
import com.skcc.pims.sample.repository.SampleCustomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.skcc.pims.model.QCodeItem.codeItem;
import static com.skcc.pims.model.QProgram.program;

@Repository
@RequiredArgsConstructor
public class SampleCustomRepositoryImpl implements SampleCustomRepository {

    private final JPAQueryFactory jpaQueryFactory;

    // create queryDsl query


    @Override
    public List<Program> findByProjectNo(String projectNo) {
        return jpaQueryFactory
                .selectFrom(program)
                .leftJoin(program.project).fetchJoin()
                .leftJoin(codeItem).fetchJoin()
                .on(
                        program.projectNo.eq(codeItem.projectUid),
                        program.programDiv.eq(codeItem.codeXd),
                        codeItem.codeGroupId.eq("CG_PJGUBUN"),
                        codeItem.localeXd.eq("ko_KR"),
                        codeItem.useYn.eq("Y")
                )
                .where(
                        program.projectNo.eq(projectNo),
                        program.project.delYn.eq("N"),
                        program.registTypeDiv.ne("003"),
                        program.realProgressRate.in(0, 50, 80)
                )
                .orderBy(program.programUid.asc())
                .fetch()
                ;
    }
}
