/*
 * Generated by XDoclet - Do not edit!
 */
package test.interfaces;

/**
 * Home interface for AllTypesEntity.
 * @xdoclet-generated at 16-04-05
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 1.2.3
 */
public interface AllTypesEntityHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/AllTypesEntity";
   public static final String JNDI_NAME="test/AllTypesEntity";

   public test.interfaces.AllTypesEntity create(boolean aBoolean , byte aByte , short aShort , char aChar , int anInt)
      throws javax.ejb.CreateException,java.rmi.RemoteException;

   public test.interfaces.AllTypesEntity findByPrimaryKey(test.interfaces.AllTypesEntityPK pk)
      throws javax.ejb.FinderException,java.rmi.RemoteException;

}
