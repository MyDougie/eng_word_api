package com.eng.word.service;

import com.eng.word.mapper.EngWordMapper;
import com.eng.word.vo.EngWordVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EngWordService {

    private final EngWordMapper engWordMapper;

    public List<EngWordVO> getAllEngWordList() {
        return engWordMapper.getAllEngWordList();
    }

    public EngWordVO getEngWordById(Long id) {
        return engWordMapper.getEngWordById(id);
    }


    // 필요에 따라 추가적인 메서드 구현 가능
}