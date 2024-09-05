package DesignPattern.ProxyPattern;
public interface EmployeeDao {

public void create(String client, EmployeeDo obj) throws Exception;
public void deleate(String client, String employeeId) throws Exception;

public EmployeeDo get(String client, String employeeId) throws Exception;
}
