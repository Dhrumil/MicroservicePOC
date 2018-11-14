package com.microservice.poc.utility;

public class TestClass {

    static String toUpper = "I327DocumentID,I551DocumentID,I571DocumentID,I766DocumentID,CertOfCitDocumentID,NatrOfCertDocumentID,\n" +
            "    MacReadI551DocumentID,TempI551DocumentID,I94DocumentID,I94UnexpForeignPassportDocumentID,UnexpForeignPassportDocumentID,\n" +
            "    I20DocumentID,DS2019DocumentID,OtherCase1DocumentID,OtherCase2DocumentID";

    public static void main(String args[]) {
        System.out.println(toUpper.toUpperCase());
    }
}
