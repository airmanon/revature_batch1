package com.syskan;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.util.Base64;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Starter {
	private static final SecureRandom random = new SecureRandom();

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		byte[] salt = new byte[16];
		random.nextBytes(salt);
		KeySpec spec = new PBEKeySpec("password".toCharArray(), salt, 65536, 128);
		SecretKeyFactory f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		byte[] hash = f.generateSecret(spec).getEncoded();
		Base64.Encoder enc = Base64.getEncoder();
		System.out.printf("salt: %s%n", enc.encodeToString(salt));
		System.out.printf("hash: %s%n", enc.encodeToString(hash));

	}

}
