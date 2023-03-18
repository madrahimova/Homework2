import java.util.Locale;

public class Main {
    public static void call(Class cls, String methodName) throws Exception {
        cls.getDeclaredMethod(methodName).invoke(null);
    }

    public static void main(String[] args) {
        var tasksCount = 8;
        for (var i = 1; i <= tasksCount; i++) {
            try {
                call(Main.class, "task" + i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 0.8;
        var cat = 3.6;
        var paper = 763789;

        System.out.printf(Locale.US, "%.1f %.1f %d\n", dog, cat, paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 0.8;
        var cat = 3.6;
        var paper = 763789;

        dog += 4;
        cat += 4;
        paper += 4;

        System.out.printf(Locale.US, "%.1f %.1f %d\n", dog, cat, paper);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 0.8;
        var cat = 3.6;
        var paper = 763789;

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.printf(Locale.US, "%.1f %.1f %d\n", dog, cat, paper);
    }

    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
    }

    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
    }

    public static void task6 () {
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println(firstBoxerWeight + secondBoxerWeight);
        System.out.println(secondBoxerWeight - firstBoxerWeight);
    }

    public static void task7 () {
        System.out.println("Задача 7");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println(firstBoxerWeight + secondBoxerWeight);
        System.out.println(secondBoxerWeight % firstBoxerWeight);
    }

    public static void task8 () {
        System.out.println("Задача 8");
        var totalHours = 640;
        var hoursPerWorker = 8;
        var workersCount = totalHours / hoursPerWorker;
        System.out.println("Всего работников в компании — " + workersCount + " человек");
        workersCount += 94;
        totalHours = workersCount * hoursPerWorker;
        System.out.println("Если в компании работает " + workersCount + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");
    }
}