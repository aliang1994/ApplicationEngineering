/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Yizhe Liu
 */
public class ProvidorEnterprise extends Enterprise {
    
    public ProvidorEnterprise(String name) {
        super(name, EnterpriseType.Providor);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
