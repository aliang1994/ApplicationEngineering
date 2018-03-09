/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.state.State;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.clinic.ClinicWorkAreaJPanel;

/**
 *
 * @author Yizhe Liu
 */
public class ClinicRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem systemm, State state) {
        return new ClinicWorkAreaJPanel(userProcessContainer, account, enterprise, organization);
    }
    
}
