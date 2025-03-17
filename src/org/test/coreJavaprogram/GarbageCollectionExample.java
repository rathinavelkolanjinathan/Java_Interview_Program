package org.test.coreJavaprogram;

public class GarbageCollectionExample {
   /* @Override  after 17 they are removed this method
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called. Object is being garbage collected.");
        super.finalize();
    }*/

    public static void main(String[] args) {
        GarbageCollectionExample obj1 = new GarbageCollectionExample();
        GarbageCollectionExample obj2 = new GarbageCollectionExample();

        obj1 = null; // obj1 is now eligible for garbage collection
        obj2 = null; // obj2 is also eligible for garbage collection

        // Suggesting the JVM to perform garbage collection
        System.gc(); // Requesting garbage collection

        // Adding a small delay to allow GC to process
        try {
            Thread.sleep(1000); // Wait to ensure finalize method gets called
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
