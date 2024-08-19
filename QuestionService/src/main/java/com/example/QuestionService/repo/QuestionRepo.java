package com.example.QuestionService.repo;

import com.example.QuestionService.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface QuestionRepo extends JpaRepository<Question,Long> {

    Optional<Object> findByQidAndSetid(Long questionid, Long setid);

    List<Question> findBySetid(Long setid);

    List<Question> findBySetname(String setname);
    //void deleteByQidAndSetname(String qid, String setname);
}
