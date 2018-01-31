package com.example.poly.myapplication;

public class Calcutor {
        int plus(int x , int y) {
            return x+y;
        }
        int minus(int x , int y) {
            return x-y;
        }
        int multiple(int x , int y) {
            return x*y;
        }
        int divide(int x , int y) {
            if (y==0){
                return 0;
            }
            else{
                return x/y;
            }
        }
    }

