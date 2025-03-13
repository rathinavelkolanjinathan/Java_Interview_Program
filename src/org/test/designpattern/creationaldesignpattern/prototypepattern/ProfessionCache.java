package org.test.designpattern.creationaldesignpattern.prototypepattern;

import java.util.Hashtable;

public class ProfessionCache {

    public static Hashtable<Integer, Profession> map = new Hashtable();

    public static Profession getCloneNewProfession(int id) throws CloneNotSupportedException {

        Profession cacheProfession = map.get(id);
        return (Profession) cacheProfession.cloningMethod();
    }

    public static void loadProfessionCache() {

        Doctor doc = new Doctor();
        doc.id = 1;
        map.put(doc.id, doc);

        Engineer eng = new Engineer();
        eng.id = 2;
        map.put(eng.id, doc);

        Teacher teach = new Teacher();
        teach.id = 3;
        map.put(doc.id, doc);
    }
}
