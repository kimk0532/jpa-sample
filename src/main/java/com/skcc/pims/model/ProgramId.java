package com.skcc.pims.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class ProgramId implements Serializable {
    private static final long serialVersionUID = 1922126976342229843L;
    @Column(name = "project_no", nullable = false, length = 20)
    private String projectNo;

    @Column(name = "sub_project_no", nullable = false, length = 10)
    private String subProjectNo;

    @Column(name = "program_uid", nullable = false, length = 100)
    private String programUid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProgramId entity = (ProgramId) o;
        return Objects.equals(this.projectNo, entity.projectNo) &&
                Objects.equals(this.subProjectNo, entity.subProjectNo) &&
                Objects.equals(this.programUid, entity.programUid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectNo, subProjectNo, programUid);
    }

}