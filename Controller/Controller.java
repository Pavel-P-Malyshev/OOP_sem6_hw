package hw.Controller;

import hw.Service.DataService;
import hw.View.GroupView;
import hw.View.StudentView;
import hw.View.TeacherView;
import hw.Model.*;

import java.util.ArrayList;
import java.util.List;


// Создать package – controller. Работу продолжаем в нем
// � Создать класс Controller агрегирующий в себе необходимые классы в виде
// полей, а инициализируем прям в поле.
// � Создаем метод созданиеСтудента – реализующий логику, путем вызова
// соответствующих методов интерфейсов:
// � Создания Студента в сервисе
// � Возвращение всех студентов в сервисе
// � Вызов view и передача списка найденных студентов

//— Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id)
// и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;


/*ДЗ к семинару 6: SOLID
 * 
 *  класс "Контроллер" в разделе контроллеров, фактически релизует функции Presenter
 * 
 * 
 * Какой из принципов SOLID в нем реализован неполностью(не реализован) ?
 * S - вынести фунционал просмотра различных опций группы, студента и преподавателя в отдельные 
 * классы с возможностью более гибкого задания опций, например:
 * - различные сортировки внутри группы
 * - сортировка групп по количеству учащихся
 * - принадлежность преподавателя разным группам одновременно
 * - принадлежность студента разным группам одновременно
 * - ...
 * 
 * По другим приципам соображений нет.
 * 
 * 
 * 
 * 
 */



public class Controller {

    private DataService service;
    public Controller(DataService service){
        this.service=service;

    }

    public void AddStudent(User user){
        service.CreateStudent(user);
    }

    public void AddTeacher(User user){
        service.CreateTeacher(user);
    }

    public void AddGroup(int teacherId, List<Integer> studentsIdList){
        Teacher Selectedteacher=service.GetTeachers().getFirst();
        List<Student> selectedStudents=new ArrayList<>();

        for (Teacher teacher : service.GetTeachers()) {
            if(teacher.getTeachedId()==teacherId){
                Selectedteacher=teacher;
            }
        }

        for (Student student : service.GetStudents()) {
            if(studentsIdList.contains(student.getStudentId())) {
                  selectedStudents.add(student);
            }
        }

        service.createGroup(Selectedteacher, selectedStudents);
    }

    public void ShowStudentById(int id){
        StudentView Sview = new StudentView();
        boolean found=false;
        System.out.println("\n");
        System.out.println("For student identity "+id+" the following info is found: ");
        for (Student student : service.GetStudents())
         {
            if(student.getStudentId()==id)
            {
            Sview.PrintStudentInfo(student);
            found=true;
            }
            
        }
        if(!found) System.out.println("No student with such identity is found!");

    }

    public void ShowTeacherById(int id)
    {
        TeacherView Tview = new TeacherView();
        boolean found=false;
        System.out.println("\n");
        System.out.println("For teacher identity "+id+" the following info is found: ");

        for (Teacher teacher :service.GetTeachers()) 
        {
            if(teacher.getTeachedId()==id){
            Tview.PrintTeacherInfo(teacher);
            found=true;
            }
            
        }
        if(!found) System.out.println("No teacher with such identity is found!");
    }

    public void ShowGroupById(int id)
    {
        GroupView Gview = new GroupView();
        boolean found=false;
        System.out.println("\n");
        System.out.println("For group identity "+id+" the following info is found: ");

        for (GroupModel group : service.GetGroups()) 
        {
            if(group.getGroupId()==id){
            Gview.PrintGroupInfo(group);
            found=true;
            }
            
        }
        if(!found) System.out.println("No Group with such identity is found!");


    }


    

     public void ShowAllStudents(){
        StudentView Sview = new StudentView();
        System.out.println("\n");
        System.out.println("Totally we have "+service.GetStudents().size()+" students joined now:");
        for (Student student : service.GetStudents()) {
            Sview.PrintStudentInfo(student);
            
        }
    }

    public void ShowAllTeachers(){
        TeacherView Sview = new TeacherView();
        System.out.println("\n");
        System.out.println("Totally we have "+service.GetTeachers().size()+" teachers joined now:");
        for (Teacher teacher :service.GetTeachers()) {
            Sview.PrintTeacherInfo(teacher);
            
        }
    }

    public void ShowAllGroups(){
        GroupView Gview=new GroupView();
        System.out.println("\n");
        System.out.println("Totally we have "+service.GetGroups().size()+" formed groups now:");
        for (GroupModel group : service.GetGroups()) {
            Gview.PrintGroupInfo(group);
            
        }
    }


    
}
