package hw.Model;



/*ДЗ к семинару 6: SOLID
 * 
 * Базовый класс  в модели данных - индивиддум с персональными данными.
 * 
 * Какой из принципов SOLID в нем реализован неполностью(не реализован) ?
 * вероятно O - не реализованы абстрактные интерфейсы и методы, которы бы позволили классам
 * наследникам управлять своими функциями более гибко.
 * По другим приципам соображений нет.
 * 
 * 
 * 
 */



//For Model
public class User {
    
    private String FIO;
    private int BirthYear;
    private int tel;

    public User(String fio, int birthy, int tel){
        this.FIO=fio;
        this.BirthYear=birthy;
        this.tel=tel;
    }

    public String getFio(){
        return this.FIO;
    }

    public int GetBirthYear(){
        return this.BirthYear;
    }

    public int GetTel(){
        return this.tel;
    }


    
}
