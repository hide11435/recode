package oop;

public class Account { //フィールド
    private String name;
    private String tel;
    private String email;
    private String address;

    public Account(String name, String tel, String email, String address) { //コンストラクタ
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.address = address;
    }

    public String getAccountInfo() { //メソッド
        String accountInfo = "名前: " + this.name + "\n" + "電話番号: " + this.tel + "\n"
                            + "メールアドレス: "  + this.email + "\n" + "住所: " + this.address+ "\n" ;
        return accountInfo;
    }
}


