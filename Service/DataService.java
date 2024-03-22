package hw.Service;

import java.util.ArrayList;
import java.util.List;

import hw.Model.GroupModel;
import hw.Model.Student;
import hw.Model.Teacher;
import hw.Model.User;


// Создать класс DataService с методами в по управлению сущностями User 
// (create, read) и агрегирующий всех пользователей заведенных в системе
// � StudentId должны быть созданы по алгоритму – максимальный id в
// коллекции + 1. Аналогично и для TeacherId. Здесь решение через перебор
// элементов и instanceOf


/*ДЗ к семинару 6: SOLID
 * 
 *  класс "Сервис" в разделе сервисов
 * 
 * Какой из принципов SOLID в нем реализован неполностью(не реализован) ?
 * S - верятно функционал "агрегации" заведенных пользователей можно выполнить более гибко, 
 * выделив его в отдельные классы с опциями сохранения в разные хранилища (файл, БД, ресурс)
 * 
 * По другим приципам соображений нет.
 * 
 * 
 * 
 * 
 */
public class DataService {

    List<Student> Slist=new ArrayList<>();
    List<Teacher> Tlist=new ArrayList<>();
    List<GroupModel> groupsList=new ArrayList<>();


    public void CreateStudent(User user){
           
        int id=1;
        if (!Slist.isEmpty()){
            id=Slist.getLast().getStudentId()+1;
        }

        User newUser=new Student(user.getFio(), user.GetBirthYear(),user.GetTel(),id);
        Slist.add((Student)newUser);       
    }

    public void CreateTeacher(User user){
           
        int id=1;
        if (!Tlist.isEmpty()){
            id=Tlist.getLast().getTeachedId()+1;
        }

        User newUser=new Teacher(user.getFio(), user.GetBirthYear(),user.GetTel(),id);
        Tlist.add((Teacher)newUser);       
    }

    public void createGroup(Teacher teacher, List<Student> list){
        int id=1;
        if (!groupsList.isEmpty()){
            id=groupsList.getLast().getGroupId()+1;
        }
        GroupModel newGroup = new GroupModel(teacher, list,id);
        groupsList.add(newGroup);

    }

    

    public List<Student> GetStudents(){
        return Slist;
    }

    public List<Teacher> GetTeachers(){
        return Tlist;
    }

    public List<GroupModel> GetGroups(){
        return groupsList;
    }




    
}
