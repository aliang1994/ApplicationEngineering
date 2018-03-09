/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.employee.Employee;
import business.role.SystemAdminRole;
import business.useraccount.UserAccount;

/**
 *
 * @author Yizhe Liu
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();
        Supplier supplier = Supplier.getInstance();
        system.setSupplier(supplier);

        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        Employee employee = system.getEmployeeDirectory().createEmployee("Leo");

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sa", "sa", employee, new SystemAdminRole());

        Disease disease = new Disease();
        disease.setDiseaseName("D1");
        system.getSupplier().getDiseaseList().add(disease);

        Vaccine vaccine = new Vaccine();
        vaccine.setDisease(disease);
        vaccine.setVaccineName("V1");
        system.getSupplier().getVaccineList().add(vaccine);

        Disease disease1 = new Disease();
        disease1.setDiseaseName("D2");
        system.getSupplier().getDiseaseList().add(disease1);

        Vaccine vaccine1 = new Vaccine();
        vaccine1.setDisease(disease1);
        vaccine1.setVaccineName("V2");
        system.getSupplier().getVaccineList().add(vaccine1);

        return system;
    }
}
