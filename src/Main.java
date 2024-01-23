public class Main {
    public static void main(String[] args) {
    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;
    System.out.println("собак " + dog + " котов " + cat + " рулонов бумаги " + paper);
    dog = dog + 4.0;
    System.out.println("собак " + dog + " шт ");
    cat = cat + 4;
    System.out.println(" котов " + cat + " шт ");
    paper = paper + 4;
    System.out.println("рулонов бумаги " + paper + " шт ");
    dog = dog - 3.5;
    System.out.println("собак осталось " + dog + " шт ");
    cat = cat - 1.6;
    System.out.println("котов осталось " + cat + " шт ");
    paper = paper - 7639;
    System.out.println("рулонов бумаги осталось " + paper + "шт ");

    var friend = 19;
    System.out.println("друзей " + friend);
    friend = friend + 2;
    System.out.println("стало друзей " + friend);
    friend = friend / 7;
    System.out.println("осталось друзей " + friend);

    var frog = 3.5;
    System.out.println(" лягушат " + frog + " шт ");
    frog = frog * 10;
    System.out.println(" лягушат прибавилось до " + frog + " шт ");
    frog = frog / 3.5;
    System.out.println(" много лягушат уплыло и осталось их " + frog + " шт ");
    frog = frog + 4;
    System.out.println(" некотрые вернулись и лягушат осталось " + frog + " шт ");

    var waightBoxer1 = 78.8;
    var waightBoxer2 = 82.7;
    var totalWeight = waightBoxer1 + waightBoxer2;
    System.out.println("общий вес боксеров " + totalWeight + " кг ");
    var differenceWaight = waightBoxer1 - waightBoxer2;
    System.out.println(" разница веса боксеров состваляет " + differenceWaight + " кг ");
    var differenceWaight1 = waightBoxer2 - waightBoxer1;
    System.out.println(" разница веса из большей массы меньшей " + differenceWaight1 + " кг ");
    var differenceBoxer = (waightBoxer2 - waightBoxer1) % totalWeight;
    System.out.println(" разница массы веса между боксерами " + differenceBoxer + " кг ");


    var totaTime = 640;
    var forEachSpecialist = 8;
    var specialist = totaTime / forEachSpecialist;
    System.out.println(" количесвто сотрудников составит " + specialist + " шт ");
    var numberOfSpecialistsFact = specialist + 94;
    System.out.println(" фактическое количество специалситов составляет " + numberOfSpecialistsFact + " человека ");
    var factTimeFoEveryone = totaTime / numberOfSpecialistsFact;
    System.out.println(" рабочего времени на каждого составляет " + factTimeFoEveryone + " часа ");

    }
}