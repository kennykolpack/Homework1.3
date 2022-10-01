public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать...");
        }
        // Задача 2
        System.out.println("Задача 2");
        int age1 = 14;
        if (age1 >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        int age2 = 20;
        if (age2 >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        int age3 = 26;
        if (age3 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        // Задача 3
        System.out.println("Задача 3");
        int wagonCapacity = 102;
        int seats = 60;
        int standingRoom = wagonCapacity - seats;
        int seatsTaken = 26;
        int standingRoomTaken = 11;
        if (standingRoomTaken >= standingRoom && seatsTaken >= seats) {
            System.out.println("Все места переполнены");
        }
        int seatsAvailable = seats - seatsTaken;
        if (seatsAvailable > 0) {
            System.out.println("В вагоне осталось " + seatsAvailable + " сидячих мест");
        }
        int standingRoomAvailable = standingRoom - standingRoomTaken;
        if (standingRoomAvailable > 0) {
            System.out.println("В вагоне осталось " + standingRoomAvailable + " стоячих мест");
        }
        // Домашнее задание 2
        System.out.println("Домашнее задание 2");
        // Задача 1
        System.out.println("Задача 1");
        int age_2 = 17;
        if (age_2 >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать...");
        }
        // Задача 2
        System.out.println("Задача 2");
        int age1_2 = 24;
        if (age1_2 >= 7 && age1_2 < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age1_2 >= 18 && age1_2 < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (age1_2 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        // Задача 3
        System.out.println("Задача 3");
        int wagonCapacity_2 = 102;
        int seats_2 = 60;
        int standingRoom_2 = wagonCapacity_2 - seats_2;
        int seatsTaken_2 = 60;
        int standingRoomTaken_2 = 42;
        int seatsAvailable_2 = seats_2 - seatsTaken_2;
        if (seatsAvailable_2 > 0) {
            System.out.println("В вагоне осталось " + seatsAvailable_2 + " сидячих мест");
        } else {
            System.out.println("В вагоне не осталось сидячих мест");
        }
        int standingRoomAvailable_2 = standingRoom_2 - standingRoomTaken_2;
        if (standingRoomAvailable_2 > 0) {
            System.out.println("В вагоне осталось " + standingRoomAvailable_2 + " стоячих мест");
        } else {
            System.out.println("В вагоне не осталось стоячих мест");
        }
        // Домашнее задание 3
        System.out.println("Домашнее задание 3");
        // Задача 1
        System.out.println("Задача 1");
        int age_3 = 15;
        if (age >= 2 && age_3 <= 6) {
            System.out.println("Если возраст человека равен " + age_3 + ", то ему нужно ходить в детский сад");
        } else if (age_3 >= 7 && age_3 <= 18) {
            System.out.println("Если возраст человека равен " + age_3 + ", то ему нужно ходить в школу");
        } else if (age_3 > 18 && age_3 < 24) {
            System.out.println("Если возраст человека равен " + age_3 + ", то ему нужно ходить в университет");
        } else if (age_3 > 24) {
            System.out.println("Если возраст человека равен " + age_3 + ", то ему нужно ходить на работу");
        }
        // Задача 2
        System.out.println("Задача 2");
        int age_4 = 16;
        if (age_4 < 5) {
            System.out.println("Если ребенку " + age_4 + " год(а), то он не может кататься на аттракционе");
        } else if (age_4 > 5 && age_4 < 14) {
            System.out.println("Если ребенку " + age_4 + " лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Если ребенку " + age_4 + " лет, то он может кататься без сопровождения взрослого");
        }
        // Задача 3
        System.out.println("Задача 3");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше чем " + two + " и " + three);
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " больше чем " + one + " и " + three);
        } else {
            System.out.println("Число " + three + " больше чем " + one + " и " + two);
        }
    }
}