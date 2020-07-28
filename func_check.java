/** Design a class to overload a function check( ) as follows:
(i) void check(String str, char ch)- to find and print the frequency of a
character in a string.
Example:
Input:            Output:
str = ”success”   number of s present is = 3
ch = ‘s’

(ii) void check(String s1)- to display only vowels from string s1,after
converting it to lower case.
Example:
Input:           Output:
s1 = “computer”  o u e     */

public class func_check
{
 void check(String str, char ch)
 { int len= str.length();
     Character ch;
     if(Character.charAt(
    