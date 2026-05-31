import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CountryMap {
    static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India", "New Delhi");
        countryMap.put("China", "Beijing");
        countryMap.put("Bangladesh", "Dhaka");
        countryMap.put("Sri Lanka", "Columbo");
        countryMap.put("Pakistan", "Islamabad");
        countryMap.put("United States", "Washington DC");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the country Name:");
        String country = input.next();
        if(countryMap.containsKey(country)){
            System.out.printf("Capital of %s is %s%n", country, countryMap.get(country));
        }else{
            System.out.println("Can't find the capital. i.e., Country and capital are not in our records");
        }
    }
}
