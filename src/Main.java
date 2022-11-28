public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println(" Задачи (1-3) ");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789.0;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 3.5;
        System.out.println(cat);
        paper = paper - 3.5;
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println(" Задачи (4-5) ");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task3() {
        System.out.println(" Задачи (6-7) ");
        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        var totalWeight = oneBoxer+twoBoxer;
        System.out.println(totalWeight);
        var weightDifference = twoBoxer-oneBoxer;
        System.out.println(weightDifference);
        var weightDifference2 = twoBoxer % oneBoxer;
        System.out.println(weightDifference2);
        System.out.println("Задача 8!");
        var totalTime1 = 640;
        System.out.println("Общее кол-во часов- "+ totalTime1 + " часов ");
        var totalWorkers1 = totalTime1/8;
        System.out.println("Всего сотрудников в комании - " + totalWorkers1 + " человек! ");
        //Если в комании работает на 94 человека больше значит нужно
        var totalWorkers2 = totalWorkers1+94;
        System.out.println(totalWorkers2);
        var totalTime2 = totalTime1/totalWorkers2;
        System.out.println("Если в комании работает "+ totalWorkers2 + " человек, то всего по " + totalTime2 + " часа работы может быть поделено между сотрудниками! ");
    }

}
