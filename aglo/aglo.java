package com.example.aglo;

public class ServiceImpl {
    public static void main(String[] args) {
        ServiceImpl.Solution(3, new String[] {"PEEL", "AAAAAAAAAA", "CODEJAMDAY"});
    }

    public static void Solution(int numOfCases, String[] cases){
        for(int i = 0 ; i < numOfCases; i++){
            String markedStr = getFirstMarkedStr(cases[i]);
            System.out.println(String.format("Case #%d: %s", i + 1, markedStr));
        }
    }

    public static String getFirstMarkedStr(String str){
        StringBuilder result = new StringBuilder("");
        int len = str.length();
        char[] diffChars = new char[len];
        diffChars[len - 1] = '.'; //smaller than all capital characters
        for (int i = len - 2; i >= 0; i--){
            boolean isEqual = str.charAt(i) == str.charAt(i + 1);
            diffChars[i] = isEqual ? diffChars[i + 1] : str.charAt(i + 1);
        }
        for (int j = 0; j < len; j++) {
            result.append(str.charAt(j));
            if (str.charAt(j) < diffChars[j]) {
                result.append(str.charAt(j));
            }
        }
        return result.toString();
    }
}