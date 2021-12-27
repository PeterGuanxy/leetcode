package algorithms._1491_average_salary_excluding_the_minimum_and_maximum_salary;

/**
 * ** Created by peter.guan on 2021/12/27.
 *
 * @author peter.guan
 */
public class AverageSalaryExcludingTheMinimumAndMaximumSalary {

    public double average(int[] salary) {

        int sum = 0;
        int min = Math.min(salary[0], salary[1]);
        int max = Math.max(salary[0], salary[1]);
        int curr;
        for (int i = 2; i < salary.length; i++) {
            curr = salary[i];
            if (curr < min) {
                sum += min;
                min = curr;
                continue;
            }

            if (curr > max) {
                sum += max;
                max = curr;
                continue;
            }

            sum += curr;
        }

        return (double)(sum / (salary.length - 2));

    }
}
