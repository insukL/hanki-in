package com.hankiin.hankiin.Question.entity;

import com.hankiin.hankiin.User.entity.UserEntity;
import com.hankiin.hankiin.etc.entity.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "question")
public class QuestionEntity extends BaseEntity {
    @Basic
    @Column(name = "title", nullable = false)
    private String title;

    @Basic
    @Column(name = "content", nullable = false)
    private String content;

    @Basic
    @Column(name = "choice_answer")
    private int choiceAnswer;

    @OneToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "writer_id")
    private UserEntity writer;
}
