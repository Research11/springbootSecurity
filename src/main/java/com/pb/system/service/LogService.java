package com.pb.system.service;



import java.util.List;

import com.pb.common.service.IService;
import com.pb.system.domain.SysLog;

public interface LogService extends IService<SysLog> {
	
	List<SysLog> findAllLogs(SysLog log);
	
	void deleteLogs(String logIds);
}
