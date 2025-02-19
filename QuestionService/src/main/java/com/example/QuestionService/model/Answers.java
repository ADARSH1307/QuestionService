package com.example.QuestionService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Answers {
    @Id
    private Long answerid;
    private String answer;
    private String suggestion;
  //  private String qid;
}
