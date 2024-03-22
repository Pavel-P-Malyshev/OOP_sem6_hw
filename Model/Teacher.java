package hw.Model;

//For Model


/*ДЗ к семинару 6: SOLID
 * 
 * Дочерний класс "преподаватель" в модели данных
 * 
 * Какой из принципов SOLID в нем реализован неполностью(не реализован) ?
 * L - нет наследуемых абстрактных интерфейсов, которые бы позволили свободно
 * взаимозаменять этот класс с родительнским "User" в коде сервисов, просмотрщиков и контроллеров
 *
 * По другим приципам соображений нет.
 * 
 * 
 * 
 * 
 */

public class Teacher extends User {
    private int TeacherId;

    public Teacher(String fio, int birth, int tel, int id){
        super(fio, birth, tel);
        this.TeacherId=id;
    }

    public int getTeachedId(){
        return this.TeacherId;
    }

}
