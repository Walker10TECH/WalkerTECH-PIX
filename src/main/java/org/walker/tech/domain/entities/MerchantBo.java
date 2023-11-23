package org.walker.tech.domain.entities;


public class MerchantBo {
    private String name;
    private String postalCode;
    private String city;

    public MerchantBo(String postalCode, String city, String name) {
        this.name = name;
        this.postalCode = postalCode;
        this.city = city;
    }

    public MerchantBo() {
    }

    public String getName() {
        return name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
