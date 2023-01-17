package pro.sky.budgetapp.services.impl;

import org.springframework.stereotype.Service;
import pro.sky.budgetapp.services.BudgetService;

import java.time.LocalDate;

@Service
public class BudgetServiceImpl implements BudgetService {
    public static final int SALARY = 20000;
    public static final int AVG_SALARY = (10000 + 10000 + 10000 + 10000 + 10000 + 15000 + 15000 + 15000 + 15000 + 15000 + 15000 + 20000) / 12;
    public static final double AVG_WORKING_DAYS = 29.3;


    @Override
    public int getDailyBudget() {
        return SALARY / 31;
    }

    @Override
    public int getBalance() {
        return SALARY - LocalDate.now().getDayOfMonth() * getDailyBudget();
    }

    @Override
    public int getVacationBonus(int daysCount) {

        double averageDaysSallary = AVG_SALARY / AVG_WORKING_DAYS;
        return (int) (daysCount * averageDaysSallary);
    }

    @Override
    public int getSalaryWithVacation(int vacationDaysCount, int vacationWorkingDayscount, int workingDaysinMonth) {
        int salary = SALARY / workingDaysinMonth * (workingDaysinMonth - vacationWorkingDayscount);
        return salary+ getVacationBonus(vacationDaysCount);
    }

}
