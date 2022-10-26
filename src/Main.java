public class Main {
    public static void main(String[] args) {

        // Задание 1
        int age = 14;
        if (age >= 18){
            System.out.println("Поздравляем! Вам испольнилось 18 лет!");
        }

        if (age < 18){
            System.out.println("18 лет еще нет, нужно подождать.");
        }


        // Задание 2
        if (age >= 7 && age < 18 ){
            System.out.println("Ребенок ходит в школу.");
        }

        if (age >= 18 && age < 24 ){
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        }

        if (age >= 24){
            System.out.println("Человек окончил университет, и ему пора искать первую работу.");
        }


        // Задание 3
        int passengers = 40;
        int capacity = 102;
        int seats = 60;
        if (passengers < seats){
            System.out.println("В вагоне есть сидячие места");
        }

        if (passengers >= seats && passengers < capacity){
            System.out.println("В вагоне есть стоячие места.");
        }

        if (passengers >= capacity){
            System.out.println("Вагон полон.");
        }


        // Задание 4
        if (age >= 18){
            System.out.println("Поздравляем! Вам исполнилось 18 лет!");
        } else {
            System.out.println("18 лет еще нет, нужно подождать.");
        }


        // Задание 5
        if (age >= 24){
            System.out.println("Человек уже закончил университет, и ему пора искать первую работу.");
        } else if (age < 24 && age >= 18 ) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (age >= 7) {
            System.out.println("ребенок ходит в школу");
        }

        // Задание 6
        if (passengers >= capacity){
            System.out.println("Вагон полон.");
        } else if (passengers < seats){
            System.out.println("В вагоне есть сидячие места.");
        } else if (passengers >= seats && passengers < capacity){
            System.out.println("В вагоне есть стоячие места.");
        }

        // Задание 7
        if (age >= 2 && age <= 6){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >=7 && age <= 18){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age > 18 && age < 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }

        // Задание 8
        if (age < 5) {
            System.out.println("Ребенок не может кататься на аттракционе.");
        } else if (age >= 5 && age < 14){
            System.out.println("Ребенок может кататься в сопровождении взрослого.");
        } else {
            System.out.println("Ребенок может кататься без сопровождения взрослого.");
        }

        // Задание 9
        int one = 1;
        int two = 10;
        int free = 10;
        if (one >= two && one >= free){
            System.out.println(one);
        } else if (two >= one && two >= free){
            System.out.println(two);
        } else {
            System.out.println(free);
        }
    }



}