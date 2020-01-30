package com.msg91.sendotp.sample;

public class Cheque01 {

    private String imager;
    private String status;
    private String userr;
    private String prizer;



    public Cheque01(String image, String status, String user, String prize) {

        this.imager = image;
        this.status = status;
        this.userr=user;
        this.prizer=prize;


    }

    public Cheque01() {
    }


    public String getImage() {
        return imager;
    }
    public String getStatus() {
        return status;
    }
    public String getUser() {
        return userr;
    }
    public String getPrize() { return  prizer; }}
