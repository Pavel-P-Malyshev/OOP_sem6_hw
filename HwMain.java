package hw;

import java.util.ArrayList;
import java.util.Arrays;


import hw.Model.*;
import hw.Service.*;
import hw.Controller.*;



/*В рамках выполнения ДЗ в семинару 6 в каждом из классов
 * добавлен блок комментариев с заголовком "ДЗ к семинару 6: SOLID" касательно недостатков 
 * текущей реализации
 * в разрезе SOLID  и соображения по улучшению.
 */


public class HwMain {
    public static void main(String[] args) {

        User user1=new User("Ivanov Ivan Ivanovich", 1981, 2361286);
        User user2=new User("Petrov Petr Petrovich", 1977, 2361000);
        User user3=new User("Sidorov Sidor Sidorovich", 1800, 911);
        User user4=new User("Stepanov Stepan Stepanovich", 1900, 02);

        User user6=new User("Ivanv A.A.", 1988, 777);
        User user7=new User("Petrov P.P.", 1970, 999);
        User user8=new User("Sidorov R.R.", 1809, 666);
        User user9=new User("Stepanov S.T.", 1908, 000);

        DataService service=new DataService();
        Controller control=new Controller(service);
        

        control.AddTeacher(user1);
        control.AddStudent(user2);
        control.AddStudent(user3);
        control.AddStudent(user4);

        control.AddTeacher(user6);
        control.AddStudent(user7);
        control.AddStudent(user8);
        control.AddStudent(user9);
        

        Integer[] studentsId1 = {1, 2, 3};
        Integer[] studentsId2 = {4, 5, 6};

        
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(studentsId1));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(studentsId2));

       
        control.AddGroup(1 , list1);
        control.AddGroup(2 , list2);
        
        
        control.ShowAllStudents();
        control.ShowAllTeachers();
        control.ShowAllGroups();

        control.ShowGroupById(1);
        control.ShowStudentById(5);
        control.ShowTeacherById(2);

        control.ShowGroupById(0);
        control.ShowStudentById(0);
        control.ShowTeacherById(0);


        
        
    }
    
}
