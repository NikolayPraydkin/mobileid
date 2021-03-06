/**
 * GetMobileAuthenticateStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.codeborne.security.digidoc_v2;

public class GetMobileAuthenticateStatusResponse  extends com.codeborne.security.digidoc_v2.AbstractGetStatusResponseType  implements java.io.Serializable {
    /* Personal Identity Code of the user. The value is fetched 
     * from “Serial Number” field of the certificate */
    private java.lang.String userIDCode;

    /* First name of the user. The value is fetched from “G” 
     * (given name) field of the certificate */
    private java.lang.String userGivenname;

    /* Last name of the user. The value is fetched from “SN” 
     * (surname) field of the certificate */
    private java.lang.String userSurname;

    /* Country of the origin in ISO 3166 2-character style. The 
     * value is fetched from “C” (country) field of the certificate */
    private java.lang.String userCountry;

    /* „Common Name“ of the certificate holder. The value is 
     * fetched from “CN” (common name) field of the certificate */
    private java.lang.String userCN;

    /* User’s certificate in BASE64 coding. Returned if 
     * parameter ReturnCertData was set 'TRUE' in the query. */
    private byte[] certificateData;

    /* OCSP response in BASE64 coding. Returned if 
     *                             parameter ReturnRevocationData was set
     * 'TRUE' in the query */
    private byte[] revocationData;

    public GetMobileAuthenticateStatusResponse() {
    }

    public GetMobileAuthenticateStatusResponse(
           com.codeborne.security.digidoc_v2.ProcessStatusType status,
           byte[] signature,
           java.lang.String userIDCode,
           java.lang.String userGivenname,
           java.lang.String userSurname,
           java.lang.String userCountry,
           java.lang.String userCN,
           byte[] certificateData,
           byte[] revocationData) {
        super(
            status,
            signature);
        this.userIDCode = userIDCode;
        this.userGivenname = userGivenname;
        this.userSurname = userSurname;
        this.userCountry = userCountry;
        this.userCN = userCN;
        this.certificateData = certificateData;
        this.revocationData = revocationData;
    }


    /**
     * Gets the userIDCode value for this GetMobileAuthenticateStatusResponse.
     * 
     * @return userIDCode   * Personal Identity Code of the user. The value is fetched 
     * from “Serial Number” field of the certificate
     */
    public java.lang.String getUserIDCode() {
        return userIDCode;
    }


    /**
     * Sets the userIDCode value for this GetMobileAuthenticateStatusResponse.
     * 
     * @param userIDCode   * Personal Identity Code of the user. The value is fetched 
     * from “Serial Number” field of the certificate
     */
    public void setUserIDCode(java.lang.String userIDCode) {
        this.userIDCode = userIDCode;
    }


    /**
     * Gets the userGivenname value for this GetMobileAuthenticateStatusResponse.
     * 
     * @return userGivenname   * First name of the user. The value is fetched from “G” 
     * (given name) field of the certificate
     */
    public java.lang.String getUserGivenname() {
        return userGivenname;
    }


    /**
     * Sets the userGivenname value for this GetMobileAuthenticateStatusResponse.
     * 
     * @param userGivenname   * First name of the user. The value is fetched from “G” 
     * (given name) field of the certificate
     */
    public void setUserGivenname(java.lang.String userGivenname) {
        this.userGivenname = userGivenname;
    }


    /**
     * Gets the userSurname value for this GetMobileAuthenticateStatusResponse.
     * 
     * @return userSurname   * Last name of the user. The value is fetched from “SN” 
     * (surname) field of the certificate
     */
    public java.lang.String getUserSurname() {
        return userSurname;
    }


    /**
     * Sets the userSurname value for this GetMobileAuthenticateStatusResponse.
     * 
     * @param userSurname   * Last name of the user. The value is fetched from “SN” 
     * (surname) field of the certificate
     */
    public void setUserSurname(java.lang.String userSurname) {
        this.userSurname = userSurname;
    }


    /**
     * Gets the userCountry value for this GetMobileAuthenticateStatusResponse.
     * 
     * @return userCountry   * Country of the origin in ISO 3166 2-character style. The 
     * value is fetched from “C” (country) field of the certificate
     */
    public java.lang.String getUserCountry() {
        return userCountry;
    }


    /**
     * Sets the userCountry value for this GetMobileAuthenticateStatusResponse.
     * 
     * @param userCountry   * Country of the origin in ISO 3166 2-character style. The 
     * value is fetched from “C” (country) field of the certificate
     */
    public void setUserCountry(java.lang.String userCountry) {
        this.userCountry = userCountry;
    }


    /**
     * Gets the userCN value for this GetMobileAuthenticateStatusResponse.
     * 
     * @return userCN   * „Common Name“ of the certificate holder. The value is 
     * fetched from “CN” (common name) field of the certificate
     */
    public java.lang.String getUserCN() {
        return userCN;
    }


    /**
     * Sets the userCN value for this GetMobileAuthenticateStatusResponse.
     * 
     * @param userCN   * „Common Name“ of the certificate holder. The value is 
     * fetched from “CN” (common name) field of the certificate
     */
    public void setUserCN(java.lang.String userCN) {
        this.userCN = userCN;
    }


    /**
     * Gets the certificateData value for this GetMobileAuthenticateStatusResponse.
     * 
     * @return certificateData   * User’s certificate in BASE64 coding. Returned if 
     * parameter ReturnCertData was set 'TRUE' in the query.
     */
    public byte[] getCertificateData() {
        return certificateData;
    }


    /**
     * Sets the certificateData value for this GetMobileAuthenticateStatusResponse.
     * 
     * @param certificateData   * User’s certificate in BASE64 coding. Returned if 
     * parameter ReturnCertData was set 'TRUE' in the query.
     */
    public void setCertificateData(byte[] certificateData) {
        this.certificateData = certificateData;
    }


    /**
     * Gets the revocationData value for this GetMobileAuthenticateStatusResponse.
     * 
     * @return revocationData   * OCSP response in BASE64 coding. Returned if 
     *                             parameter ReturnRevocationData was set
     * 'TRUE' in the query
     */
    public byte[] getRevocationData() {
        return revocationData;
    }


    /**
     * Sets the revocationData value for this GetMobileAuthenticateStatusResponse.
     * 
     * @param revocationData   * OCSP response in BASE64 coding. Returned if 
     *                             parameter ReturnRevocationData was set
     * 'TRUE' in the query
     */
    public void setRevocationData(byte[] revocationData) {
        this.revocationData = revocationData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMobileAuthenticateStatusResponse)) return false;
        GetMobileAuthenticateStatusResponse other = (GetMobileAuthenticateStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userIDCode==null && other.getUserIDCode()==null) || 
             (this.userIDCode!=null &&
              this.userIDCode.equals(other.getUserIDCode()))) &&
            ((this.userGivenname==null && other.getUserGivenname()==null) || 
             (this.userGivenname!=null &&
              this.userGivenname.equals(other.getUserGivenname()))) &&
            ((this.userSurname==null && other.getUserSurname()==null) || 
             (this.userSurname!=null &&
              this.userSurname.equals(other.getUserSurname()))) &&
            ((this.userCountry==null && other.getUserCountry()==null) || 
             (this.userCountry!=null &&
              this.userCountry.equals(other.getUserCountry()))) &&
            ((this.userCN==null && other.getUserCN()==null) || 
             (this.userCN!=null &&
              this.userCN.equals(other.getUserCN()))) &&
            ((this.certificateData==null && other.getCertificateData()==null) || 
             (this.certificateData!=null &&
              java.util.Arrays.equals(this.certificateData, other.getCertificateData()))) &&
            ((this.revocationData==null && other.getRevocationData()==null) || 
             (this.revocationData!=null &&
              java.util.Arrays.equals(this.revocationData, other.getRevocationData())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getUserIDCode() != null) {
            _hashCode += getUserIDCode().hashCode();
        }
        if (getUserGivenname() != null) {
            _hashCode += getUserGivenname().hashCode();
        }
        if (getUserSurname() != null) {
            _hashCode += getUserSurname().hashCode();
        }
        if (getUserCountry() != null) {
            _hashCode += getUserCountry().hashCode();
        }
        if (getUserCN() != null) {
            _hashCode += getUserCN().hashCode();
        }
        if (getCertificateData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertificateData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertificateData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevocationData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevocationData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevocationData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMobileAuthenticateStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sk.ee/DigiDocService/DigiDocService_2_3.wsdl", ">GetMobileAuthenticateStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIDCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserIDCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userGivenname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserGivenname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSurname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserSurname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserCN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CertificateData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revocationData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RevocationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
