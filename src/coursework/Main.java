package coursework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class Main {
    static Employee[] arr = new Employee[10];
   /* private static int getMin(Employee[] arr) {
        int min = Integer.MAX_VALUE;
        for (Employee employee : arr) {
            min = Math.min(min, employee.getSalary());
        }
        return min;
    }*/

    /*private static int getMax(Employee[] arr) {
        int max = Integer.MIN_VALUE;
        for (Employee employee : arr) {
            max = Math.max(max, employee.getSalary());
        }
        return max;
    }*/

   /* private static void fioWorkers() {
        for (Employee employee : arr) {
            System.out.println(employee.getFIO());
        }
    }*/

    private static int getSum(Employee[] arr) {
        int sum = 0;
        for (Employee employee : arr) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static void workers(Employee[] arr) {
        int i = 0;
        for (Employee wk : arr) {
            wk = arr[i];
            i++;
            System.out.println(wk);
        }
    }

    private static int getAvg(Employee[] arr) {
        var sum = getSum(arr);
        return sum / arr.length;
    }

    private static void workersFio(Employee[] arr) {
        Stream<Employee> employeeStream = Stream.of(arr);
        employeeStream
                .map(Employee::getFIO)
                .forEach(System.out::println);
    }

    private static void maxSal(Employee[] arr) {
        Employee maxSal = Arrays.stream(arr)
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSal);
    }

    private static void minSal(Employee[] arr) {
        Employee minSal = Arrays.stream(arr)
                .min(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);
        System.out.println("Сотрудник с минимальной зарплатой: " + minSal);
    }


    public static void main(String[] args) {
        Employee worker1 = new Employee("Иванов Иван Иванович", 1, 21624);
        arr[0] = worker1;

        Employee worker2 = new Employee("Криворучко Павел Олегович", 2, 56214);
        arr[1] = worker2;

        Employee worker3 = new Employee("Павлов Фёдор Игоревич", 3, 226548);
        arr[2] = worker3;

        Employee worker4 = new Employee("Болотов Роман Андреевич", 4, 94567);
        arr[3] = worker4;

        Employee worker5 = new Employee("Круглов Глеб Викторович", 5, 189435);
        arr[4] = worker5;

        Employee worker6 = new Employee("Травин Олег Олегович", 5, 245763);
        arr[5] = worker6;

        Employee worker7 = new Employee("Бабин Алексей Семёнович", 4, 11111);
        arr[6] = worker7;

        Employee worker8 = new Employee("Пивоваров Михаил Валентинович", 3, 64521);
        arr[7] = worker8;

        Employee worker9 = new Employee("Косых Лаврентий Павлинович", 2, 123456);
        arr[8] = worker9;

        Employee worker10 = new Employee("Ягодкин Ярослав Ярославович", 1, 99465);
        arr[9] = worker10;


        workers(arr);
        System.out.println();
        System.out.println("Сумма затрат на выплаты в месяц: " + getSum(arr));
        System.out.println("Среднее значение зарплат: " + getAvg(arr));
        System.out.println();
        maxSal(arr);
        System.out.println();
        minSal(arr);
        System.out.println();
        workersFio(arr);
        System.out.println();
        // System.out.println("Сотрудник с минимальной зарплатой: " + getMin(arr));
        // System.out.println("Сотрудник с максимальной зарплатой: " + getMax(arr));
        // fioWorkers();


    }

}


