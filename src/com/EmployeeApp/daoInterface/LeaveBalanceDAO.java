package com.EmployeeApp.daoInterface;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.EmployeeApp.model.EmployeeLeaveBalancePOJO;
import com.EmployeeApp.model.LeaveDisplayAdminPOJO;
import com.EmployeeApp.model.LeaveDisplayEmployeePOJO;

public interface LeaveBalanceDAO {
	
	public List<EmployeeLeaveBalancePOJO> listEmployeeLeaveBalance(int employeeId);
	
	public int applyLeave(String leaveType, int employeeId, ArrayList<Date> applyLeaveDates);
	
	public List<LeaveDisplayAdminPOJO>  getAppliedLeave(int start, int limit);
	
	public int getTotalCount();
	
	public List<LeaveDisplayEmployeePOJO> getAppliedLeave(int start, int limit, int employeeId);
	
	public int getTotalCount(int employeeId);
	
	public int acceptLeave(int employeeId, String leaveType, Date date);
	
	public int rejectLeave(int employeeId, String leaveType, Date date);
	
	public int addLeaveBalanceDetail(int employeeId);

	public int deleteEmployeeLeaveDetail(int employeeId);

}
