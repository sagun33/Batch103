package day19datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CocuklariminDogumTarihleriVeFarklari {
    public static void main(String[] args) {


        LocalDate senih = LocalDate.of(10, 1, 2013);
        LocalDate selma = LocalDate.of(9, 10, 2016);
        LocalDate esma = LocalDate.of(27, 4, 2020);

        double farkSenihUndSelma = ChronoUnit.YEARS.between(senih, selma);
        double farkSelmaUndEsma = ChronoUnit.YEARS.between(selma, esma);
        double farkSenihUndEsma =  ChronoUnit.YEARS.between(senih, esma);

        System.out.println("farkSenihUndSelma = " + farkSenihUndSelma);
        System.out.println("farkSelmaUndEsma = " + farkSelmaUndEsma);
        System.out.println("farkSenihUndEsma = " + farkSenihUndEsma);
        LocalDate dobAli = LocalDate.of(2005, 5, 17);
        LocalDate dobVeli = LocalDate.of(2013, 2, 8);
    }
}
