package com.example.productertask.helpers.business;

public class RulesControlHelper {

    public static boolean runRules(boolean... rules){
        boolean flag = true;
        for(boolean rule : rules){
            if(rule==false){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
