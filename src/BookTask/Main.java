package BookTask;

public class Main {
    public static void main(String[] args){
        //  2. Cтворити клас ланцюг наслідування:
        //  Папірус-Кинга-Журнал
        //  Папірус-Книга-Комікс
        //  Кількість полів довільна.

        Comic comic = new Comic("Wood",30,"Sponge-Bob");
        Magazin magazin = new Magazin("Wood",10,"News");

        System.out.println(comic);
        System.out.println(magazin);
    }
}
