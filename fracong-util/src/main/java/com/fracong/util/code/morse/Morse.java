package com.fracong.util.code.morse;

import java.util.StringTokenizer;

public class Morse {
	/*摩斯密码与字符之间的匹配常量*/
	static final String A = ".-";
	static final String B = "---.";
	static final String C = "-.-.";
    static final String D = "-..";
    static final String E = ".";
    static final String F = "..-.";
    static final String G = "--.";
    static final String H = "....";
    static final String I = "..";
    static final String J = ".---";
    static final String K = "-.-";
    static final String L = ".-..";
    static final String M = "--";
    static final String N = "-.";
    static final String O = "---";
    static final String P = ".--.";
    static final String Q = "--.-";
    static final String R = ".-.";
    static final String S = "...";
    static final String T = "-";
    static final String U = "..-";
    static final String V = "...-";
    static final String W = ".--";
    static final String X = "-..-";
    static final String Y = "-.--";
    static final String Z = "--..";
    static final String $0 = "-----";
    static final String $1 = ".----";
    static final String $2 = "..---";
    static final String $3 = "...--";
    static final String $4 = "....-";
    static final String $5 = ".....";
    static final String $6 = "-....";
    static final String $7 = "--...";
    static final String $8 = "---..";
    static final String $9 = "----.";
    static final String period = ".-.-.-"; // .
    static final String colon = "---..."; // :
    static final String comma = "--..--"; // ,
    static final String semicolon = "-.-.-."; // ;
    static final String question = "..--.."; // ?
    static final String equal = "-...-"; // =
    static final String doubleQuotation = ".-..-.";// "
    static final String singleQuotation = ".----.";// '
    static final String slash = "-..-."; ///
    static final String exclamation = "-.-.--"; // !
    static final String hyphen = "-....-"; // -
    static final String underscore = "..--.-"; // _
    static final String lroundBrackets = "-.--."; // (
    static final String rroundBrackets = "-.--.-"; // )
    static final String $ = "...-..-"; // $
    static final String ampersand = ".-..."; // &
    static final String at = ".--.-."; // @
    static final String plus = ".-.-."; // +
    /*加密对应的匹配*/
    public static String matching(String str) {
    	String returnStr = " ";
        switch (str) {
        case "A":
        	returnStr = A;
            break;
        case "B":
        	returnStr = B;
            break;
        case "C":
        	returnStr = C;
            break;
        case "D":
            returnStr = D;
            break;
        case "E":
            returnStr = E;
            break;
        case "F":
            returnStr = F;
            break;
        case "G":
        	returnStr = G;
            break;
        case "H":
        	returnStr = H;
            break;
        case "I":
        	returnStr = I;
            break;
        case "J":
        	returnStr = J;
            break;
        case "K":
        	returnStr = K;
            break;
        case "L":
        	returnStr = L;
            break;
        case "M":
        	returnStr = M;
            break;
        case "N":
        	returnStr = N;
            break;
        case "O":
            returnStr = O;
            break;
        case "P":
            returnStr = P;
            break;
        case "Q":
            returnStr = Q;
            break;
        case "R":
            returnStr = R;
            break;
        case "S":
            returnStr = S;
            break;
        case "T":
            returnStr = T;
            break;
        case "U":
            returnStr = U;
            break;
        case "V":
            returnStr = V;
            break;
        case "W":
            returnStr = W;
            break;
        case "X":
            returnStr = X;
            break;
        case "Y":
            returnStr = Y;
            break;
        case "Z":
            returnStr = Z;
            break;
        case "0":
            returnStr = $0;
            break;
        case "1":
            returnStr = $1;
            break;
        case "2":
            returnStr = $2;
            break;
        case "3":
            returnStr = $3;
            break;
        case "4":
            returnStr = $4;
            break;
        case "5":
            returnStr = $5;
            break;
        case "6":
            returnStr = $6;
            break;
        case "7":
            returnStr = $7;
            break;
        case "8":
            returnStr = $8;
            break;
        case "9":
            returnStr = $9;
            break;
        case ".":
            returnStr = period;
            break;
        case ":":
            returnStr = colon;
            break;
        case ",":
            returnStr = comma;
            break;
        case ";":
            returnStr = semicolon;
            break;
        case "?":
            returnStr = question;
            break;
        case "=":
            returnStr = equal;
            break;
        case "\"":
            returnStr = doubleQuotation;
            break;
        case "\'":
            returnStr = singleQuotation;
            break;
        case "/":
            returnStr = slash;
            break;
        case "!":
            returnStr = exclamation;
            break;
        case "-":
            returnStr = hyphen;
            break;
        case "_":
            returnStr = underscore;
            break;
        case "(":
            returnStr = lroundBrackets;
            break;
        case ")":
            returnStr = rroundBrackets;
            break;
        case "$":
            returnStr = $;
            break;
        case "&":
            returnStr = ampersand;
            break;
        case "@":
            returnStr = at;
            break;
        case "+":
            returnStr = plus;
            break;
        }
        return returnStr;
    }
    /*摩斯加密*/
    @SuppressWarnings("static-access")
	public static String encryption(String password) {
        Fence f = new Fence();
        password = f.encryption(password);
        password = f.encryption(password);
        String MorsePasswork = new String();
        String mp = new String();
        for (int i = 0; i < password.length(); i++) {
            mp = mp.valueOf(password.charAt(i));
            mp = mp.toUpperCase();
            MorsePasswork += matching(mp) + "/";
        }
        return MorsePasswork;
    }
    /*解密对应换的匹配*/
    public static String matching2(String str) {
        if (str.equals(A))
            return "A";
        else if (str.equals(B))
            return "B";
        else if (str.equals(C))
            return "C";
        else if (str.equals(D))
            return "D";
        else if (str.equals(E))
            return "E";
        else if (str.equals(F))
            return "F";
        else if (str.equals(G))
            return "G";
        else if (str.equals(H))
            return "H";
        else if (str.equals(I))
            return "I";
        else if (str.equals(J))
            return "J";
        else if (str.equals(K))
            return "K";
        else if (str.equals(L))
            return "L";
        else if (str.equals(M))
            return "M";
        else if (str.equals(N))
            return "N";
        else if (str.equals(O))
            return "O";
        else if (str.equals(P))
            return "P";
        else if (str.equals(Q))
            return "Q";
        else if (str.equals(R))
            return "R";
        else if (str.equals(S))
            return "S";
        else if (str.equals(T))
            return "T";
        else if (str.equals(U))
            return "U";
        else if (str.equals(V))
            return "V";
        else if (str.equals(W))
            return "W";
        else if (str.equals(X))
            return "X";
        else if (str.equals(Y))
            return "Y";
        else if (str.equals(Z))
            return "Z";
        else if (str.equals($0))
            return "0";
        else if (str.equals($1))
            return "1";
        else if (str.equals($2))
            return "2";
        else if (str.equals($3))
            return "3";
        else if (str.equals($4))
            return "4";
        else if (str.equals($5))
            return "5";
        else if (str.equals($6))
            return "6";
        else if (str.equals($7))
            return "7";
        else if (str.equals($8))
            return "8";
        else if (str.equals($9))
            return "9";
        else if (str.equals(period))
            return ".";
        else if (str.equals(colon))
            return ":";
        else if (str.equals(comma))
            return ",";
        else if (str.equals(semicolon))
            return ";";
        else if (str.equals(question))
            return "?";
        else if (str.equals(equal))
            return "=";
        else if (str.equals(doubleQuotation))
            return "\"";
        else if (str.equals(singleQuotation))
            return "\'";
        else if (str.equals(slash))
            return "/";
        else if (str.equals(exclamation))
            return "!";
        else if (str.equals(hyphen))
            return "-";
        else if (str.equals(underscore))
            return "_";
        else if (str.equals(lroundBrackets))
            return "(";
        else if (str.equals(rroundBrackets))
            return ")";
        else if (str.equals($))
            return "$";
        else if (str.equals(ampersand))
            return "&";
        else if (str.equals(at))
            return "@";
        else if (str.equals(plus))
            return "+";
        else
            return " ";
    }
    /*摩斯解密*/
    public static String decode(String MorsePassword) {
        String password = new String();
        Fence f = new Fence();
        StringTokenizer p = new StringTokenizer(MorsePassword, "/");
        while (p.hasMoreElements()) {
            password += matching2(p.nextToken());
        }
        password = f.decode(password);
        password = f.decode(password);
        return password;
    }
}
