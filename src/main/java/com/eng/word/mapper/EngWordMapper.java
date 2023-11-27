package com.eng.word.mapper;

import com.eng.word.vo.EngWordVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EngWordMapper {
    
    List<EngWordVO> getAllEngWordList();

    EngWordVO getEngWordById(@Param("id") Long id);
    
}