public class FinancialDepartment implements Department{
    int id;
    String name;

    public FinancialDepartment(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
