package org.young;

public class GitTest {
    public static void main(String[] args) {
        String s = "Good Afternoon";
        String res;
        for (int i = 0; i < s.length(); i++) {
            System.out.print("=");
        }
        System.out.println("\n" + s);
        System.out.println("branch_cow did some change...");
        System.out.println("i am master!");
        System.out.println("[ant] added something...");
    }
}
