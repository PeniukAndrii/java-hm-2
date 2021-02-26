package AnimalTask;

public class Main {
    public static void main(String[] args){
        // 1.Створити клас Тварина з двома довільними полями. від класу Тварина створити ще два нащадки ,
        // кожен з яких має свій набір додаткових полів, від кожного нащядка ще по 2 нащадки,
        // кожен з яких має додатково по одній характеристиці. Створити по одному елементу кожного типу.
        // Створити масив кожного типу, пофасувати всі елементи по можливих масивах, які підходять їм за типом

        Animal[] animals = new Animal[6];
        animals[0] = new HomeAnimal("Британский", 5, "Масяня");
        animals[1] = new HomeAnimalKind("Хаскі", 7, "Старк", false);
        animals[2] = new HomeAnimalPopular("Алабай", 9, "Ельма", false, true);
        animals[3] = new WildAnimal("Лева",12,"Африка");
        animals[4] = new WildAnimalKind("Тигр",9,"Африка",false);
        animals[5] = new WildAnimalPopulation("Носоріг-Прямостоячий)",999,"Африка",false,10000);

        HomeAnimal[] homeAnimals = new HomeAnimal[3];
        homeAnimals[0] = new HomeAnimal("Британский", 5, "Масяня");
        homeAnimals[1] = new HomeAnimalKind("Хаскі", 7, "Старк", false);
        homeAnimals[2] = new HomeAnimalPopular("Алабай", 9, "Ельма", false, true);

        HomeAnimalKind[] homeAnimalKinds = new HomeAnimalKind[2];
        homeAnimalKinds[0] = new HomeAnimalKind("Хаскі", 7, "Старк", false);
        homeAnimalKinds[1] = new HomeAnimalPopular("Алабай", 9, "Ельма", false, true);

        HomeAnimalPopular[] homeAnimalPopular = new HomeAnimalPopular[1];
        homeAnimalPopular[0] = new HomeAnimalPopular("Алабай", 9, "Ельма", false, true);

        WildAnimal[] wildAnimals = new WildAnimal[3];
        wildAnimals[0] = new WildAnimal("Лева",12,"Африка");
        wildAnimals[1] = new WildAnimalKind("Тигр",9,"Африка",false);
        wildAnimals[2] = new WildAnimalPopulation("Носоріг-Прямостоячий)",999,"Африка",false,10000);

        WildAnimalKind[] wildAnimalKind = new WildAnimalKind[2];
        wildAnimalKind[0] = new WildAnimalKind("Тигр",9,"Африка",false);
        wildAnimalKind[1] = new WildAnimalPopulation("Носоріг-Прямостоячий)",999,"Африка",false,10000);

        WildAnimalPopulation[] wildAnimalPopulation = new WildAnimalPopulation[1];
        wildAnimalPopulation[0] = new WildAnimalPopulation("Носоріг-Прямостоячий)",999,"Африка",false,10000);
    }
}
