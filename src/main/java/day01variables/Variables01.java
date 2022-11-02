package day01variables;

public class Variables01 {
    //Variable nasil olusturulur?
    //1)Access Modifier 2)Data Type 3) Variable Name 4)=(Assignment Opertor)  5)Value  6);(semicolon)
    //Java'da ";" ingilizcedeki . gibidir
    //ingillizcede cümle(sentence) deriz.Javada statement deriz.
    //"=" sembolü Assignment Operator (Atama Operatörü)

    /*
   Variable
     bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
     Variable icinde deger saklayan bir konteynirdir
   //bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
   //örneğin bir şehrin nufusundan bahsediyorsak variablemızın data türü boolString,ean,char veya double alamayız
   //geriye kalan tamsayı  turlerınden şehrin nufusunu içine alabilecek büyüklükte bir data turu seceebiliriz
   //kurs boyunca genelde tam sayılar için int ondalıklı sayılar için double kullanacagız
    */


    public int age = 13;
    public int height = 183;

    //Java'da Data Typs
    /*                    Primitive Data Types
    1)int:    Integer'in kisaltmasi.Integer tam sayi demektir.
              32 bit kullanir memoride.
              Matematikte tam syilarin basi ve sonu yoktur.
              Fakat Java'da tamsayilarin basi ve sonu vardir-
              En Kücük int=-2,147,482,648
              En büyük int= 2,147,482,647
    2)byte:   Tam sayilar icin kullanilir.8 bit kullanir memoride.
              En kücük byte=-128
              En büüyük byte=127
     3)short: Tam sayilar icin 16 bit kullanir memoride.
              En kücük byte=-32768
              En büüyük byte= 32767
     4)long:  Tam sayilar icin. 64 bit kullanir memoride
              En kücük byte=-9,223,372,036,854,755,808
              En büüyük byte=9,223,372,036,854,755,807
     5)float: Ondalik sayilar icindir.vigülden sonra 7 basamak icerebilir.
              Memoride 32 bit kullanir.Integer gibi
              float degerlerinde sonuna f veya F koymamiz gerekiyor.

     6)double:Ondalik sayilar icindir.virgülden sonra 16 basamak icerir.
              Memoride 64 bit alan kaplar.long gibi

     7)boolean:true or false degerleri icin kullanilir.1 bit kullanilir.

     8)char: Tek karakter icin kullanilir.16 bit kullanir.

              A,c,2,?,=,_
              Note:char icin deger verirken degeri tek tirnak icine koyunuz.
              Note:Java büyük ve kücük harflere duyarlidir.True ile true tamamen farklidir

              Note:(Numeric Data Types)byte<short<int
               long<float<double
                   (Non Numeric Types) :boolean,char

                       Non-Primitive Data Types
      String :isim, adres, kimlik numarasi gibi bir veya birden fazla karakter iceren degerlerde kullanilir.
      Stringg degerleri mutlaka cift tirnak arasina konulmalidir.
      String non-primitive dir.Yani bir String olusturdugumuzda Java size bir sürü method verir.
            Primitiv ile Non Primitivlerin farki nedir?
  1)Non-Primitive data type'lerinde degerin yaninda method'lar vardir.
    Primitive data Type'lerinde ise sadece degerler vardir.
  2)Primitive Data Type'leri Java tarafindan olusturulmustur.Bizler Primitive Data type olusturamayiz
    Non-Primitive data Type'leri Java tarafindan da olusturulmustur, ayrica biz de olusturabiliriz.
    Non Primitive data Type'leri sayilamayacak kadar coktur.Cünkü her Developer Non Primitive Data Typleri olusturabilir.
  3)Primitive Data Type'leri kücük harfle baslar,Non-Primitive data Type isimleri büyük harfle baslar.
    (Bütün Class lar Non Primitivdir.O yüzden Büyük hafle baslar)
  4)Primitive data Type memoride farkli büyüklükte yerler kullanir.
    Non-Primitive'ler hepsi memoride ayni büyüklükte yer kullanirlar.

     */
    public byte price = 12;
    public short populationOfVillage = 23000;
    public float priceOfShirt = 13.99F;
    public double wightOfCell = 0.000012045;
    //long demenize ragmen Java verilen sayiyi int kabul eder
    //bu yüzden long bir variable 'a int araliginin disinda bir sayi verirseniz mutlaka L veya l koyunuz
    public long populationOfWorld = 7000000000L;
    //Burada L koymadidigimiz halde problem yok cünkü 1234 int araligina uyar.
    public long x = 1234;
    public boolean isOld = true;
    public boolean isRich = false;
    public char initial = 'S';


}







