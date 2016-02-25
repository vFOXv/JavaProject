package com;

public class Main {
    public static void main(String[] args) {
        JobBasaMBeanWorc jobBasaWorc = new JobBasaMBeanWorc();
        try {
            jobBasaWorc.createObjectFromBaseEntity();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        jobBasaWorc.getInformationAboutObject();

        MyJobBasa myJobBasa = new MyJobBasa();
        myJobBasa.setName("MainClone");
        myJobBasa.setAge(333);
        myJobBasa.setRate(555);
        myJobBasa.setMyClone(myJobBasa.myClone);

        try {
            jobBasaWorc.myJobBasaClone.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        jobBasaWorc.getInformationAboutObject();
    }
}
