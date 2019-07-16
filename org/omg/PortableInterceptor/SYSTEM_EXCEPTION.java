package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/SYSTEM_EXCEPTION.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/openjdk-8-fPix8r/openjdk-8-8u212-b03/src/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Friday, April 26, 2019 2:04:44 AM UTC
*/

public interface SYSTEM_EXCEPTION
{

  /**
     * Indicates a SystemException reply status. One possible value for 
     * <code>RequestInfo.reply_status</code>.
     * @see RequestInfo#reply_status
     * @see SUCCESSFUL
     * @see USER_EXCEPTION
     * @see LOCATION_FORWARD
     * @see TRANSPORT_RETRY
     */
  public static final short value = (short)(1);
}