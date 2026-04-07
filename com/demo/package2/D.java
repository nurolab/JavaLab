package com.demo.package2;

import com.demo.package1.A;

public class D extends A {
    public static void main(String[] args) {
        D obj = new D();

        // System.out.println(obj.privateVar); ❌
        // System.out.println(obj.defaultVar); ❌
        System.out.println(obj.protectedVar); // ✔ (via inheritance)
        System.out.println(obj.publicVar);    // ✔
    }
}