package homeworkTwo2022_10_25;

public class Country implements Measurable {
    private String country;
    private double areaOfCountry;

    public Country(String country, double areaOfCountry) {
        this.country = country;
        this.areaOfCountry = (areaOfCountry < 0) ? 0 :areaOfCountry;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getAreaOfCountry() {
        return areaOfCountry;
    }

    public void setAreaOfCountry(double areaOfCountry) {
        this.areaOfCountry = areaOfCountry;
    }

    @Override
    public double getMeasure() {
        return areaOfCountry;
    }
}
