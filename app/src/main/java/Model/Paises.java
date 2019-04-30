package Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class Paises implements Serializable {



    public Paises(long id, String name , String capital, String region, String subregion, String population, String demonym,
                  String area, String gini, String numericcode) {

        this.id = id;
        this.name = name;
        this.capital = capital;
        this.region = region;
        this.subregion = subregion;
        this.population = population;
        this.demonym = demonym;
        this.area = area;
        this.gini = gini;
        this.numericCode = numericcode;
    }



    @Override
    public String toString() {
        return "Paises{" +
                " name='" + name + '\'' +
                " capital='" + capital + '\'' +
                " region='" + region + '\'' +
                " subregion='" + subregion + '\'' +
                " population='" + population + '\'' +
                " demonym='" + demonym + '\'' +
                " area='" + area + '\'' +
                " gini='" + gini + '\'' +
                " numericcode='" + numericCode + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getLatlng() {
        return latlng;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public String getCapital() {
        return capital;
    }

    public String getRegion() {
        return region;
    }

    public String getSubregion() {
        return subregion;
    }

    public String getPopulation() {
        return population;
    }

    public String getDemonym() {
        return demonym;
    }

    public String getArea() {
        return area;
    }

    public String getGini() {
        return gini;
    }

    public String getNativename() {
        return nativename;
    }

    public String getNumericcode(){
        return numericCode;
    }


    @SerializedName("id")
    public long id;

    @SerializedName("name")
    public String name;

    @SerializedName("latlng")
    public List<String> latlng;

    @SerializedName("alpha2Code")
    public String alpha2Code;

    @SerializedName("alpha3Code")
    public String alpha3Code;

    @SerializedName("capital")
    public String capital;

    @SerializedName("region")
    public String region;

    @SerializedName("subregion")
    public String subregion;

    @SerializedName("population")
    public String population;

    @SerializedName("demonym")
    public String demonym;

    @SerializedName("area")
    public String area;

    @SerializedName("gini")
    public String gini;

    @SerializedName("nativename")
    public String nativename;

    @SerializedName("numericCode")
    public String numericCode;

}
