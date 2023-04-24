package recode;

public class ParsonTest {

    public static void main(String[] args) {

        Person[] Array = new Person[5];
                Array[0] = new Person("tarou", "タロウ", 22);
                Array[1] =new Person("hanako", "ハナコ", 23);
                Array[2] =new Person("ken", "ケン", 24);
                Array[3] =new Person("alice", "アリス", 25);
                Array[4] =new Person("kensuke", "ケンスケ", 26);

                for(int i =0; i < Array.length; i++) {
                    System.out.println(Array[i]);
                }
            }

        }
