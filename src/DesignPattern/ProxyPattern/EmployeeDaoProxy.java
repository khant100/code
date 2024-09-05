
package DesignPattern.ProxyPattern;
public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDao employeeDao;
    EmployeeDaoProxy(){
        employeeDao=new EmployeeDaoImpl();
    }
    @Override
    public void create(String client, EmployeeDo obj) throws Exception {

        if(client.equals("ADMIN")){
            employeeDao.create(client,obj);
            return;
        }
        throw new Exception("Access Denined");
    }

    @Override
    public void deleate(String client, String employeeId) throws Exception {
        if(client.equals("ADMIN")){
            employeeDao.deleate(client,employeeId);
            return;
        }
        throw new Exception("Access Denined");
    }

    @Override
    public EmployeeDo get(String client, String employeeId) throws Exception {


        if(client.equals("ADMIN")){
            employeeDao.get(client,employeeId);
            return null;
        }
        throw new Exception("Access Denined");
    }
}
