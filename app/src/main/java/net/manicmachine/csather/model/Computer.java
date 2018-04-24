package net.manicmachine.csather.model;

import java.util.ArrayList;

/**
 * Created by csather on 4/21/18.
 */

public class Computer extends Device {

    private ArrayList<String> mdmCapableUsers;
    private ArrayList<ExtensionAttribute> extAttributes;
    private ArrayList<Hdd> storage;
    private ArrayList<LocalUser> localusers;

    public ArrayList<String> getMdmCapableUsers() {
        return mdmCapableUsers;
    }

    public void setMdmCapableUsers(ArrayList<String> mdmCapableUsers) {
        this.mdmCapableUsers = mdmCapableUsers;
    }

    public ArrayList<ExtensionAttribute> getExtAttributes() {
        return extAttributes;
    }

    public void setExtAttributes(ArrayList<ExtensionAttribute> extAttributes) {
        this.extAttributes = extAttributes;
    }

    public ArrayList<Hdd> getStorage() {
        return storage;
    }

    public void setStorage(ArrayList<Hdd> storage) {
        this.storage = storage;
    }

    public ArrayList<LocalUser> getLocalusers() {
        return localusers;
    }

    public void setLocalusers(ArrayList<LocalUser> localusers) {
        this.localusers = localusers;
    }
}
