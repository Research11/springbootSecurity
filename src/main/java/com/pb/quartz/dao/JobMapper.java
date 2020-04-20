package com.pb.quartz.dao;



import java.util.List;

import com.pb.common.config.MyMapper;
import com.pb.quartz.domain.Job;

public interface JobMapper extends MyMapper<Job> {

	List<Job> queryList();
}