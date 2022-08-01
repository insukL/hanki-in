package com.hankiin.hankiin.User.entity;

import com.hankiin.hankiin.etc.entity.BaseEntity;
import com.hankiin.hankiin.etc.enums.School;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@SQLDelete(sql = "UPDATE user SET is_deleted = 1 WHERE id=?")
@Where(clause = "is_deleted = 0")
@Table(name = "user")
public class UserEntity extends BaseEntity {
    @Basic
    @Column(name = "account", nullable = false)
    private String account;

    @Basic
    @Column(name = "password", nullable = false)
    private String password;

    @Basic
    @Column(name = "semester", nullable = false)
    @ColumnDefault("1")
    private short semester;

    @Basic
    @Column(name = "is_semester_off", nullable = false)
    private boolean isSemesterOff = false;

    @Enumerated(EnumType.STRING)
    @Column(name = "school")
    private School school;

    @Basic
    @Column(name = "answer_point")
    @ColumnDefault("0")
    private int answerPoint = 0;
}
