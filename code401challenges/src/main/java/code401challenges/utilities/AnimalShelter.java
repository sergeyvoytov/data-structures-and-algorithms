package code401challenges.utilities;

import code401challenges.stacksandqueues.Node;

public class AnimalShelter {

    Node<Animal> front;
    Node<Animal> back;

    public AnimalShelter() {
        this.front = null;
        this.back = null;
    }

    public class Animal {

    }

    public class Dog extends Animal {

    }

    public class Cat extends Animal {

    }


    public void enqueue(Animal value) {
        Node new1 = new Node<Animal>(value, null);
        this.back.next = new1;
        this.back = this.back.next;
    }


    public Animal deQueue(Animal name) {
        Node<Animal> current = front;
//        Node<Animal> cnext = current.next;

        //current.class == Cat.class
        if (String.valueOf(this.getClass().getName()) == String.valueOf(Cat.class)) {
            Animal t = current.next.getValue();
            current = current.next.next;
            System.out.println(t);
            System.out.println(current);

            return t;
        }
//            if (current.next.class == Dog.class) {
//                Animal t = current.next;
//                current = current.next.next;
//                return t;
//            }

        if (String.valueOf(this.getClass().getName()) == String.valueOf(Dog.class)) {
            Animal t = current.next.getValue();
            current = current.next.next;
            return t;

        }
        return null;
    }
}



