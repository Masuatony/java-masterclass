package org.java.springsecurity.Abstraction.Challenge;

public abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem previous();

    abstract ListItem setNext(ListItem item);
    abstract ListItem setPrevious(ListItem item);
    abstract int compareTo(ListItem item);
     public Object getValue() {
         return value;
     };

     public void setValue(Object value) {
         this.value = value;
     };



}
