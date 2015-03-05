/*
 * Generated by XDoclet - Do not edit!
 */
package test.ejb.cmr;

/**
 * Data object for EmployeeAddress.
 * @xdoclet-generated at 16-04-05
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 1.2.3
 */
public class EmployeeAddressData
   extends java.lang.Object
   implements java.io.Serializable
{
   private java.lang.Integer id;
   private java.lang.String description;

  /* begin value object */
   private test.ejb.cmr.EmployeeAddressValue EmployeeAddressValue = null;

   public test.ejb.cmr.EmployeeAddressValue getEmployeeAddressValue()
   {
	  if( EmployeeAddressValue == null )
	  {
          EmployeeAddressValue = new test.ejb.cmr.EmployeeAddressValue();
	  }
      try
         {
            EmployeeAddressValue.setId( getId() );
            EmployeeAddressValue.setDescription( getDescription() );
                   }
         catch (Exception e)
         {
            throw new javax.ejb.EJBException(e);
         }

	  return EmployeeAddressValue;
   }

   public void setEmployeeAddressValue( test.ejb.cmr.EmployeeAddressValue valueHolder )
   {

	  try
	  {
		 setDescription( valueHolder.getDescription() );
	  }
	  catch (Exception e)
	  {
		 throw new javax.ejb.EJBException(e);
	  }
   }

  /* end value object */

   public EmployeeAddressData()
   {
   }

   public EmployeeAddressData( java.lang.Integer id,java.lang.String description )
   {
      setId(id);
      setDescription(description);
   }

   public EmployeeAddressData( EmployeeAddressData otherData )
   {
      setId(otherData.getId());
      setDescription(otherData.getDescription());

   }

   public java.lang.Integer getPrimaryKey() {
     return  getId();
   }

   public java.lang.Integer getId()
   {
      return this.id;
   }
   public void setId( java.lang.Integer id )
   {
      this.id = id;
   }

   public java.lang.String getDescription()
   {
      return this.description;
   }
   public void setDescription( java.lang.String description )
   {
      this.description = description;
   }

   public String toString()
   {
      StringBuffer str = new StringBuffer("{");

      str.append("id=" + getId() + " " + "description=" + getDescription());
      str.append('}');

      return(str.toString());
   }

   public boolean equals( Object pOther )
   {
      if( pOther instanceof EmployeeAddressData )
      {
         EmployeeAddressData lTest = (EmployeeAddressData) pOther;
         boolean lEquals = true;

         if( this.id == null )
         {
            lEquals = lEquals && ( lTest.id == null );
         }
         else
         {
            lEquals = lEquals && this.id.equals( lTest.id );
         }
         if( this.description == null )
         {
            lEquals = lEquals && ( lTest.description == null );
         }
         else
         {
            lEquals = lEquals && this.description.equals( lTest.description );
         }

         return lEquals;
      }
      else
      {
         return false;
      }
   }

   public int hashCode()
   {
      int result = 17;

      result = 37*result + ((this.id != null) ? this.id.hashCode() : 0);

      result = 37*result + ((this.description != null) ? this.description.hashCode() : 0);

      return result;
   }

}
