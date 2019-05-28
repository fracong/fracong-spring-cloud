package com.fracong.util.code.MD5;

import java.security.MessageDigest;
import java.util.Random;

public class MoreUtil {
	/**
	 * 加盐MD5
	 *
	 * @param password
	 * @return
	 * @author daniel
	 * @time 2016-6-11 下午8:45:04
	 */
	public static String generateMD5(String password) {
		Random r = new Random();
		StringBuilder sb = new StringBuilder(16);
		sb.append(r.nextInt(99999999)).append(r.nextInt(99999999));
		int len = sb.length();
		if (len < 16) {
			for (int i = 0; i < 16 - len; i++) {
				sb.append("0");
			}
		}
		String salt = sb.toString();
		password = md5Hex(password + salt);
		char[] cs = new char[48];
		for (int i = 0; i < 48; i += 3) {
			cs[i] = password.charAt(i / 3 * 2);
			char c = salt.charAt(i / 3);
			cs[i + 1] = c;
			cs[i + 2] = password.charAt(i / 3 * 2 + 1);
		}
		return new String(cs);
	}

	/**
	 * 校验加盐后是否和原文一致
	 *
	 * @param str
	 * @param md5
	 * @return
	 * @author daniel
	 * @time 2016-6-11 下午8:45:39
	 */
	public static boolean verify(String str, String md5) {
		char[] cs1 = new char[32];
		char[] cs2 = new char[16];
		for (int i = 0; i < 48; i += 3) {
			cs1[i / 3 * 2] = md5.charAt(i);
			cs1[i / 3 * 2 + 1] = md5.charAt(i + 2);
			cs2[i / 3] = md5.charAt(i + 1);
		}
		String salt = new String(cs2);
		return md5Hex(str + salt).equals(new String(cs1));
	}

	/**
	 * 获取十六进制字符串形式的MD5摘要
	 */
	private static String md5Hex(String src) {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			byte[] bs = md5.digest(src.getBytes());
			return new String(hexEncode(bs));
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 字节流转成十六进制表示
	 */
	public static String hexEncode(byte[] src) {
		String strHex;
		StringBuilder sb = new StringBuilder();
		for (int n = 0; n < src.length; n++) {
			strHex = Integer.toHexString(src[n] & 0xFF);
			sb.append((strHex.length() == 1) ? "0" + strHex : strHex); // 每个字节由两个字符表示，位数不够，高位补0
		}
		return sb.toString().trim();
	}

	public static void main(String args[]) {
		String passwordStr = "12312asdasldkjaos123.qwe";
		String md5Value = MoreUtil.generateMD5(passwordStr);
		System.out.println("加盐后MD5：" + md5Value);
		System.out.println("是否是同一字符串:" + MoreUtil.verify(passwordStr, md5Value));
		System.out.println("-----------------------------------------------------------");
		// 加盐后每次生成的MD5值
		String[] strMd5s = new String[] { "a9556ba9472047e31db83799351423a5695d38f408e25071",
				"117a45d88c1e44f62991eb73056563d0822bf74697c60236", "19d74050e75b07197bb0cf1b278a4bd87f5a77a086435176",
				"c6bd57739652f66430626a41144a49a9342058b12813635f" };
		for (String strMd5 : strMd5s) {
			System.out.println("是否是同一字符串:" + MoreUtil.verify(passwordStr, strMd5));
		}
	}
}
