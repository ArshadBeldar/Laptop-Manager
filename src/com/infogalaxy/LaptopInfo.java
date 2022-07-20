package com.infogalaxy;

import com.infogalaxy.Specification;

public class LaptopInfo {

    Specification specification = new Specification();
    private String companyName;
    private String seriesNo;
    private String modelNo;
    private String price;
    private String launchyear;

    // getter Method...
    public String getCompanyName(){
        return this.companyName;
    }

    public String getSeriesNo() {
        return this.seriesNo;
    }

    public String getModelNo() {
        return this.modelNo;
    }

    public String getPrice() {
        return this.price;
    }

    public String getLaunchyear() {
        return this.launchyear;
    }

    //     Setter Method...

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    public void setSeriesNo(String seriesNo) {
        this.seriesNo = seriesNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setLaunchyear(String launchyear) {
        this.launchyear = launchyear;
    }

    @Override
    public String toString() {
        return "Laptop Info{" +
                "serialNo : " + seriesNo + '\'' +
                ",ModelNo : " + modelNo + '\'' +
                ",Price : " + price + '\'' +
                ",Launch Year: " + launchyear + '\'' +
                '}';
    }
}
