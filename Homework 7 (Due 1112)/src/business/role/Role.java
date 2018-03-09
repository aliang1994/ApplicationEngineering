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

/**
 *
 * @author Yizhe Liu
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        Clinic("Clinic");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business,
            State state);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
