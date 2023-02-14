package coursework;

public class Main {
    private static int getMin(Employee[] arr) {
        int min = Integer.MAX_VALUE;
        for (Employee employee : arr) {
            min = Math.min(min, employee.getSalary());
        }
        return min;
    }

    private static int getMax(Employee[] arr) {
        int max = Integer.MIN_VALUE;
        for (Employee employee : arr) {
            max = Math.max(max, employee.getSalary());
        }
        return max;
    }

    private static int getSum(Employee[] arr) {
        int sum = 0;
        for (Employee employee : arr) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static void workers(Employee[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.println(arr[i] + " ");
            i++;
        }
    }


    private static int getAvg(Employee[] arr) {
        int sum = 0;
        for (Employee employee : arr) {
            sum += employee.getSalary();
        }
        int avg = sum / arr.length;
        return avg;
    }

    public static void main(String[] args) {
        Employee[] arr = new Employee[10];

        Employee worker1 = new Employee("Иван", "Иванович", "Иванов", 1, 21624);
        arr[0] = worker1;

        Employee worker2 = new Employee("Павел", "Олегович", "Криворучко", 2, 56214);
        arr[1] = worker2;

        Employee worker3 = new Employee("Фёдор", "Игоревич", "Павлов", 3, 226548);
        arr[2] = worker3;

        Employee worker4 = new Employee("Роман", "Андреевич", "Болотов", 4, 94567);
        arr[3] = worker4;

        Employee worker5 = new Employee("Глеб", "Викторович", "Круглов", 5, 189435);
        arr[4] = worker5;

        Employee worker6 = new Employee("Олег", "Олегович", "Травин", 5, 245763);
        arr[5] = worker6;

        Employee worker7 = new Employee("Алексей", "Семёнович", "Бабин", 4, 11111);
        arr[6] = worker7;

        Employee worker8 = new Employee("Михаил", "Валентинович", "Пивоваров", 3, 64521);
        arr[7] = worker8;

        Employee worker9 = new Employee("Лаврентий", "Павлинович", "Косых", 2, 123456);
        arr[8] = worker9;

        Employee worker10 = new Employee("Ярослав", "Ярославович", "Ягодкин", 1, 99465);
        arr[9] = worker10;


        workers(arr);
        System.out.println();
        System.out.println("Сумма затрат на выплаты в месяц: " + getSum(arr));
        System.out.println("Сотрудник с минимальной зарплатой: " + getMin(arr));
        System.out.println("Сотрудник с минимальной зарплатой: " + getMax(arr));
        System.out.println("Среднее значение зарплат: "+getAvg(arr));


    }

}


