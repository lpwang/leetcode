/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

// N叉树的遍历的解法

class 690_Solution {
    public int getImportance(List<Employee> employees, int id) {
        Employee targetEmployee = findE(employees,id);
        return helper(employees,targetEmployee);
    }

    private int helper (List<Employee> employees,Employee targetEmployee) {
        
        if (targetEmployee != null) {
            if (targetEmployee.subordinates.isEmpty()) {
                return targetEmployee.importance;
            }
            int targetSum = targetEmployee.importance;    
            for (int i=0;i<targetEmployee.subordinates.size();i++) {
                targetSum += helper(employees,findE(employees,targetEmployee.subordinates.get(i)));
            }
            return targetSum;
        }
        return 0;
    }

    private Employee findE (List<Employee> employees, int id) {
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee.id == id) {
                targetEmployee = employee;
                break;
            }
        }
        return targetEmployee;
    }
}