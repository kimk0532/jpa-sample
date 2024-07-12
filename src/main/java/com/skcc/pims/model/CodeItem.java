package com.skcc.pims.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "tc_code_item")
@IdClass(CodeItemId.class)
public class CodeItem {
    @Id
    @Column(name = "project_uid", nullable = false, length = 20)
    private String projectUid;

    @Id
    @Column(name = "locale_xd", nullable = false, length = 30)
    private String localeXd;

    @Id
    @Column(name = "code_group_id", nullable = false, length = 100)
    private String codeGroupId;

    @Id
    @Column(name = "code_xd", nullable = false, length = 100)
    private String codeXd;

    @Column(name = "code_name", nullable = false, length = 256)
    private String codeName;

    @Column(name = "code_short_name", length = 128)
    private String codeShortName;

    @Column(name = "display_index", precision = 10)
    private BigDecimal displayIndex;

    @Column(name = "use_able_flag_xd", length = 30)
    private String useAbleFlagXd;

    @Column(name = "attr_value01", length = 1024)
    private String attrValue01;

    @Column(name = "attr_value11", length = 1024)
    private String attrValue11;

    @Column(name = "attr_value02", length = 1024)
    private String attrValue02;

    @Column(name = "attr_value12", length = 1024)
    private String attrValue12;

    @Column(name = "attr_value13", length = 1024)
    private String attrValue13;

    @Column(name = "attr_value03", length = 1024)
    private String attrValue03;

    @Column(name = "attr_value05", length = 1024)
    private String attrValue05;

    @Column(name = "attr_value15", length = 1024)
    private String attrValue15;

    @Column(name = "attr_value06", length = 1024)
    private String attrValue06;

    @Column(name = "attr_value16", length = 1024)
    private String attrValue16;

    @Column(name = "attr_value17", length = 1024)
    private String attrValue17;

    @Column(name = "attr_value07", length = 1024)
    private String attrValue07;

    @Column(name = "attr_value18", length = 1024)
    private String attrValue18;

    @Column(name = "attr_value08", length = 1024)
    private String attrValue08;

    @Column(name = "attr_value19", length = 1024)
    private String attrValue19;

    @Column(name = "attr_value09", length = 1024)
    private String attrValue09;

    @Column(name = "attr_value10", length = 1024)
    private String attrValue10;

    @Column(name = "attr_value20", length = 1024)
    private String attrValue20;

    @Column(name = "use_from_date", length = 8)
    private String useFromDate;

    @Column(name = "use_to_date", length = 8)
    private String useToDate;

    @Column(name = "attr_value04", length = 1024)
    private String attrValue04;

    @Column(name = "attr_value14", length = 1024)
    private String attrValue14;

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