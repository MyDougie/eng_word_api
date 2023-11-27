package com.eng.word.vo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class WordVO {

    private String kor_word;

    private String eng_word;
}
