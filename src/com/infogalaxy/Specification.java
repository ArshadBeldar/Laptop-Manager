package com.infogalaxy;

public class Specification {

    private String processor;
    private String generation;
    private String ram;
    private String hhd;
    private String ssd;
    private String screensize;
    private String keyboard;

    public String getProcessor() {
        return this.processor;
    }

    public String getGeneration() {
        return this.generation;
    }

    public String getRam() {
        return this.ram;
    }

    public String getHhd() {
        return this.hhd;
    }

    public String getSsd() {
        return this.ssd;
    }

    public String getScreensize() {
        return this.screensize;
    }

    public String getKeyboard() {
        return this.keyboard;
    }

    //  Setter method....

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setHhd(String hhd) {
        this.hhd = hhd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public void setScreensize(String screensize) {
        this.screensize = screensize;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String toString() {
        return "Laptop Specification{" +
                "Processor : " + processor + '\'' +
                ",Generation : " + generation + '\'' +
                ",Ram : " + ram + '\'' +
                ",HSD: " + hhd + '\'' +
                ",SSD " + ssd + '\'' +
                ",Screen Size : " + screensize + '\'' +
                "Keyboard : " + keyboard + '\'' +
                '}';
    }
}
