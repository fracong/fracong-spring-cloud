package com.fracong.util.code.morse;

public class Fence {
    /*加密部分*/
    @SuppressWarnings("static-access")
	public String encryption (String password){
        String p = new String();
        String p1 = new String();
        String p2 = new String();
        for    (int i = 0; i < password.length(); i++){
            if(i%2 == 0)
                p1 += p.valueOf(password.charAt(i));
            else
                p2 += p.valueOf(password.charAt(i)); 
        }
        return p1+p2;
    }
    
    /*解密部分*/
    @SuppressWarnings("static-access")
	public String decode(String FencePassword){
        String password = new String();
        String p = new String();
        String p1 = FencePassword.substring(0, FencePassword.length()/2);
        String p2 = FencePassword.substring(FencePassword.length()/2);
        int i;
        for    (i = 0; i < p1.length(); i++){
            password += p.valueOf(p1.charAt(i)) + p.valueOf(p2.charAt(i));
        }
        if(FencePassword.length()%2 != 0)
            password += p.valueOf(p2.charAt(i));
        return password;
    }
}
