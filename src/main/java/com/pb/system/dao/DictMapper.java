package com.pb.system.dao;



import java.util.List;

import com.pb.common.config.MyMapper;
import com.pb.system.domain.Dict;

public interface DictMapper extends MyMapper<Dict> {

    List<Dict> findDictByFieldName(String fieldName);

    Dict findDictByFieldNameAndKeyy(String fieldName, String keyy);
}