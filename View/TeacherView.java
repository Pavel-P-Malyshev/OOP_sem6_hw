package hw.View;
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
public class TeacherView {
    public void PrintTeacherInfo(Teacher teacher){
        System.out.println("Information about TeacherID "+teacher.getTeachedId()+" : ");
        System.out.println(teacher.getFio()+" , "+teacher.GetBirthYear()+" , "+teacher.GetTel());
    }
}
