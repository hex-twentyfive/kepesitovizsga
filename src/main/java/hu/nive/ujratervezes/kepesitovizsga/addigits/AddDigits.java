package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {


    public int addDigits(String input) {

        if (input == null || input.equals("")) {
            return (-1);
        }

        String filtered = filterString(input);

        if(filtered.equals("")) {
            return 0;
        }

        String[] parts = filtered.split("");

        int digitSum = 0;

        for(String e: parts) {
            digitSum += Integer.parseInt(e);
        }

        return digitSum;
    }

    private String filterString(String input) {
        String filteredString = input.replaceAll("[\\D]","");       //Csak a digit karakterek maradnak benne.
        return filteredString;
    }

}
