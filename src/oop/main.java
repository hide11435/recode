package oop;


public class main {
    public static void main(String[] args) { //メソッド

        Account account = new Account("Tarou", "1234", "japan.com", "Tokyo");
        AddressBook AddressBook1 = new AddressBook("kenji", "4568","tokoyf.com") ;
        SmartPhone smartphone = new SmartPhone("hanako", "iphone");

        smartphone.setAccount(account);

        smartphone.displayAppList();

        smartphone.displayMyAccount();

    }

}
