public class City implements Comparable<City>, Cloneable {
    private String cityName;
    private int temperature;

    public City(String cityName, int temperature) {
        this.cityName = cityName;
        this.temperature = temperature;
    }

    public String getCityName() {
        return cityName;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public int compareTo(City other) {
        return Integer.compare(this.temperature, other.temperature);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof City)) {
            return false;
        }
        City otherCity = (City) other;
        return this.cityName.equals(otherCity.cityName) && this.temperature == otherCity.temperature;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", cityName, temperature);
    }

    @Override
    public City clone() {
        return new City(cityName, temperature);
    }
}
