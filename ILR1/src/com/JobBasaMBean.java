package com;


public interface JobBasaMBean {//на будущее. т.к для регистрации ресурсов в jmx - необходимо, чтобы
    //в названии интерфейса в качестве постфикса был MBean
    void createObjectFromBaseEntity() throws CloneNotSupportedException;

    String getInformationAboutObject();
}
