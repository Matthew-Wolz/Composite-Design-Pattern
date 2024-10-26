import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department{
    public int id;
    public String name;
    public List<Department> departmentList;

    public HeadDepartment(int id, String name){
        this.id = id;
        this.name = name;
        this.departmentList = new ArrayList<>();
    }

    public void addDepartment(Department dept){
        departmentList.add(dept);
    }

    public void removeDepartment(Department dept){
        departmentList.remove(dept);
    }

    @Override
    public void printDepartmentName(){
        System.out.println(getClass().getSimpleName());
    }
}
