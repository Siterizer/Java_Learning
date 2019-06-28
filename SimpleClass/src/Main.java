public class Main {
    public static void main(String[] args){

        Country[] cities = new Country[5];
        cities[0] = new Country(36000000, "Poland");
        cities[1] = new Country(82000000, "Germany");
        cities[2] = new Country(66000000, "France");
        cities[3] = new Country(326000000, "USA");
        cities[4] = new Country(37000000, "Canada");

        for(Country temp : cities)
            System.out.println("Population: " + temp.getPopulation() + "  Country name: " + temp.getCountry());
    }
}
