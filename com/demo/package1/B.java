package com.demo.package1;

public class B {
    public static void main(String[] args) {
        A obj = new A();

        // System.out.println(obj.privateVar); ❌ NOT accessible
        System.out.println(obj.defaultVar);   // ✔
        System.out.println(obj.protectedVar); // ✔
        System.out.println(obj.publicVar);    // ✔
    }
}