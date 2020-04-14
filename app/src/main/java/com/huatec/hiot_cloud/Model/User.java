package com.huatec.hiot_cloud.Model;

import java.io.Serializable;

public class User implements Serializable {
    String Usrname;
    String Passwd;

    public String getUsrname() {
        return Usrname;
    }

    public void setUsrname(String usrname) {
        Usrname = usrname;
    }

    public String getPasswd() {
        return Passwd;
    }

    public void setPasswd(String passwd) {
        Passwd = passwd;
    }
}
