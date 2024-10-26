public class main{
    public static void main(String[] args){

        Department salesDepartment = new SalesDepartment(1, "Sales Department");
        Department financialDepartment = new FinancialDepartment(2, "Financial Department");
        Department hrDepartment = new HRDepartment(3, "HR Department");

        HeadDepartment regionalDepartment = new HeadDepartment(4, "Regional Department");

        regionalDepartment.addDepartment(salesDepartment);
        regionalDepartment.addDepartment(financialDepartment);
        regionalDepartment.addDepartment(hrDepartment);

        HeadDepartment headDepartment = new HeadDepartment(5, "Head Department");

        headDepartment.addDepartment(regionalDepartment);

        financialDepartment.printDepartmentName();
        salesDepartment.printDepartmentName();
        hrDepartment.printDepartmentName();
    }
}
