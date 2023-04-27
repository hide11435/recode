 class ArrayPracrice02{
    public static void main(String[] args) { //メイン　
        SubClass sub = new SubClass();
        sub.test();
    }
}
 class SuperClass { //クラス
     public SuperClass() { //コンストラクタ
         System.out.println();
     }
    public SuperClass(String val) { //コンストラクタ
        System.out.println(val);
    }
}
 class SubClass extends SuperClass { //クラス
    public void test() { //メソッド
        System.out.println("test");
    }
}