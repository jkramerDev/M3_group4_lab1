package tree;

public interface OrgChart {
	public void addRoot(Employee e); 
		// if there is no orgchart, start it
	
	
	public void clear();
		// get rid of the org chart
	
	public void addDirectReport(Employee manager, Employee newPerson);
		// add the newPerson as a direct report (child) of manager
	
	public void removeEmployee(Employee firedPerson);
		// remove the employee, give their direct reports to their supervisor
	
	public void showOrgChartDepthFirst(); 
	
	public void showOrgChartBreadthFirst();
	

}
