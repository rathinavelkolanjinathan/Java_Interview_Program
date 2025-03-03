package org.test.designpattern.creationaldesignpattern.prototype;

public class PrototypeApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        ProfessionCache.loadProfessionCache();
        Profession doc = ProfessionCache.getCloneNewProfession(1);

        System.out.print(doc.toString());
        Profession doc1 = ProfessionCache.getCloneNewProfession(2);

        System.out.print(doc1.toString());
    }
}
