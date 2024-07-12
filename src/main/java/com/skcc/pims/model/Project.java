package com.skcc.pims.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb_pj_project")
@IdClass(ProjectId.class)
public class Project {
    @Id
    @Column(name = "project_no", nullable = false, length = 20)
    private String projectNo;

    @Id
    @Column(name = "sub_project_no", nullable = false, length = 10)
    private String subProjectNo;

    @Column(name = "project_name", length = 70)
    private String projectName;

    @Column(name = "manager_id", length = 20)
    private String managerId;

    @Column(name = "org_code", length = 5)
    private String orgCode;

    @Column(name = "project_end_yn", length = 1)
    private String projectEndYn;

    @Column(name = "start_dt", length = 10)
    private String startDt;

    @Column(name = "end_dt", length = 10)
    private String endDt;

    @Column(name = "dev_end_dt", length = 10)
    private String devEndDt;

    @Column(name = "open_dt", length = 10)
    private String openDt;

    @Column(name = "crtr_id", length = 20)
    private String crtrId;

    @Column(name = "upd_id", length = 20)
    private String updId;

    @Column(name = "del_yn", nullable = false, length = 1)
    private String delYn;

    @Column(name = "project_div_code", length = 10)
    private String projectDivCode;

    @Column(name = "slog_image_path", length = 100)
    private String slogImagePath;

    @Column(name = "theme_code", length = 3)
    private String themeCode;

    @Column(name = "project_ctmt", length = 500)
    private String projectCtmt;

    @Column(name = "crtr_dt")
    private Instant crtrDt;

    @Column(name = "upd_dt")
    private Instant updDt;

