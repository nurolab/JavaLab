package com.demo.package2;

import com.demo.package1.A;

public class C {
    public static void main(String[] args) {
        A obj = new A();

        // System.out.println(obj.privateVar); ❌
        // System.out.println(obj.defaultVar); ❌
        // System.out.println(obj.protectedVar); ❌
        System.out.println(obj.publicVar);     // ✔ ONLY THIS
    }
}