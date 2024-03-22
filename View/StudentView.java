package hw.View;
import hw.Model.*;

// Создать package – view. Работу продолжаем в нем
// � Создать класс StudentView, содержащий в себе метод вывода в консоль
// данных студента поданных на вход


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
public class StudentView {

    public void PrintStudentInfo(Student student){
        System.out.println("Information about StudentID "+student.getStudentId()+" : ");
        System.out.println(student.getFio()+" , "+student.GetBirthYear()+" , "+student.GetTel());
    }
    
}
