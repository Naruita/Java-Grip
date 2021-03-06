/*
   You're given a string J composed of latin characters where each character is a jewel.
   You're also given a string S composed of latin characters where each character is a mined stone.
   You have to find out how many characters of S are in J as well.
*/
package LeetCode;

import java.util.*;

class JewelsStones {
    private static int countOfJews(String jewels, String stones){
        int temp_count = 0;
        for(int i = 0; i < stones.length(); i++){
            for(int j = 0; j < jewels.length(); j++){
                if(stones.charAt(i) == jewels.charAt(j)){
                    temp_count++;
                    break;
                }
            }
        }
        return temp_count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Jewels?");
        String J = sc.nextLine();
        System.out.println("Stones?");
        String S = sc.nextLine();
        System.out.println("The Jewels are : " + J);
        System.out.println("The Mined stones are : " + S);
        System.out.println("The number of jewels in the mining stones are :" + countOfJews(J, S));
        sc.close();
    }
}