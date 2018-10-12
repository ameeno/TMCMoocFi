package com.company;

public class Solution {

        public int reverse(int x) {
            String int2String = Integer.toString(x);
            String reversed = "";
            for (int i = int2String.length(); i >0; i--) {
                reversed += int2String.charAt(i-1);
            }
            return Integer.parseInt(reversed);
        }

    }
