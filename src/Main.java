import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ввод сторон квадратов
        System.out.println("Введите длины сторон четырех квадратов:");
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double D = scanner.nextDouble();

        // Инициализируем переменную для подсчета прямоугольников
        double rectangles = 0;

        // Проверка всех возможных комбинаций
        if (D == B && B == C && C == D) { // все 4 стороны равны
            rectangles = 3;
<<<<<<< HEAD
        } else if ((D == B && D == C) || (D == C && C == D) || (D == B && B == D) || (B == C && D == B)) { // 3 стороны равны
            rectangles = 2;
            if (((D == B && D == C) || D * 3 == D || D * 2 == D || D == D) ||
                    ((D == C && C == D) || D * 3 == B || D * 2 == B || D == B) ||
                    ((D == B && B == D) || D * 3 == C || D * 2 == C || D == C) ||
                    ((B == C && D == B) || B * 3 == D || 2 * B == D || B == D)) {
                //сумма 3 сторон квадратов равна четвертому / сумма сторон 2х квадратов из 3 одинаковых = стороне 4ому квадрату
                // сторона одного из 3 одинаковых квадратов равна стороне 4ого квадрату
                rectangles += 1;
            }
        } else if (D == B || D == C || D == D || B == C || B == D || C == D) { // 2 стороны равны
            rectangles = 1;
            if ((D == B && C == D) || (D == C && B == D) || (D == D && B == C)) { // стороны 4х квадратов попарно равны
                rectangles += 1;
                if (((D == B && C == D && (D * 2 == C || C * 2 == D)) ||
                        ((D == C && B == D) && (D * 2 == B || B * 2 == D)) ||
                        ((D == D && B == C) && (D * 2 == B || B * 2 == D)))) { // сумма сторон 2х равных квадратов равна стороне третьего
                    rectangles += 2;
                }
            } else if ((D == B && (D * 2 == C || D * 2 == D)
                        || D == C && (D * 2 == B || D * 2 == D)
                        || D == D && (D * 2 == B || D * 2 == C)
                        || B == C && (B * 2 == D || B * 2 == D)
                        || B == D && (B * 2 == D || B * 2 == C)
                        || C == D && (C * 2 == D || C * 2 == B))) {//2 одинаковых квадрата = стороне 1 другого квадрата
                    rectangles += 1;
                }
            }

            // Вывод результата
            System.out.println("Можно сложить прямоугольников: " + rectangles);

=======
        } else if ((A == B && A == C) || (B == C && D == B)) { // 3 стороны равны
            rectangles = 2;
            if (A == B && A == C || A * 3 == D) {
                rectangles += 1;
            } else if ((B == C && D == B) || (B * 3 == A)) {
                rectangles += 1;
            }
        } else if (A == B || A == C || A == D || B == C || B == D || C == D) { // 2 стороны равны
            rectangles = 1;
            if ((A == B && C == D) || (A == C && B == D) || (A == D && B == C)) { // попарно 2 стороны равны
                rectangles += 1;
                if (((A == B && C == D && (A * 2 == C || C * 2 == A)) ||
                        ((A == C && B == D) && (A * 2 == B || B * 2 == A)) ||
                        ((A == D && B == C) && (A * 2 == B || B * 2 == A))) ) { // 2 квадрата = 1 другому квадрату
                    rectangles += 2;
                }
            }else if((A == B &&(A*2 == C || A*2 == D) || A == C &&(A*2 == B || A*2 == D) || A == D &&(A*2 == B || A*2 == C) || B == C &&(B*2 == A || B*2 == D) || B == D &&(B*2 == A || B*2 == C) || C == D &&(C*2 == A || C*2 == B))){//2 одинаковых квадрата = стороне 1 другого квадрата
                rectangles += 1;
            }
        }

        // Вывод результата
        System.out.println("Можно сложить прямоугольников: " + rectangles);
>>>>>>> parent of d73a384 (Код)
    }
}