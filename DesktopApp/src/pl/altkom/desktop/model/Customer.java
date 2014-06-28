/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.desktop.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author student
 */
public class Customer {

    private String name;
    public static final String PROP_NAME = "name";

    private int id;
    public static final String PROP_ID = "id";

    private boolean corporate;
    public static final String PROP_CORPORATE = "corporate";

        private String nip;

    public static final String PROP_NIP = "nip";

    /**
     * Get the value of nip
     *
     * @return the value of nip
     */
    public String getNip() {
        return nip;
    }

    /**
     * Set the value of nip
     *
     * @param nip new value of nip
     */
    public void setNip(String nip) {
        String oldNip = this.nip;
        this.nip = nip;
        propertyChangeSupport.firePropertyChange(PROP_NIP, oldNip, nip);
    }

    
    /**
     * Get the value of corporate
     *
     * @return the value of corporate
     */
    public boolean isCorporate() {
        return corporate;
    }

    /**
     * Set the value of corporate
     *
     * @param corporate new value of corporate
     */
    public void setCorporate(boolean corporate) {
        boolean oldCorporate = this.corporate;
        this.corporate = corporate;
        propertyChangeSupport.firePropertyChange(PROP_CORPORATE, oldCorporate, corporate);
    }

    
    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        int oldId = this.id;
        this.id = id;
        propertyChangeSupport.firePropertyChange(PROP_ID, oldId, id);
    }

    
    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        propertyChangeSupport.firePropertyChange(PROP_NAME, oldName, name);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", id=" + id + ", corporate=" + corporate + ", nip=" + nip + '}';
    }

    

    
}
