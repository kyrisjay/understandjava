package practise.javaPra6;

public class company {
    private employee[] all_emp = new employee[10];

    public void addEmp(employee emp) {
        for (int i = 0; i < 10; i++) {
            if (this.all_emp[i] == null) {
                this.all_emp[i] = emp;
            } else {
                System.out.println("公司满员");
            }
        }
    }

    public void del(String name) {
        for (int i = 0; i < 10; i++) {

            if (this.all_emp[i].equals(name)) {
                all_emp[i] = all_emp[i + 1];
            } else {
                System.out.println("没有此员工");
            }
        }
    }
}
