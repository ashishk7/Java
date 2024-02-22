import java.util.*;
public class Main {
    public static int population(HashMap<String, Integer> H, int K){
        int count=0;
        for (int i : H.values()) {
            if(i<K){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nHashMap of Countries and their Population: \n");
        String[] countries = {"India", "China", "United States", "Indonesia", "Pakistan", "Nigeria", "Brazil", "Bangladesh", "Russia", "Mexico", "Ethiopia", "Japan", "Philippines", "Egypt", "DR Congo", "Vietnam", "Iran", "Turkey", "Germany", "Thailand", "United Kingdom", "Tanzania", "France", "South Africa", "Italy", "Kenya", "Myanmar", "Colombia", "South Korea", "Uganda", "Sudan", "Spain", "Argentina", "Algeria", "Iraq", "Afghanistan", "Poland", "Canada", "Morocco", "Saudi Arabia", "Ukraine", "Angola", "Uzbekistan", "Yemen", "Peru", "Malaysia", "Ghana", "Mozambique", "Nepal", "Madagascar", "Ivory Coast", "Venezuela", "Cameroon", "Niger", "Australia", "North Korea", "Mali", "Burkina Faso", "Syria", "Sri Lanka", "Malawi", "Zambia", "Romania", "Chile", "Kazakhstan", "Chad", "Ecuador", "Somalia", "Guatemala", "Senegal", "Netherlands", "Cambodia", "Zimbabwe", "Guinea", "Rwanda", "Benin", "Burundi", "Tunisia", "Bolivia", "Haiti", "Belgium", "Jordan", "Dominican Republic", "Cuba", "South Sudan", "Sweden", "Honduras", "Czechia", "Azerbaijan", "Greece", "Papua New Guinea", "Portugal", "Tajikistan", "Hungary", "United Arab Emirates", "Belarus", "Israel", "Togo", "Austria", "Switzerland", "Sierra Leone", "Laos", "Serbia", "Nicaragua", "Libya", "Paraguay", "Kyrgyzstan", "Bulgaria", "Turkmenistan", "El Salvador", "Congo", "Singapore", "Denmark", "Slovakia", "Central African Republic", "Finland", "Norway", "Liberia", "Palestine", "Lebanon", "New Zealand", "Costa Rica", "Ireland", "Mauritania", "Oman", "Panama", "Kuwait", "Croatia", "Eritrea", "Georgia", "Mongolia", "Moldova", "Uruguay", "Bosnia and Herzegovina", "Albania", "Jamaica", "Armenia", "Gambia", "Lithuania", "Qatar", "Botswana", "Namibia", "Gabon", "Lesotho", "Guinea-Bissau", "Slovenia", "North Macedonia", "Latvia", "Equatorial Guinea", "Trinidad and Tobago", "Bahrain", "East Timor", "Estonia", "Mauritius", "Cyprus", "Eswatini", "Djibouti", "Fiji", "Comoros", "Guyana", "Bhutan", "Solomon Islands", "Luxembourg", "Montenegro", "Suriname", "Cape Verde", "Malta", "Maldives", "Brunei", "Bahamas", "Belize", "Iceland", "Vanuatu", "Barbados", "São Tomé and Príncipe", "Samoa", "Saint Lucia", "Kiribati", "Grenada", "Micronesia", "Tonga", "Seychelles", "Saint Vincent and the Grenadines", "Antigua and Barbuda", "Andorra", "Dominica", "Saint Kitts and Nevis", "Marshall Islands", "Liechtenstein", "Monaco", "San Marino", "Palau", "Cook Islands", "Nauru", "Tuvalu", "Niue", "Vatican City",};
        int[] population = {1428627663, 1425671352, 339996564, 277534123, 240485658, 223804632, 216422446, 172954319, 144444359, 128455567, 126527060, 123294513, 117337368, 112716599, 102262809, 98858950, 89172767, 85816199, 83294633, 71801279, 67736802, 67438106, 64756584, 60414495, 58870763, 55100587, 54577997, 52085168, 51784059, 48582334, 48109006, 47519628, 45773884, 45606481, 45504560, 42239854, 41026068, 38781292, 37840044, 36947025, 36744634, 36684203, 35163944, 34449825, 34352719, 34308525, 34121985, 33897354, 30896590, 30325732, 28873034, 28838499, 28647293, 27202843, 26439112, 26160822, 23293699, 23251485, 23227014, 21893579, 20931751, 20569738, 19892812, 19629590, 19606634, 18278568, 18190484, 18143379, 18092026, 17763163, 17618299, 16944826, 16665409, 14190612, 14094683, 13712828, 13238559, 12458223, 12388571, 11724764, 11686140, 11337053, 11332973, 11194449, 11088796, 10612086, 10593798, 10495295, 10412652, 10341277, 10329931, 10247605, 10143543, 9604000, 9516871, 9498238, 9174520, 9053799, 8958961, 8796669, 8791092, 7633779, 7149077, 7046311, 6888388, 6861524, 6735348, 6687717, 6516100, 6364943, 6106869, 6014723, 5910913, 5795199, 5742316, 5545475, 5474360, 5418377, 5371230, 5353930, 5228100, 5212173, 5056935, 4862989, 4644384, 4468087, 4310108, 4008617, 3748902, 3728282, 3447157, 3435931, 3423109, 3210848, 2832439, 2825544, 2777971, 2773168, 2718352, 2716391, 2675353, 2604172, 2436567, 2330318, 2150842, 2119675, 2085679, 1830212, 1714672, 1534937, 1485510, 1360596, 1322766, 1300557, 1260138, 1210822, 1136455, 936376, 852075, 813834, 787425, 740425, 654768, 626485, 623237, 598682, 535065, 523787, 452524, 412624, 410825, 375319, 334506, 281996, 231856, 225681, 180251, 133515, 126184, 115224, 107773, 107660, 103699, 94298, 80088, 73040, 47755, 41996, 39585, 36298, 33642, 18058, 17044, 12780, 11396, 1935, 518,};

        HashMap<String, Integer> countriesData = new HashMap<>();
        for(int i = 0; i<population.length; i++){
            countriesData.put(countries[i],population[i]);
        }
        System.out.print(countriesData);
        System.out.print("\nEnter Population(K): ");
        int K = scanner.nextInt();          //take input from the user
        System.out.print(population(countriesData, K));
    }
}