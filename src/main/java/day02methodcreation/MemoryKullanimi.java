package day02methodcreation;

public class MemoryKullanimi {
}
    /*

    Java'da iki tane Memory var:

    1.Heap(Büyük olan):icine String,Olusturdugumuz Classlar yani Non-Primitivler konulur.
    Java Heap Memoriye yerlestirilen her Non Primitive data icin bir adres olusturur.
    ve bu adresi Stack Memory e koyar

     Heap Memori cok büyük oldugu icin icine koydugumuz Non Primitivler kaybolabilir.
    O yüzden koydugumuz yeri bilmek gerekiyor.
    Bütün Non-Primitivler Stack deki Adresler(REFERENCE) sayesinde bulunur.
    Herhangi bir sebepten dolayi adresi silinen  Non-Primitive ler
    cöp toplayicilar toplar.
    o yüzden Adresi bulunamayinca Javanin Cöp toplayicilari(Garbage Collector)
    Heap Memorideki Non-Primitive leri toplar.

     2.Stack(Kücük olan):icine byte,short,int,float,double,boolean,char datalar

     yani Primitive Datalar konur.
     Su ana kadar ögrendigimiz ve ögrenecegimiz
     Not:Class===>Variable===>Object
                  Method
     */