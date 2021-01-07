/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pa.refatoring.templatemethod;

/**
 *
 * @author patricia.macedo
 */
public class C extends A {

    public C(char value) {
        super(value);
    }
    //duplicate code in subclasses B and C
    public String formatMessage(String msg) {
        msg = msg.replace(value, 'C');
        //capitalize
        msg = msg.toUpperCase();
        //enclose
        msg = "[" + msg + "]";
        return msg;
    }
}
