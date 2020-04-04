package com;
public class Reverse {
 static int i, c = 0, res;

 public static void main(String args[]) {
   
  String rev = Reverse.stringreverse("Hello");
  System.out.println("revrse String::"+ rev);
 }

 static String  stringreverse(String s) {
  String reverseString="" ;
  char ch[] = new char[s.length()];
  for (i = 0; i < s.length(); i++)
   ch[i] = s.charAt(i);
  for (i = s.length() - 1; i >= 0; i--)
   reverseString = reverseString+ch[i];

return reverseString ;
 }
}