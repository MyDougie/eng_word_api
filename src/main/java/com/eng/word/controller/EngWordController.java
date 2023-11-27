package com.eng.word.controller;

import com.eng.word.service.EngWordService;
import com.eng.word.vo.EngWordVO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/eng-words")
public class EngWordController {

    private final EngWordService engWordService;a

    @GetMapping("/list")
    public List<EngWordVO> getAllEngWords() {
        return engWordService.getAllEngWordList();
    }

    @PostMapping("/{id}")
    public EngWordVO getEngWordById(@PathVariable Long id) {
        return engWordService.getEngWordById(id);
    }

}