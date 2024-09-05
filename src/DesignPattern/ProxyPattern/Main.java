package DesignPattern.ProxyPattern;

public class Main {
    public static void main(String[] args) {
       EmployeeDo employeeDo = new EmployeeDo("user","ab1234");


        try {
            EmployeeDaoProxy employeeDaoProxy = new EmployeeDaoProxy();
            employeeDaoProxy.create("USER",employeeDo);
            System.out.println("Operation Done");

        } catch (Exception e) {
            System.out.println("Excetpoin : "+e.getMessage());
        }



    }
}