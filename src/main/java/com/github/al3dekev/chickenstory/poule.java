package com.github.al3dekev.chickenstory;

public class poule{

    public String whispering;
    public String name;

    public poule(String Cname, String Cwhispering){
        setWhispering(Cwhispering);
        setName(Cname);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWhispering(String whispering) {
        this.whispering = whispering;
    }

    public String getWhispering() {
        return whispering;
    }
}
