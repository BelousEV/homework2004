public class Main {
    public static void main(String[] args) {
        // 1 задание

        byte a = 1;
        short b = 300;
        int c = 15;
        long f = 2000L;
        float bananaWeight = 8.9f;
        double appleWeight = 4.5;
        char h = 52;
        int age = 22;
        boolean q = c >= 55;
        System.out.println(bananaWeight);
        System.out.println(h);
        System.out.println(q);

        //2 Задание

        float oneBoxWeight = 78.2f; //вес первого боксера
        float twoBoxWeight = 82.7f; //вес второго боксера
        System.out.println("Общий вес двух бойцов " + (oneBoxWeight+twoBoxWeight) + " кг");
        System.out.println("Разница веса между двумя боксерами " + (twoBoxWeight-oneBoxWeight) + " кг.");

        // 3 Задание

        int onePortionBananas = 80;
        int bananasWeight = onePortionBananas*5; // 5 бананов по 80 гр.
        int milkVolume = 100; //100 мл молока
        int milkWeight = (int) (milkVolume * 1.05 * 2); // 105 гр. молока
        int iceCream = 100; // 1 брикет мороженого 100 гр.
        int iceCreamWeight = (int) (iceCream * 2); // 200 гр. мороженого
        int eggs = 70; // 1 яйцо 70 гр.
        int eggsWeight = (int) (eggs * 4); // 4 яйца
        int result = bananasWeight+milkWeight+iceCreamWeight+eggsWeight;
        System.out.println(milkWeight);
        System.out.println("Вес завтрака составляет " + result  + " гр." ); //вес завтрака в граммах
        float breakfast = result / 1000f;
        System.out.println("Вес завтрака составляет " + breakfast  + " кг." ); //вес завтрака в кг.


        // 4 Задание
        int weight = 7; // Общий вес в кг, который нужно сбросить
        int weightGramm = 7 * 1000; // общий вес в граммах, которых нужно сбросить
        int dayA = 250; // 250 грамм
        int dayB = 500; // 500 грамм
        int resultA = weightGramm/250;
        System.out.println("Если терять по 250 грамм, необходимо "+ resultA+" дней");
        int resultB = weightGramm/500;
        System.out.println("Если терять по 500 грамм, необходимо "+ resultB+" дней");
        int resultC = (resultA+resultB)/2;
        System.out.println("В среднем понадобится,  "+ resultC+" день");


        // 5 задание

        int masha = 67_760;
        int denis = 83_690;
        int kris = 76_230;
        int mashaPov = masha * 10 / 100; // сумма повышения зп Марии
        int denisPov = denis * 10 / 100; // сумма повышения зп Дениса
        int krisPov = kris * 10 / 100; // сумма повышения зп Кристины
        int mashaOld = masha*12; //старая зп Маши
        int mashaNew = (masha + mashaPov) * 12; // новая зп Маши с повышением
        int denisOld = denis*12; //старая зп Дениса
        int denisNew = (denis + denisPov) * 12; // новая зп Дениса с повышением
        int krisOld = kris*12; //старая зп Кристины
        int krisNew = (kris + krisPov) * 12; // новая зп Кристины с повышением
        System.out.println("Маша теперь получает " + mashaNew + " Годовой доход вырос на "+ (mashaNew-mashaOld));
        System.out.println("Денис теперь получает "+ denisNew + " Годовой доход вырос на "+ (denisNew-denisOld));
        System.out.println("Кристина теперь получает " + krisNew + " Годовой доход вырос на " + (denisNew-denisOld));

























    }
}