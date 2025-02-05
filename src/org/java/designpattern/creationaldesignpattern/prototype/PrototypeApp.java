package org.java.designpattern.creationaldesignpattern.prototype;

public class PrototypeApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        ProfessionCache.loadProfession();
        Profession doc =ProfessionCache.getCloneNewProfession(1);

        System.out.print(doc);
        Profession doc1 =ProfessionCache.getCloneNewProfession(2);

        System.out.print(doc1);
    }
}
