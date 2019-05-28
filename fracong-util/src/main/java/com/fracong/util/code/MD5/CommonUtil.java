package com.fracong.util.code.MD5;

import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class CommonUtil {
	@SuppressWarnings("all")
    public static String encrypt(String plainText) {
        String result = "";
        try {
            DESKeySpec keySpec = new DESKeySpec("CampusHelper".getBytes("UTF8"));
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey key = keyFactory.generateSecret(keySpec);
            sun.misc.BASE64Encoder base64encoder = new sun.misc.BASE64Encoder();
            sun.misc.BASE64Decoder base64decoder = new sun.misc.BASE64Decoder();

            byte[] cleartext = plainText.getBytes("UTF8");

            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            result = base64encoder.encode(cipher.doFinal(cleartext));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
      //解密
    @SuppressWarnings({"all"})
    public static String decrypt(String encryptedPwd)
            throws Exception {
        String result = "";
        try {
            DESKeySpec keySpec = new DESKeySpec("CampusHelper".getBytes("UTF8"));
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey key = keyFactory.generateSecret(keySpec);
            sun.misc.BASE64Decoder base64decoder = new sun.misc.BASE64Decoder();
            byte[] encrypedPwdBytes = base64decoder.decodeBuffer(encryptedPwd);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] plainTextPwdBytes = (cipher.doFinal(encrypedPwdBytes));
            result = new String(plainTextPwdBytes);
        } catch (Exception e) {
            System.out.println("解密失败:"+encryptedPwd);
            result=againDecrypt(encryptedPwd);
        }
        return result;
    }

    @SuppressWarnings("all")
	public static String againDecrypt(String encryptedPwd)
            throws Exception {
        String result = "";
        try {
            encryptedPwd=URLDecoder.decode(encryptedPwd,"utf-8");
            DESKeySpec keySpec = new DESKeySpec("CampusHelper".getBytes("UTF8"));
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey key = keyFactory.generateSecret(keySpec);
            sun.misc.BASE64Decoder base64decoder = new sun.misc.BASE64Decoder();
            byte[] encrypedPwdBytes = base64decoder.decodeBuffer(encryptedPwd);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] file=cipher.doFinal(encrypedPwdBytes);
            byte[] plainTextPwdBytes = (file);
            result = new String(plainTextPwdBytes);
        } catch (Exception e) {
            System.out.println("重新解密失败:"+encryptedPwd);
        }
        return result;
    }


    public static String generateMD5(String plainText) {
        String result = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte[] digest = md.digest();
            StringBuffer sb = new StringBuffer();
            for (byte b : digest) {
                sb.append(Integer.toHexString(b & 0xff));
            }
            result = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {
        try {
            //System.out.println(decrypt(URLDecoder.decode("BrhT6ggt4%252BI%253D","utf-8")));
            //System.out.println(decrypt(URLDecoder.decode(URLDecoder.decode("BrhT6ggt4%252BI%253D","utf-8"))));
        //System.out.println(URLEncoder.encode(encrypt("41"), "utf-8"));
        //System.out.println(encrypt("41"));
//          long now = System.currentTimeMillis();
//          System.out.println(now);
//          now = now - now / 10000000000L * 10000000000L;
//          System.out.println(now);
                    System.out.println(decrypt("RHYcxhf0u6vzO5kSjCY/Fg=="));
            //System.out.println(encrypt("fc1314520"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
