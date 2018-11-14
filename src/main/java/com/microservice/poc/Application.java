package com.microservice.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		String toUpper = "I327DocumentID,I551DocumentID,I571DocumentID,I766DocumentID,CertOfCitDocumentID,NatrOfCertDocumentID,\n" +
				"    MacReadI551DocumentID,TempI551DocumentID,I94DocumentID,I94UnexpForeignPassportDocumentID,UnexpForeignPassportDocumentID,\n" +
				"    I20DocumentID,DS2019DocumentID,OtherCase1DocumentID,OtherCase2DocumentID";


		System.out.println(toUpper.toUpperCase());

	}
}