    @Column(name = "biz_type", length = 20)
    private String bizType;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "customer_co", length = 50)
    private String customerCo;

    @Column(name = "sub_project_order", precision = 2)
    private BigDecimal subProjectOrder;

    @Column(name = "mthd_seq")
    private Long mthdSeq;

    @Column(name = "fp_proposal", precision = 9, scale = 2)
    private BigDecimal fpProposal;

    @Column(name = "fp_contract", precision = 9, scale = 2)
    private BigDecimal fpContract;

    @Column(name = "fp_execute", precision = 9, scale = 2)
    private BigDecimal fpExecute;

    @Column(name = "fp_gm_analysis", precision = 5, scale = 2)
    private BigDecimal fpGmAnalysis;

    @Column(name = "fp_gm_design", precision = 5, scale = 2)
    private BigDecimal fpGmDesign;

    @Column(name = "fp_gm_realize", precision = 5, scale = 2)
    private BigDecimal fpGmRealize;

    @Column(name = "fp_gm_test", precision = 5, scale = 2)
    private BigDecimal fpGmTest;

    @Column(name = "fp_use_yn", length = Integer.MAX_VALUE)
    private String fpUseYn;

    @Column(name = "fp_gm_cd", length = 3)
    private String fpGmCd;

    @Column(name = "cost_yn", length = Integer.MAX_VALUE)
    private String costYn;

    @Column(name = "milestone_yn", length = Integer.MAX_VALUE)
    private String milestoneYn;

    @Column(name = "plan_dt", length = 10)
    private String planDt;

    @Column(name = "act_dt", length = 10)
    private String actDt;

    @Column(name = "close_dt", length = 10)
    private String closeDt;

    @Column(name = "week_start_dt", length = 10)
    private String weekStartDt;

    @Column(name = "week_end_dt", length = 10)
    private String weekEndDt;

    @Column(name = "week_base", length = Integer.MAX_VALUE)
    private String weekBase;

    @Column(name = "etc_dt", length = 10)
    private String etcDt;

    @Column(name = "sub_group_use_yn", length = 1)
    private String subGroupUseYn;

    @Column(name = "sub_group_code", length = 10)
    private String subGroupCode;

    @Column(name = "ts_board1", length = 100)
    private String tsBoard1;

    @Column(name = "ts_board2", length = 100)
    private String tsBoard2;

    @Column(name = "schedule_use_yn", length = Integer.MAX_VALUE)
    private String scheduleUseYn;

    @Column(name = "resource_plan_use_yn", length = Integer.MAX_VALUE)
    private String resourcePlanUseYn;

    @Column(name = "risk_use_yn", length = Integer.MAX_VALUE)
    private String riskUseYn;

    @Column(name = "issue_use_yn", length = Integer.MAX_VALUE)
    private String issueUseYn;

    @Column(name = "action_item_use_yn", length = Integer.MAX_VALUE)
    private String actionItemUseYn;

    @Column(name = "chg_use_yn", length = Integer.MAX_VALUE)
    private String chgUseYn;

    @Column(name = "project_cd_use_yn", length = Integer.MAX_VALUE)
    private String projectCdUseYn;

    @Column(name = "sub_project_code", length = 5)
    private String subProjectCode;

    @Column(name = "detail_code_use_yn", length = Integer.MAX_VALUE)
    private String detailCodeUseYn;

    @Column(name = "detail_methodology_cd", length = 100)
    private String detailMethodologyCd;

    @Column(name = "biz_form", length = 10)
    private String bizForm;

    @Column(name = "dev_method_type", length = 10)
    private String devMethodType;

    @Column(name = "scale_cd", length = 10)
    private String scaleCd;

    @Column(name = "similar_project", length = 100)
    private String similarProject;

    @Column(name = "milestone_check_use_yn", length = 10)
    private String milestoneCheckUseYn;

    @Column(name = "etc1", length = 1000)
    private String etc1;

    @Column(name = "etc2", length = 1000)
    private String etc2;

    @Column(name = "etc3", length = 1000)
    private String etc3;

    @Column(name = "etc4", length = 1000)
    private String etc4;

    @Column(name = "etc5", length = 1000)
    private String etc5;

    @Column(name = "emphasis_cd", length = 10)
    private String emphasisCd;

    @Column(name = "project_desc", length = 1000)
    private String projectDesc;

    @Column(name = "project_type", length = 10)
    private String projectType;

    @Column(name = "charger_qa", length = 100)
    private String chargerQa;

    @Column(name = "is_use_system1", length = 1)
    private String isUseSystem1;

    @Column(name = "is_use_system2", length = 1)
    private String isUseSystem2;

    @Column(name = "is_use_system3", length = 1)
    private String isUseSystem3;

    @Column(name = "act_phase_cd", length = 10)
    private String actPhaseCd;

    @Column(name = "act_phase_upd_dt")
    private Instant actPhaseUpdDt;

    @Column(name = "act_phase_upd_id", length = 10)
    private String actPhaseUpdId;

    @Column(name = "milestone_check_use_yn2", length = 100)
    private String milestoneCheckUseYn2;

    @Column(name = "milestone_check_use_yn_form2", length = 10)
    private String milestoneCheckUseYnForm2;

    @Column(name = "milestone_check_use_yn_form3", length = 10)
    private String milestoneCheckUseYnForm3;

    @Column(name = "us_use_system4", length = 10)
    private String usUseSystem4;

    @Column(name = "milestone_check_use_yn_cascading", length = 10)
    private String milestoneCheckUseYnCascading;

    @Column(name = "is_use_system4", length = 100)
    private String isUseSystem4;

    @Column(name = "if_cd", length = 100)
    private String ifCd;

    @Column(name = "is_use_system5", length = 1)
    private String isUseSystem5;

    @Column(name = "is_use_system6", length = 1)
    private String isUseSystem6;

    @Column(name = "risk_first", precision = 5, scale = 2)
    private BigDecimal riskFirst;

    @Column(name = "risk_second", precision = 5, scale = 2)
    private BigDecimal riskSecond;

    @Column(name = "ratio_yn", length = 1)
    private String ratioYn;

    @Column(name = "idrt_yn", length = 1)
    private String idrtYn;

    @Column(name = "project_status", length = 10)
    private String projectStatus;

    @Column(name = "is_use_service0", length = 10)
    private String isUseService0;

    @Column(name = "is_use_service1", length = 10)
    private String isUseService1;

    @Column(name = "is_use_service2", length = 10)
    private String isUseService2;

    @Column(name = "is_use_service3", length = 10)
    private String isUseService3;

    @Column(name = "is_use_service4", length = 10)
    private String isUseService4;

    @Column(name = "time_yn", length = Integer.MAX_VALUE)
    private String timeYn;

    @Column(name = "plan_week_base", length = Integer.MAX_VALUE)
    private String planWeekBase;

    @Column(name = "inspection_yn", length = 1)
    private String inspectionYn;

    @Column(name = "tms_link_yn", length = Integer.MAX_VALUE)
    private String tmsLinkYn;

    @Column(name = "qms_link_yn", length = 1)
    private String qmsLinkYn;

    @Column(name = "sp_uid", length = 20)
    private String spUid;

    @Column(name = "agile_sub_project_no", length = 20)
    private String agileSubProjectNo;

    @Column(name = "agile_link_yn", length = Integer.MAX_VALUE)
    private String agileLinkYn;

    @Column(name = "products_id_code", length = 100)
    private String productsIdCode;

    @Column(name = "phase_use_yn", length = 1)
    private String phaseUseYn;

    @Column(name = "tms_table_del_yn", length = 1)
    private String tmsTableDelYn;

    @Column(name = "qms_table_del_yn", length = 1)
    private String qmsTableDelYn;

    @Column(name = "is_manual_prog", length = 1)
    private String isManualProg;

}