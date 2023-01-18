package com.vannou.unittesting.service;

public class StringUtils {

    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    
    public String vowels(String candidate) {
        String vowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                vowels += letters[i];
            }
        }
        return vowels;
    }

    public String uniqueVowels(String candidate) {
        String vowelsWithdouble = vowels(candidate);
        String vowelsWithdoubleTemp="";
        char[] letters = vowelsWithdouble.toCharArray();
        for (int i = 0; i < vowelsWithdouble.length(); i++) {
            if (vowelsWithdoubleTemp.indexOf(letters[i]) <= 0) {
                vowelsWithdoubleTemp += letters[i];
            }
        }
        return vowelsWithdoubleTemp;
    }

}
