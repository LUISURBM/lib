/*
 * Generated by XDoclet - Do not edit!
 */
package test.ejb.cmr;

/**
 * CMP layer for City.
 * @xdoclet-generated at 16-04-05
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 1.2.3
 */
public abstract class CityCMP
   extends test.ejb.cmr.CityBean
   implements javax.ejb.EntityBean
{

   public test.ejb.cmr.CityData getData()
   {
      test.ejb.cmr.CityData dataHolder = null;
      try
      {
         dataHolder = new test.ejb.cmr.CityData();

         dataHolder.setCityId( getCityId() );
         dataHolder.setCountryIdFk( getCountryIdFk() );
         dataHolder.setName( getName() );

      }
      catch (RuntimeException e)
      {
         throw new javax.ejb.EJBException(e);
      }

      return dataHolder;
   }

   public void ejbLoad() 
   {
      super.ejbLoad();
   }

   public void ejbStore() 
   {
         super.ejbStore();
   }

   public void ejbActivate() 
   {
      super.ejbActivate();
   }

   public void ejbPassivate() 
   {
      super.ejbPassivate();

   }

   public void setEntityContext(javax.ejb.EntityContext ctx) 
   {
      super.setEntityContext(ctx);
   }

   public void unsetEntityContext() 
   {
      super.unsetEntityContext();
   }

   public void ejbRemove() throws javax.ejb.RemoveException
   {
      super.ejbRemove();

   }

 /* Value Objects BEGIN */

/* Value Objects END */

   public abstract java.lang.Integer getCityId() ;

   public abstract void setCityId( java.lang.Integer cityId ) ;

   public abstract java.lang.Integer getCountryIdFk() ;

   public abstract void setCountryIdFk( java.lang.Integer countryIdFk ) ;

   public abstract java.lang.String getName() ;

   public abstract void setName( java.lang.String name ) ;

}
