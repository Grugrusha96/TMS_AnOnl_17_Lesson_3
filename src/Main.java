//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.print("Введите номер месяца - ");
//        Scanner num = new Scanner(System.in);
//        int numberOfMonth = num.nextInt();
//
//        String month = switch(numberOfMonth){
//            case 1 -> "Январь";
//            case 2 -> "Февраль";
//            case 3 -> "Март";
//            case 4 -> "Апрель";
//            case 5 -> "Май";
//            case 6 -> "Июнь";
//            case 7 -> "Июль";
//            case 8 -> "Август";
//            case 9 -> "Сентябрь";
//            case 10 -> "Октябрь";
//            case 11 -> "Ноябрь";
//            case 12 -> "Декабрь";
//
//            default -> null;
//        };
//
//        if(month != null){
//            System.out.println(month + " - ваш месяц под номером " + numberOfMonth);
//        }else System.out.println("Месяца под таким номером не существует! :(");
//
//    }
//}
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.print("Введите номер месяца - ");
//        Scanner num = new Scanner(System.in);
//        int monthNumber = num.nextInt();
//            if(monthNumber == 12) {
//                System.out.println("зима");
//            }else if(monthNumber == 1) {
//                    System.out.println("зима");
//                }else if(monthNumber == 2){
//                        System.out.println("зима");
//            } else if (monthNumber == 3) {
//                        System.out.println("весна");
//                    }else if (monthNumber == 4) {
//                        System.out.println("весна");
//                    }else if (monthNumber == 5) {
//                                System.out.println("весна");
//            } else if (monthNumber == 6) {
//                                System.out.println("лето");
//                            }else if (monthNumber == 7) {
//                                System.out.println("лето");
//                            }else if (monthNumber == 8) {
//                             System.out.println("лето");
//            } else if (monthNumber == 9) {
//                                System.out.println("осень");
//              }else if (monthNumber == 10) {
//                                System.out.println("осень");
//              }else if (monthNumber == 11) {
//                              System.out.println("осень");
//            } else {
//                System.out.println(monthNumber);
//            }
//
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        System.out.print("  |");
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%4d", i);
//        }
//        System.out.println("\n_____________________________________________");
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%2d)", i);
//            for (int j = 1; j <= 10; j++) {
//                System.out.printf("%4d", i * j);
//            }
//            System.out.println();
//        }
//    }
//}
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.print("Введите температуру на улице - ");
//        Scanner scan = new Scanner(System.in);
//        int t = scan.nextInt();
//
//        if(t <= -20){
//            System.out.println("холодно");
//        } else if (t > -20 && t <= -5) {
//            System.out.println("средне");
//        } else if (t > -5) {
//            System.out.println("Тепло");
//        }
//    }
//}
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.print("Введите номер - ");
//        Scanner scan = new Scanner(System.in);
//        int colorNumber = scan.nextInt();
//
//        String color = switch(colorNumber){
//            case 1 -> "Красный";
//            case 2 -> "Оранжевый";
//            case 3 -> "Желтый";
//            case 4 -> "Зеленый";
//            case 5 -> "Голубой";
//            case 6 -> "Синий";
//            case 7 -> "Фиолетовый";
//            default -> null;
//        };
//        if(color != null){
//            System.out.println(color + " - цвет под номером " + colorNumber);
//        }else System.out.println("В радуге всего 7 цветов!");
//
//    }
//}
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите сумму вклада: ");
//        float sum = scan.nextFloat();
//        System.out.print("Введите количество месяцев: ");
//        int month = scan.nextInt();
//        for (int i = 1; i <= month; i++){
//            sum += sum * 0.07;
//        }
//        String formattedSum = String.format("%.2f", sum);
//        System.out.println("Итоговая сумма: " + formattedSum);
//    }
//}
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 99; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}