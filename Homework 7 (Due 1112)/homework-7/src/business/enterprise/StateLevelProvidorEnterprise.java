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
public class StateLevelProvidorEnterprise extends Enterprise{
     public StateLevelProvidorEnterprise(String name){
        super(name, Enterprise.EnterpriseType.StateLevelProvidor);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
