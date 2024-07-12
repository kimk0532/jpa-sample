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
public class CodeItemId implements java.io.Serializable {
    private static final long serialVersionUID = -108298974020411887L;
    @Column(name = "project_uid", nullable = false, length = 20)
    private String projectUid;

    @Column(name = "locale_xd", nullable = false, length = 30)
    private String localeXd;

    @Column(name = "code_group_id", nullable = false, length = 100)
    private String codeGroupId;

    @Column(name = "code_xd", nullable = false, length = 100)
    private String codeXd;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CodeItemId entity = (CodeItemId) o;
        return Objects.equals(this.projectUid, entity.projectUid) &&
                Objects.equals(this.codeXd, entity.codeXd) &&
                Objects.equals(this.codeGroupId, entity.codeGroupId) &&
                Objects.equals(this.localeXd, entity.localeXd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectUid, codeXd, codeGroupId, localeXd);
    }

}