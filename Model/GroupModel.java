package hw.Model;

import java.util.List;


// Задача 1 - Data/model
// � Создать package – model. Работу продолжаем в нем
// � Реализовать абстрактный класс User и его наследники Student и Teacher. 
// Родитель имеет в себе общие данные (пример: фио, год рождения и тд), а
// наследники собственные параметры (какие, по вашему выбору – Пример: 
// studentId для Student, teacherId для Teacher)


/*ДЗ к семинару 6: SOLID
 * 
 *  класс "Группа" в модели данных
 * 
 * Какой из принципов SOLID в нем реализован неполностью(не реализован) ?
 * вероятно O - не реализованы абстрактные интерфейсы и методы, которы бы позволили классам
 * наследникам управлять своими функциями более гибко.
 * По другим приципам соображений нет.
 * 
 * 
 * 
 * 
 */

public class GroupModel {

   private Teacher teacher;
   private List<Student> students;
   private int groupId;

   public GroupModel(Teacher teacher, List<Student> students, int id)
    {
        this.teacher=teacher;
        this.students=students;
        this.groupId=id;

    }

    public int getGroupId(){
        return this.groupId;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }

    public List<Student> getStudents(){
        return this.students;
    }

    
}
