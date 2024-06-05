package com.gj;

public class NotEnoughException extends RuntimeException {

    public NotEnoughException(){
        super();
    }
    public NotEnoughException(String msg){
        super(msg);
    }
}
