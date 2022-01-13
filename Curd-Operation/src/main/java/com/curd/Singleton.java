package com.curd;

import java.io.Serializable;

public abstract class Singleton implements Serializable,Cloneable {


    private static final long serialVersionUID = 7132654273374485427L;

    private static  Singleton instance = null;

    public  static  Singleton getInstance(){
        if(instance == null){

            synchronized (Singleton.class){
                if(instance==null) {
                    instance = new Singleton(){
                    };
                }

            }
        }
        return  instance;
    }

    //to avoid serialization
    public Object readResolve(){
        return getInstance();
    }
    public Object clone() throws  CloneNotSupportedException {
        throw  new CloneNotSupportedException("can't create more object of class");
    }

}
