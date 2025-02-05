package org.java.designpattern.creationaldesignpattern.prototype;

import java.util.Hashtable;

public class ProfessionCache {

    public static Hashtable<Integer, Profession> map = new Hashtable();

    public static Profession getCloneNewProfession(int id) throws CloneNotSupportedException {

        Profession cacheProfession = map.get(id);
        return (Profession) cacheProfession.cloningMethod();
    }

    public static void loadProfession() {

        Doctor doc = new Doctor();
        doc.id = 1;
        map.put(doc.id, doc);

        Engineer eng = new Engineer();
        eng.id = 1;
        map.put(eng.id, doc);

        Teacher teach = new Teacher();
        teach.id = 1;
        map.put(doc.id, doc);
    }
}
