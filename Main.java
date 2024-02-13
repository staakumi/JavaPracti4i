import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.println("Введите ваш текущий вес в килограммах:");
                double weight = input.nextDouble();

                System.out.println("Введите ваш рост в метрах:");
                double height = input.nextDouble();

                System.out.println("Введите ваш возраст:");
                int age = input.nextInt();

                double bmi = weight / (height * height);
                double idealWeight = 24.9 * (height * height);
                double dailyCalories;

                if (bmi > 24.9) {
                    double weightDifference = weight - idealWeight;
                    if (weightDifference > 0) {
                        System.out.println("Рекомендуется снизить вес для достижения идеального веса." +
                                " Идеальный вес: " + idealWeight +
                                " кг. Необходимо сбросить: " + weightDifference + " кг.");
                    } else {
                        System.out.println("Ваш вес находится в пределах нормы.");
                    }
                } else if (bmi < 18.5) {
                    double weightDifference = idealWeight - weight;
                    if (weightDifference > 0) {
                        System.out.println("Рекомендуется увеличить потребление пищи для набора веса." +
                                " Идеальный вес: " + idealWeight +
                                " кг. Необходимо набрать: " + weightDifference + " кг.");
                    } else {
                        System.out.println("Ваш вес находится в пределах нормы.");
                    }
                } else {
                    System.out.println("Ваш вес находится в пределах нормы.");
                }

                // Расчет дневной нормы калорий по формуле Харрисона-Бенедикта
                if (age >= 10 && age <= 17) {
                    dailyCalories = 17.5 * weight + 651;
                } else if (age >= 18 && age <= 29) {
                    dailyCalories = 15.3 * weight + 679;
                } else if (age >= 30 && age <= 59) {
                    dailyCalories = 11.6 * weight + 879;
                } else {
                    dailyCalories = 8.4 * weight + 819;
                }

                System.out.println("Рекомендуемый дневной прием калорий: " + dailyCalories + " ккал.");



                System.out.println("Выберите цель: для похудения введите 'похудение'," +
                        " для набора веса введите 'набор'," +
                        "    для поддержания веса введите 'поддержание':");
                String goal = input.next();

                if (goal.equals("похудение")) {
                    dailyCalories -= 500;
                } else if (goal.equals("набор")) {
                    dailyCalories += 500;
                }

                System.out.println("Рекомендуемый дневной прием калорий: " + dailyCalories + " ккал.");

                input.close();

            }
        }
