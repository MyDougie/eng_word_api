package com.eng.word.vo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EngWordVO {

    private Long id;
    private String eng_word;
    private String meaning;
    private String pronunciation;
    private String part_of_speech;
    private String example_sentence;
    private Integer difficulty_level;
    private String created_by;
    private String created_dt;
    private String modified_by;
    private String modified_dt;


    // Getters and setters
}