/*
 * Generated by XDoclet - Do not edit!
 */
package test.ejb.cmr;

/**
 * Local interface for EmployeeAddress.
 * @xdoclet-generated at 16-04-05
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 1.2.3
 */
public interface EmployeeAddressLocal
   extends javax.ejb.EJBLocalObject
{

   public java.lang.Integer getId(  ) ;

   public java.lang.String getDescription(  ) ;

   public void setDescription( java.lang.String description ) ;

   public test.ejb.cmr.EmployeeAddressValue getEmployeeAddressValue(  ) ;

   public void setEmployeeAddressValue( test.ejb.cmr.EmployeeAddressValue value ) ;

}
