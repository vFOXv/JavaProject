package com;


public class JobBasaMBeanWorc implements JobBasaMBean {

    MyJobBasa myJobBasa;
    MyJobBasa myJobBasaClone;

    @Override
    public void createObjectFromBaseEntity() throws CloneNotSupportedException {
        myJobBasa = new MyJobBasa("name", 10, 100, null);
        myJobBasaClone = myJobBasa.clone();
    }

    @Override
    public String getInformationAboutObject() {
        System.out.println(myJobBasa.toString());
        System.out.println(myJobBasaClone.toString());

        return myJobBasaClone.toString();
    }

    @Override
    protected MyJobBasa clone() throws CloneNotSupportedException {
        return (MyJobBasa)super.clone();
    }
}
