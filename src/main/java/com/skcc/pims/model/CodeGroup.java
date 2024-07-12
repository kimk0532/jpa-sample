package com.skcc.pims.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "tc_code_group")
@IdClass(CodeGroupId.class)
public class CodeGroup {
    @Id
    @Column(name = "project_uid", nullable = false, length = 20)
    private String projectUid;

    @Id
    @Column(name = "code_group_id", nullable = false, length = 100)
    private String codeGroupId;

    @Column(name = "code_group_name", nullable = false, length = 256)
    private String codeGroupName;

    @Column(name = "sys_yn", length = 1)
    private String sysYn;

    @Column(name = "biz_group_xd", length = 30)
    private String bizGroupXd;

    @Column(name = "insert_able_flag_xd", length = 30)
    private String insertAbleFlagXd;

    @Column(name = "code_data_type_xd", length = 30)
    private String codeDataTypeXd;

    @Column(name = "in_min_length", precision = 19)
    private BigDecimal inMinLength;

    @Column(name = "in_max_length", precision = 19)
    private BigDecimal inMaxLength;

    @Column(name = "code_format", length = 128)
    private String codeFormat;

    @Column(name = "in_limit_method_xd", length = 30)
    private String inLimitMethodXd;

    @Column(name = "in_limit_logic", length = 2048)
    private String inLimitLogic;

    @Column(name = "cache_method_xd", length = 30)
    private String cacheMethodXd;

    @Column(name = "code_group_eng_name", length = 256)
    private String codeGroupEngName;

    @Column(name = "biz_subgroup_xd", length = 30)
    private String bizSubgroupXd;

    @Column(name = "type1", length = 1000)
    private String type1;

    @Column(name = "type2", length = 1000)
    private String type2;

    @Column(name = "type3", length = 1000)
    private String type3;

    @Column(name = "use_yn", length = 1)
    private String useYn;

    @Column(name = "up_yn", length = 1)
    private String upYn;

}