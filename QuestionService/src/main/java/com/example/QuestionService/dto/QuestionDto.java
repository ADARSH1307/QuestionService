package com.example.QuestionService.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDto {
    @NotBlank(message = "Question ID is mandatory")
    private Long qid;

    @NotBlank(message = "Question details are mandatory")
    private String qdetails;

    @NotBlank(message = "Set ID is mandatory")
    private Long setid;

    @NotBlank(message = "Set name is mandatory")
    private String setname;

    @NotEmpty(message = "Answers list cannot be empty")
    private List<AnswersDto> answers;
}
