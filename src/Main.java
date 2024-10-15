import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ввод сторон квадратов
        System.out.println("Введите длины сторон четырех квадратов:");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        // Инициализируем переменную для подсчета прямоугольников
        int rectangles = 0;

        // Проверка всех возможных комбинаций
        if (A == B && B == C && C == D) { // все 4 стороны равны
            rectangles = 3;
        } else if ((A == B && A == C) || (A == C && C == D) || (A == B && B == D) || (B == C && D == B)) { // 3 стороны равны
            rectangles = 2;
            if (((A == B && A == C) || A * 3 == D || A * 2 == D || A == D) ||
                    ((A == C && C == D) || A * 3 == B || A * 2 == B || A == B) ||
                    ((A == B && B == D) || A * 3 == C || A * 2 == C || A == C) ||
                    ((B == C && D == B) || B * 3 == A || 2 * B == A || B == A)) {
                //сумма 3 сторон квадратов равна четвертому / сумма 2х сторон из 3 одинаковых равна 4ому квадрату
                // сторона одного из 3 одинаковых квадратов равна 4ому квадрату
                rectangles += 1;

            } else if (A == B || A == C || A == D || B == C || B == D || C == D) { // 2 стороны равны
                rectangles = 1;
                if ((A == B && C == D) || (A == C && B == D) || (A == D && B == C)) { // попарно 2 стороны равны
                    rectangles += 1;
                    if (((A == B && C == D && (A * 2 == C || C * 2 == A)) ||
                            ((A == C && B == D) && (A * 2 == B || B * 2 == A)) ||
                            ((A == D && B == C) && (A * 2 == B || B * 2 == A)))) { // 2 квадрата = 1 другому квадрату
                        rectangles += 2;
                    }
                } else if ((A == B && (A * 2 == C || A * 2 == D || A == C + D || 2 * A == C + D)
                        || A == C && (A * 2 == B || A * 2 == D || A == B + D || 2 * A == B + D)
                        || A == D && (A * 2 == B || A * 2 == C || A == B + C || 2 * A == B + C)
                        || B == C && (B * 2 == A || B * 2 == D || B == A + D || 2 * B == A + D)
                        || B == D && (B * 2 == A || B * 2 == C || B == A + D || 2 * B == A + D)
                        || C == D && (C * 2 == A || C * 2 == B || C == A + B || 2 * C == A + B))) {
                    //2 одинаковых квадрата = стороне 1 другого квадрата/2 одинаковых квадрата = сумме двух других квадратов
                    // / квадрат из пары одинаковых = сумме двух других квадратов
                    rectangles += 1;
                }
            }

            // Вывод результата
            System.out.println("Можно сложить прямоугольников: " + rectangles);
        }
    }
}