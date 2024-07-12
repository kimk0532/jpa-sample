package com.skcc.pims.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "tb_pj_program_list")
@IdClass(ProgramId.class)
public class Program implements Serializable {

    @Id
    @Column(name = "project_no", nullable = false, length = 20)
    private String projectNo;

    @Id
    @Column(name = "sub_project_no", nullable = false, length = 10)
    private String subProjectNo;

    @Id
    @Column(name = "program_uid", nullable = false, length = 100)
    private String programUid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "project_no", referencedColumnName = "project_no", nullable = false, insertable = false, updatable = false),
            @JoinColumn(name = "sub_project_no", referencedColumnName = "sub_project_no", nullable = false, insertable = false, updatable = false)
    })
    private Project project;

//    @OneToOne(fetch = FetchType.EAGER, optional = false)
//    @JoinColumns({
//            @JoinColumn(name = "project_no", referencedColumnName = "project_uid", insertable = false, updatable = false),
//            @JoinColumn(name = "program_div", referencedColumnName = "code_xd", insertable = false, updatable = false),
//            @JoinColumn(name = "'CG_PJGUBUN'", referencedColumnName = "locale_xd", insertable = false, updatable = false)
//    })
//    private CodeItem gubunCodeItem;

    @Column(name = "program_div", length = 30)
    private String programDiv;

    @Column(name = "difficulty_div", length = 3)
    private String difficultyDiv;

    @Column(name = "regist_type_div", length = 3)
    private String registTypeDiv;

    @Column(name = "link_code", length = 10)
    private String linkCode;

    @Column(name = "program_id", length = 100)
    private String programId;

    @Column(name = "program_name", length = 1000)
    private String programName;

    @Column(name = "charger_id", length = 20)
    private String chargerId;

    @Column(name = "plan_start_dt", length = 10)
    private String planStartDt;

    @Column(name = "plan_end_dt", length = 10)
    private String planEndDt;

    @Column(name = "plan_progress_rate")
    private Double planProgressRate;

    @Column(name = "real_start_dt", length = 10)
    private String realStartDt;

    @Column(name = "real_end_dt", length = 10)
    private String realEndDt;

    @Column(name = "real_progress_rate")
    private Double realProgressRate;

    @Column(name = "progress_state_code", length = 3)
    private String progressStateCode;

    @Column(name = "program_content", length = 1000)
    private String programContent;

    @Column(name = "modify_content", length = 1000)
    private String modifyContent;

    @Column(name = "charger_pl_id", length = 20)
    private String chargerPlId;

    @Column(name = "pl_plan_start_dt", length = 10)
    private String plPlanStartDt;

    @Column(name = "pl_plan_end_dt", length = 10)
    private String plPlanEndDt;

    @Column(name = "pl_confirm_div", length = Integer.MAX_VALUE)
    private String plConfirmDiv;

    @Column(name = "pl_real_start_dt", length = 10)
    private String plRealStartDt;

    @Column(name = "pl_real_end_dt", length = 10)
    private String plRealEndDt;

    @Column(name = "pl_approval_content", length = 1000)
    private String plApprovalContent;

    @Column(name = "test_charger_id", length = 20)
    private String testChargerId;

    @Column(name = "test_plan_start_dt", length = 10)
    private String testPlanStartDt;

    @Column(name = "test_plan_end_dt", length = 10)
    private String testPlanEndDt;

    @Column(name = "test_confirm_div", length = Integer.MAX_VALUE)
    private String testConfirmDiv;

    @Column(name = "test_real_start_dt", length = 10)
    private String testRealStartDt;

    @Column(name = "test_real_end_dt", length = 10)
    private String testRealEndDt;

    @Column(name = "customer_charger_id", length = 20)
    private String customerChargerId;

    @Column(name = "customer_plan_start_dt", length = 10)
    private String customerPlanStartDt;

    @Column(name = "customer_plan_end_dt", length = 10)
    private String customerPlanEndDt;

    @Column(name = "customer_real_start_dt", length = 10)
    private String customerRealStartDt;

    @Column(name = "customer_real_end_dt", length = 10)
    private String customerRealEndDt;

    @Column(name = "process_id", length = 1000)
    private String processId;

    @Column(name = "process_name", length = 1000)
    private String processName;

    @Column(name = "request_item_id", length = 10)
    private String requestItemId;

    @Column(name = "inspection_yn", length = Integer.MAX_VALUE)
    private String inspectionYn;

    @Column(name = "remark", length = 1000)
    private String remark;

    @Column(name = "crtr_dt")
    private OffsetDateTime crtrDt;

    @Column(name = "crtr_id", length = 20)
    private String crtrId;

    @Column(name = "upd_dt")
    private OffsetDateTime updDt;

    @Column(name = "upd_id", length = 20)
    private String updId;

    @Column(name = "customer_confirm_div", length = 10)
    private String customerConfirmDiv;

    @Column(name = "approval_real_start_dt", length = 10)
    private String approvalRealStartDt;

    @Column(name = "approval_real_end_dt", length = 10)
    private String approvalRealEndDt;

    @Column(name = "approval_result_progress_rate")
    private Double approvalResultProgressRate;

    @Column(name = "approval_yn", length = 1)
    private String approvalYn;

    @Column(name = "pl_cmt", length = 1000)
    private String plCmt;

    @Column(name = "test_cmt", length = 1000)
    private String testCmt;

    @Column(name = "cust_cmt", length = 1000)
    private String custCmt;

    @Column(name = "approval_tab_id", precision = 2)
    private BigDecimal approvalTabId;

    @Column(name = "pl_work_dt")
    private Instant plWorkDt;

    @Column(name = "test_work_dt")
    private Instant testWorkDt;

    @Column(name = "cust_work_dt")
    private Instant custWorkDt;

    @Column(name = "proc_id", length = 100)
    private String procId;

    @Column(name = "proc_name", length = 1000)
    private String procName;

    @Column(name = "req_id", length = 1000)
    private String reqId;

    @Column(name = "file_name", length = 256)
    private String fileName;

    @Column(name = "work_dt")
    private Instant workDt;

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

    @Column(name = "etc6", length = 1000)
    private String etc6;

    @Column(name = "etc7", length = 1000)
    private String etc7;

    @Column(name = "etc8", length = 1000)
    private String etc8;

    @Column(name = "weighty_cd", length = 3)
    private String weightyCd;

    @Column(name = "l1", length = 1000)
    private String l1;

    @Column(name = "l2", length = 1000)
    private String l2;

    @Column(name = "l3", length = 1000)
    private String l3;

    @Column(name = "l4", length = 1000)
    private String l4;

    @Column(name = "l5", length = 1000)
    private String l5;

    @Column(name = "l6", length = 1000)
    private String l6;

    @Column(name = "l7", length = 1000)
    private String l7;

    @Column(name = "l8", length = 1000)
    private String l8;

    @Column(name = "l9", length = 1000)
    private String l9;

    @Column(name = "l0", length = 1000)
    private String l0;

    @Column(name = "ui_id", length = 100)
    private String uiId;

    @Column(name = "etc9", length = 1000)
    private String etc9;

    @Column(name = "etc10", length = 1000)
    private String etc10;

    @Column(name = "etc11", length = 1000)
    private String etc11;

    @Column(name = "etc12", length = 1000)
    private String etc12;

    @Column(name = "etc13", length = 1000)
    private String etc13;

    @Column(name = "etc14", length = 1000)
    private String etc14;

    @Column(name = "etc15", length = 1000)
    private String etc15;

    @Column(name = "etc16", length = 1000)
    private String etc16;

    @Column(name = "etc17", length = 1000)
    private String etc17;

    @Column(name = "etc18", length = 1000)
    private String etc18;

    @Column(name = "etc19", length = 1000)
    private String etc19;

    @Column(name = "etc20", length = 1000)
    private String etc20;

    @Column(name = "pre_pgm_id", length = 1000)
    private String prePgmId;

    @Column(name = "program_explan", length = 5000)
    private String programExplan;

    @Column(name = "change_content", length = 5000)
    private String changeContent;

    @Column(name = "change_dt", length = 10)
    private String changeDt;

    @Column(name = "source_code", length = 500)
    private String sourceCode;

    @Column(name = "return_comment", length = Integer.MAX_VALUE)
    private String returnComment;

}