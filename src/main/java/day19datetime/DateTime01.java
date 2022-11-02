package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {

        //Example 1: "Anlik tarihi"(Current Date) ekrana yazdiran kodu yaziniz
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);// 2022-10-21

        //Example 2: "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);// 13:42:32.032258

        //Example 3: "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);// 2022-10-21T13:46:19.435213

        //Example 4: Japonya'daki "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);// 2022-10-22T02:51:53.899959

        //Example 5: Istanbul'daki "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);// 2022-10-21T20:53:17.682534

        //Example 6: Bugunden 789 gun sonra emekli olacaginiza gore, emeklilik tarihini hesaplayan kodu yaziniz.
        LocalDate countDate = LocalDate.of(2022, 10, 21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);// 2024-12-18

        //Example 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz

        LocalDate senih=LocalDate.of(10,01,2013);
        LocalDate selma=LocalDate.of(9,10,2016);
        LocalDate esma=LocalDate.of(27,04,2020);

        Long farkSenihUndSelma=ChronoUnit.YEARS.between(senih,selma);
        Long farkSelmaUndEsma=ChronoUnit.YEARS.between(selma,esma);
        Long farkSenihUndEsma=ChronoUnit.YEARS.between(senih,esma);

        System.out.println("farkSenihUndSelma = " + farkSenihUndSelma);
        System.out.println("farkSelmaUndEsma = " + farkSelmaUndEsma);
        System.out.println("farkSenihUndEsma = " + farkSenihUndEsma);
        LocalDate dobAli = LocalDate.of(2005, 5, 17);
        LocalDate dobVeli = LocalDate.of(2013, 2, 8);

        //between(dobAli, dobVeli) method'u kullanildiginda daha eski olan tarih once yazilmalidir
        Long diff = ChronoUnit.DAYS.between(dobAli, dobVeli);
        System.out.println(diff);//2824

        //Example 8: Istanbul'un Fethi ile, Cumhuriyet'in kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz.
        //           29 Mayis 1453 ==> Istanbul'un Fethi              29 Ekim 1923 ==> Cumhuriyet'in kurulusu
        LocalDate istanbulunFethi = LocalDate.of(1453, 5, 29);
        LocalDate cumhuriyetKurulus = LocalDate.of(1923, 10, 29);

        Long aySayisi = ChronoUnit.MONTHS.between(istanbulunFethi, cumhuriyetKurulus);
        System.out.println(aySayisi);// 5645

        //Example 9: Verilen tarih'in hangi burcta oldugunu gosteren kodu yaziniz
        LocalDate myDate = LocalDate.of(1989, 5, 13);

        int day = myDate.getDayOfMonth();
        System.out.println("day = " + day);
        int month = myDate.getMonthValue();
        System.out.println("month = " + month);

        //1.Yol:
        if(day>=21 && month==3){
            System.out.println("Koc");
        }else if(day<=20 && month==4){
            System.out.println("Koc");
        }else if(day>=21 && month==4){
            System.out.println("Boga");
        }else if(day<=20 && month==5){
            System.out.println("Boga");
        }
        //2.Yol:
        if ((day>=21 && month==3) || (day<=19 && month==4)) {
            System.out.println("Koc");
        }else if ((day>=20 && month==4) || (day<=20 && month==5)){
            System.out.println("Boga");
        }if ((day>=21 && month==5) || (day<=21 && month==6)) {
            System.out.println("ikizler");
        }else if ((day>=22 && month==6) || (day<=22 && month==7)){
            System.out.println("yengec");
        }if ((day>=23 && month==7) || (day<=22 && month==8)) {
            System.out.println("aslan");
        }else if ((day>=23 && month==8) || (day<=22 && month==9)){
            System.out.println("basak");
        }if ((day>=23 && month==9) || (day<=22 && month==10)) {
            System.out.println("terazi");
        }else if ((day>=23 && month==10) || (day<=21 && month==11)){
            System.out.println("akrep");
        }if ((day>=22 && month==11) || (day<=21 && month==12)) {
            System.out.println("yay");
        }else if ((day>=22 && month==12) || (day<=19 && month==1)){
            System.out.println("oglak");
        }if ((day>=20 && month==1) || (day<=18 && month==2)) {
            System.out.println("kova");
        }else if ((day>=19 && month==2) || (day<=20 && month==3)){
            System.out.println("balik");
        }
        



    }
}