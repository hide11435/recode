package oop;

 class SmartPhone { //フィールド
     public String model;

     public String os;

     public Account account;

     public AddressBook[] addressBooks; //AddressBookというクラスの配列

     public String[] apps;

     public SmartPhone(String model, String os) { //コンストラクタ
         this.model = model;
         this.os = os;

     }
/////メソッド//////////////////////////////
     public void setAccount(Account account) {
         this.account = account;

     }

     public void displayDeviceInfo() {
         System.out.println(model + os);

     }

     public void displayMyAccount() {
         System.out.println(account.getAccountInfo());

     }

     public  boolean addAddressBook(AddressBook[] addressBooks, int num) {
         for (var i = 0; i < addressBooks.length; i++) {
             if (addressBooks[i] == null) {
                 addressBooks[i] = null;
                 return true;
             }
         }
         return false;
     }

     public void displayAppList() {
         String[] apps = {};
         for (var i = 0; i < apps.length; i++) {
             if (apps[i] == null) {
                 System.out.println(apps.length);
             }
         }
     }
 }

