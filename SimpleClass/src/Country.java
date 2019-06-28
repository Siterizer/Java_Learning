class Country {
    private int population;
    private String Country;

    Country(int population, String country){
        this.population = population;
        this.Country = country;
    }
    Country(String country){
        this.Country = country;
    }
    int getPopulation() {
        return population;
    }

    void setPopulation(int population) {
        this.population = population;
    }

    String getCountry() {
        return Country;
    }

    void setCountry(String country) {
        Country = country;
    }
}
