package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber;// hesap numarasi
    private int pinNumber;//sifre

    private double checkingBalance; // vadesiz hesap bakiyesi
    private double savingBalance; //vadeli hesap bakiyesi

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");


    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }



    //para cekme  => paraCekmeIslemindenSonraKalanMiktar  amount : miktar

    private double calculateCheckingBalanceAfterWithdraw(double amount){
        //  100              200               100
        checkingBalance =  checkingBalance - amount;

        return checkingBalance;

    }

    //para yatirma para yatirma isleminden sonra kalan bakiyeyi hesapla
    private double calculateCheckingBalanceAfterDeposit(double amount){
        //vadesiz bakiye 205      200             5
        checkingBalance = checkingBalance + amount;

        return checkingBalance;
    }


    // para cekme: saving hesabindan para cekildikten sonra kalan bakiye
    private double calculateSavingBalanceAfterWithdraw(double amount){
        //vadeli hesap bakiyesi        150             50
        savingBalance =              savingBalance - amount;
        return savingBalance;
    }

    //para yatirma: saving hesabina para yatirdiktan sonra geri kalan bakiyeyi hesaplayiniz
    private double calculateSavingBalanceAfterDeposit(double amount){
        //vadeli hesap       100           100
        savingBalance =  savingBalance + amount;
        return  savingBalance;
    }


    //Musteri ile para cekmek icin etkilesime gecelim: checking hesap
    public void getCheckingWithdraw(){

        displayCurrentAmount(checkingBalance);
        System.out.println("Cekmek istediginiz mikatri giriniz:");
        double amount = input.nextDouble();//200

        if(amount <= 0) {
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getCheckingWithdraw();//recursive method //medthodu tekrardan cagirma
        }    // 200           200
        else if(amount <= checkingBalance){

            calculateCheckingBalanceAfterWithdraw(amount);
            displayCurrentAmount(checkingBalance);
        }else {
            System.out.println("Yetersiz bakiye!");
        }


    }


    //Para yatirma(checking): Musteri ile para yatirmak icin etkilesime gecelim
    public void getCheckingDeposit(){

        displayCurrentAmount(checkingBalance);//hesabinizda su miktar bulunmaktadir
        System.out.println("Yatirmak istediginiz miktari giriniz:");
        double amount = input.nextDouble();

        if(amount <= 0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getCheckingDeposit();
        }else {
            calculateCheckingBalanceAfterDeposit(amount);
            System.out.println();
            displayCurrentAmount(checkingBalance);
        }


    }

    ////Musteri ile para cekmek icin etkilesime gecelim: saving hesap

    public void getSavingWithdraw() {

        displayCurrentAmount(savingBalance);
        System.out.println("Cekmek istediginiz mikatri giriniz:");
        double amount = input.nextDouble();

        if(amount <= 0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getSavingWithdraw();
        }else if(amount <= savingBalance){
            calculateSavingBalanceAfterWithdraw(amount);
            System.out.println();
            displayCurrentAmount(savingBalance);
        }else {
            System.out.println("Yetersiz bakiye");
        }

    }


    //Para yatirma(saving): Musteri ile para yatirmak icin etkilesime gecelim
    public void getSavingDeposit(){

        displayCurrentAmount(savingBalance);
        System.out.println("Yatirmak istediginiz meblayi giriniz:");
        double amount = input.nextDouble();

        if(amount <= 0 ){
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getSavingDeposit();
        }else{
            calculateSavingBalanceAfterDeposit(amount);
            displayCurrentAmount(savingBalance);
        }

    }
















    //son bakiyeyi goster
    public void displayCurrentAmount(double balance){


        System.out.println("hesabinizda bulunan bakiye: "+ moneyFormat.format(balance));
    }








}