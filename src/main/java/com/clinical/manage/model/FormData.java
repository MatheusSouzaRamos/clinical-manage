package com.clinical.manage.model;


public class FormData {
    private String s1;
    private int i1;
    private int i2;
    private int i3;
    private int i4;
    private int i5;
    private int i6;
    private boolean flag;

    public FormData(){}

    //setters
    public void setS1(String s1){
        this.s1 = s1;
    }
    
    public void setI2(int i2){
        this.i2 = i2;
    }

    public void setI3(int i3){
        this.i3 = i3;
    }

    public void setI4(int i4){
        this.i4 = i4;
    }

    public void setI5(int i5){
        this.i5 = i5;
    }

    public void setI6(int i6){
        this.i6 = i6;
    }

    public void setFlag(boolean flag){
        this.flag = flag;
    }

    //getters
    public String getS1(){
        return s1;
    }

    public int getI1(){
        return i1;
    }
    
    public int getI2(){
        return i2;
    }

    public int getI3(){
        return i3;
    }

    public int getI4(){
        return i4;
    }

    public int getI5(){
        return i5;
    }

    public int getI6(){
        return i6;
    }

    public boolean getFlag(){
        return flag;
    }
}
