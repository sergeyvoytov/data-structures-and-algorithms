package code401challenges.hashtable;

import java.util.LinkedList;

public class Hashtable {

    int size;
    LinkedList<Storage>[] map = new LinkedList[10];

    public Hashtable() {
        this.size = 10;
        for (int i = 0; i < size; i++) {
            this.map[i] = new LinkedList<Storage>();
        }
    }

    //This method should hash the key and add the key and value pair to the table, handling collisions as needed.
//needed//
    public void add(String key, String value) {
        int hashKey = this.hash(key);
        Storage storage = new Storage(key, value);
        this.map[hashKey].add(storage);
    }

    // get: takes in the key and returns the value from the table.
    public String get(String key) {
//        return this.map.get(hashedKey);

        int hashedKey = this.hash(key);
        //we are getting Linked list out of array position
        LinkedList<Storage> llGet = map[hashedKey];

        for (Storage potato : llGet) {
            if (key.equals(potato.getKey())) {
                //what to return
                return potato.getValue();
            }
        }
        return null;
    }

    // contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
    public boolean contains(String key) {

        int hashedKey = this.hash(key);
        //we are getting Linked list out of array position
        LinkedList<Storage> llAtHashIndex = map[hashedKey];
        for (Storage potato : llAtHashIndex) {
            if (key.equals(potato.getKey())) {
                return true;
            }
        }
        return false;
    }

    //  hash: takes in an arbitrary key and returns an index in the collection.
    public int hash(String key) {
        int hashValue = 0;
        for (int i = 0; i < key.length(); i++) {
            hashValue += key.charAt(i);
        }
        hashValue = (hashValue * 1024) % this.size;
        return hashValue;
    }

    @Override
    public String toString() {
        return "Hashtable{" +
                "map=" + map +
                '}';
    }
}




