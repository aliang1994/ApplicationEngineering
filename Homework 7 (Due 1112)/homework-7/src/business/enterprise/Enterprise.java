/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.organization.Organization;
import business.organization.OrganizationDirectory;

/**
 *
 * @author Yizhe Liu
 */
public abstract class Enterprise extends Organization {
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private int enterpriseV1Quantity;
    private int enterpriseV2Quantity;

    public int getEnterpriseV1Quantity() {
        return enterpriseV1Quantity;
    }
    public void setEnterpriseV1Quantity(int enterpriseV1Quantity) {
        this.enterpriseV1Quantity = enterpriseV1Quantity;
    }

    public int getEnterpriseV2Quantity() {
        return enterpriseV2Quantity;
    }
    public void setEnterpriseV2Quantity(int enterpriseV2Quantity) {
        this.enterpriseV2Quantity = enterpriseV2Quantity;
    }

    
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
    
    public enum EnterpriseType{
        StateLevelProvidor("StateLevelProvidor"),Providor("Providor");
        
        private String value;

        private EnterpriseType(String value) {
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

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
}
