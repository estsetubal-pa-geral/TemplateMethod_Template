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
public class B extends A {

    public B(char value) {
        super(value);
    }
    //duplicate code in subclasses B and C
    public String formatMessage(String msg) {
        msg = msg.replace(value, 'B');
        //capitalize
        msg = msg.toUpperCase();
        //enclose
        msg = "{" + msg + "}";
        return msg;
    }
}
