import animals.*;

class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("ani", 1, 1, 2000);
        Animal c1 = new Cat("mitzi", 20, 05, 2010);
        Animal d1 = new Dog("Rex", 23, 12, 1995);
        Dog d2 = new Dog("Shula", 12, 8, 1975);

        Branch rehovot = new Branch("Ort", "Rehovot");
        rehovot.animals.add(a1);
        rehovot.animals.add(d2);

        Branch jerusalem = new Branch("Ort", "Jerusalem");
        jerusalem.animals.add(d1);
        jerusalem.animals.add(c1);
        System.out.println(rehovot);
        System.out.println(jerusalem);
    }
}
