package com.hankiin.hankiin.Question.repository;

import com.hankiin.hankiin.Question.entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<QuestionEntity, Integer> {
    public List<QuestionEntity> findByWriter(Integer id);
}
