package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pet obj = new Pet(0);
        obj.entry();
        obj.call();
    }
}

class Pet{
    public int index;
    public Map<String, Pet> hashmap = new HashMap<String, Pet>();
    Scanner cout = new Scanner(System.in);
    Pet(int value) { index=value; }
    int get(){ return index; }
    void entry(){
        hashmap.put("Tom", new Pet(1));
        hashmap.put("Sani", new Pet(2));
        System.out.print("Добавьте элемент в список. Напишите ключ и значение: ");
        String name = cout.next();
        int num = cout.nextInt();
        hashmap.put(name, new Pet(num));
    }
    void call(){
        Dog obj1 = new Dog(hashmap);
        Owl obj2 = new Owl(hashmap);
        Cat obj3 = new Cat(hashmap);
        for(Map.Entry<String, Pet> item : hashmap.entrySet()){
          System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().get());
        }
    }
}

class Dog extends Pet{

    Dog(Map <String, Pet> hashmap) {
        super(0);
        hashmap.put("Lolita", new Pet(4));
    }

}
class Owl extends Pet{

    Owl(Map <String, Pet> hashmap) {
        super(0);
        hashmap.put("Leo", new Pet(5));
    }
}

class Cat extends Pet{
    Cat(Map <String, Pet> hashmap) {
        super(0);
        hashmap.put("Murlya", new Pet(3));
    }
}
