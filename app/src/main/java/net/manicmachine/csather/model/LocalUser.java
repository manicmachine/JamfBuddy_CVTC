package net.manicmachine.csather.model;

/**
 * Created by csather on 4/24/18.
 */

public class LocalUser {

    private String username;
    private String realName;
    private String homeDir;
    private int uid;
    private boolean isAdmin;
    private boolean isFvEnabled;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getHomeDir() {
        return homeDir;
    }

    public void setHomeDir(String homeDir) {
        this.homeDir = homeDir;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isFvEnabled() {
        return isFvEnabled;
    }

    public void setFvEnabled(boolean fvEnabled) {
        isFvEnabled = fvEnabled;
    }
}