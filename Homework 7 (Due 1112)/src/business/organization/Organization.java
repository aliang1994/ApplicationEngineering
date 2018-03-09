/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.employee.EmployeeDirectory;
import business.role.Role;
import business.useraccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Yizhe Liu
 */
public abstract class Organization {
    private String name;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 1;
    private int organizationV1Quantity;
    private int organizationV2Quantity;

    public int getOrganizationV1Quantity() {
        return organizationV1Quantity;
    }
    public void setOrganizationV1Quantity(int organizationV1Quantity) {
        this.organizationV1Quantity = organizationV1Quantity;
    }

    public int getOrganizationV2Quantity() {
        return organizationV2Quantity;
    }
    public void setOrganizationV2Quantity(int organizationV2Quantity) {
        this.organizationV2Quantity = organizationV2Quantity;
    }
    
    public enum Type{
        Admin("Admin Organization"), Clinic("Clinic Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return name;
    }
}
