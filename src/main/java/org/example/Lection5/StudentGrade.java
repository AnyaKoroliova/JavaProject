package org.example.Lection5;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введіть оцінку від 1 до 5: ");
        int grade = console.nextInt();

        String message = getGrade(grade);
        System.out.println(message);
    }

    public static String getGrade(int value){
        switch (value) {
            case 1:
                return "Дуже погано";
            case 2:
                return "Погано";
            case 3:
                return "Задовільно";
            case 4:
                return "Добре";
            case 5:
                return "Відмінно";
            default:
                return "Неправильна оцінка";
        }
    }
}
