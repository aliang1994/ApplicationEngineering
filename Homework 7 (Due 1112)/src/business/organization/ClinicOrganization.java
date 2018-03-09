/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.ClinicRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Yizhe Liu
 */
public class ClinicOrganization extends Organization{
    private static int id = 1;
    public ClinicOrganization() {
        super(Type.Clinic.getValue() + id++);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ClinicRole());
        return roles;
    }
}
