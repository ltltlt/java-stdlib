package org.omg.CosNaming.NamingContextExtPackage;


/**
* org/omg/CosNaming/NamingContextExtPackage/InvalidAddress.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/openjdk-8-fPix8r/openjdk-8-8u212-b03/src/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Friday, April 26, 2019 2:04:44 AM UTC
*/

public final class InvalidAddress extends org.omg.CORBA.UserException
{

  public InvalidAddress ()
  {
    super(InvalidAddressHelper.id());
  } // ctor


  public InvalidAddress (String $reason)
  {
    super(InvalidAddressHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidAddress
