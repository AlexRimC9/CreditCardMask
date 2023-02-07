/*
Usually when you buy something,
you're asked whether your credit card number, phone number or answer to your most secret question is still correct.
However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.

Your task is to write a function maskify, which changes all but the last four characters into '#'.

 */


public class Main {
    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
    }

    public static String maskify(String str) {
        if (str.length() <= 4) return str;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i != str.length() - 4; i++){
            ans.append("#");
        }
        ans.append(str.charAt(str.length() - 4));
        ans.append(str.charAt(str.length() - 3));
        ans.append(str.charAt(str.length() - 2));
        ans.append(str.charAt(str.length() - 1));
        return ans.toString();
    }
}