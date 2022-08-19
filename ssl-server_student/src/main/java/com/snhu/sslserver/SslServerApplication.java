/*	
 * 	Ryan Laird
 *	SslServerApplication.java
 *  8/14/2022
 */

package com.snhu.sslserver;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}
//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";
@RestController
class SslServerController{ // modified from 5-1 checksum verification assignment
	public static byte[] getSHA(String n) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		return md.digest(n.getBytes(StandardCharsets.UTF_8));
	}
	
	public String bytesToHex(byte[] bytes) {
		StringBuilder hString = new StringBuilder();
		
		for (byte bString: bytes) {
			hString.append(String.format("%02x", bString));
		}
		return hString.toString();
	}
		
		
    @RequestMapping("/hash")
    public String myHash() throws NoSuchAlgorithmException{
    	String data = "Hello World!";
    	String name = "Ryan Laird";
    	MessageDigest md = MessageDigest.getInstance("SHA-256");
    	byte[] hash = md.digest(data.getBytes(StandardCharsets.UTF_8));
    	String checkSum = bytesToHex(hash);
    	
        return "<p>data: " + data + "</br></br> SHA-256 : " + checkSum + "</br></br> Name: " + name;
    }
    
    public static void main(String[] args) {
    	SpringApplication.run(SslServerApplication.class, args);
    }
}