import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FamilyAccount {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        Account account = new Account(10000);
        List<Budget> budgets = new ArrayList<>();
        while (flag) {
            System.out.println("======================家庭收支记账本======================");
            System.out.println("1.收支明细");
            System.out.println("2.登记收入");
            System.out.println("3.登记支出");
            System.out.println("4.退出");

            String menuType = scanner.next();
            char type = menuType.charAt(0);

            if (type == '1') {
                System.out.println("======================当前收入明细记录======================");
                System.out.println("收支          账户金额          收支金额          说明");
                for (Budget budget :
                        budgets) {
                    System.out.println(budget.getType() + "          " + budget.getAmount() + "          " + budget.getMoney() + "          " + budget.getRemark());
                }

            } else if (type == '2') {
                System.out.println("输入收入金额：");
                int money = util.getSccnerInt(scanner);
                System.out.println("输入说明：");
                String remark = scanner.next();
                int amount = account.getAmount() + money;
                Budget budget = new Budget("收入", remark, money, amount);
                account.setAmount(amount);
                budgets.add(budget);
            } else if (type == '3') {
                System.out.println("输入支出金额：");
                int money = util.getSccnerInt(scanner);
                System.out.println("输入说明：");
                String remark = scanner.next();
                int amount = account.getAmount() - money;
                Budget budget = new Budget("支出", remark, money, amount);
                account.setAmount(amount);
                budgets.add(budget);
            } else if (type == '4') {
                flag = false;
            } else {
                System.out.println("输入有误，请重新输入");
            }
        }
    }
}


class Account {
    int amount;

    public Account(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

class Budget {
    String type;
    String remark;
    int money;


    int amount;

    public Budget(String type, String remark, int money, int amount) {
        this.type = type;
        this.remark = remark;
        this.money = money;
        this.amount = amount;
    }

    public Budget(String type, String remark, int money) {
        this.type = type;
        this.remark = remark;
        this.money = money;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}

class util {
    static int getSccnerInt(Scanner scanner) {
        boolean flag = true;
        int money = 0;

        while (flag) {
            try {
                String data = scanner.next();
                money=Integer.parseInt(data);
                flag = false;
            } catch (Exception e) {
                System.out.println("输入有误，请重新输入！！！");
            }

        }
        return money;
    }
}