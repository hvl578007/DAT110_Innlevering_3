package no.hvl.dat110.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash { 
	
	private static BigInteger hashint; 
	
	public static BigInteger hashOf(String entity) {		
		
		// Task: Hash a given string using MD5 and return the result as a BigInteger.
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		// we use MD5 with 128 bits digest
		byte[] entityByte = entity.getBytes();

		// compute the hash of the input 'entity'
		byte[] digest = md.digest(entityByte);
		
		// convert the hash into hex format
		String hex = toHex(digest);

		// convert the hex into BigInteger
		hashint = new BigInteger(hex, 16);
		
		// return the BigInteger
		
		return hashint;
	}
	
	public static BigInteger addressSize() {
		
		// Task: compute the address size of MD5
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		// get the digest length
		int lengde = md.getDigestLength();
		
		// compute the number of bits = digest length * 8
		int bits = lengde * 8;
		
		// compute the address size = 2 ^ number of bits
		BigInteger adrStr = BigInteger.valueOf(2).pow(bits);

		// return the address size
		
		return adrStr;
	}
	
	public static int bitSize() {
		
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		// get the digest length
		int digestlen = md.getDigestLength();
		
		// find the digest length
		
		return digestlen*8;
	}
	
	public static String toHex(byte[] digest) {
		StringBuilder strbuilder = new StringBuilder();
		for(byte b : digest) {
			strbuilder.append(String.format("%02x", b&0xff));
		}
		return strbuilder.toString();
	}

}
