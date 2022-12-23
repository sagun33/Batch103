package atmproject;
public class Runner1 {
    public static void main(String[] args) {
        Account01 bankaMatik = new Account01();
        System.out.println("bankaMatik.bakiyeIlk(5000) = " + bankaMatik.bakiyeIlk(5000));

        System.out.println("bankaMatik.hesabaParaYatirdiktanSonrakiBakiye(3000) = " +
                "" + bankaMatik.hesabaParaYatirdiktanSonrakiBakiye(3000));
        bankaMatik.hesaptanParaCektiktenSOnrakiBakiye(2000);
        System.out.println("bankaMatik.vadesizHesapBakiyesi = " + bankaMatik.vadesizHesapBakiyesi);
        System.out.println("bankaMatik.faizHesaplama(20) = " + bankaMatik.faizHesaplama(20));

    }
}