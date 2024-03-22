package hw.View;
import java.util.List;


import hw.Model.*;


/*ДЗ к семинару 6: SOLID
 * 
 *  класс "Просмотр студента" в разделе просмотрщиков
 * 
 * Какой из принципов SOLID в нем реализован неполностью(не реализован) ?
 * вероятно I - не унаследлваны абстрактные интрефейсы, чтобы можно было вызывать 
 * распечатку данных единой конмадой, перегруженной индивидуально в своем классе.
 * По другим приципам соображений нет.
 * 
 * 
 * 
 * 
 */

public class GroupView {

    public void PrintGroupInfo(GroupModel group){
        TeacherView tView = new TeacherView();
        StudentView sView= new StudentView();

        System.out.println("\n");
        System.out.println("Group "+group.getGroupId()+" includes: ");
        System.out.println("\n");
        System.out.println("Teachers:");
        tView.PrintTeacherInfo(group.getTeacher());
        System.out.println("\n");
        System.out.println("Students:");
        List<Student> slist=group.getStudents();

        for (Student student : slist) {
            sView.PrintStudentInfo(student);           
        }

        
    }
    
}
