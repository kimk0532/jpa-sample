package com.skcc.pims.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class CodeGroupId implements java.io.Serializable {
    private static final long serialVersionUID = 6369690355276095658L;
    @Column(name = "project_uid", nullable = false, length = 20)
    private String projectUid;

    @Column(name = "code_group_id", nullable = false, length = 100)
    private String codeGroupId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CodeGroupId entity = (CodeGroupId) o;
        return Objects.equals(this.projectUid, entity.projectUid) &&
                Objects.equals(this.codeGroupId, entity.codeGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectUid, codeGroupId);
    }

}