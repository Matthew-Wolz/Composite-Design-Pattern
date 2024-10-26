public class HRDepartment implements Department{
    int id;
    String name;
    
    public HRDepartment(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDepartmentName(){
        System.out.println(getClass().getSimpleName());
    }

}
