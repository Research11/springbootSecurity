package com.pb.quartz.service;

import java.util.List;

import com.pb.common.service.IService;
import com.pb.quartz.domain.JobLog;

public interface JobLogService extends IService<JobLog>{

	List<JobLog> findAllJobLogs(JobLog jobLog);

	void saveJobLog(JobLog log);

	void deleteBatch(String jobLogIds);
}
