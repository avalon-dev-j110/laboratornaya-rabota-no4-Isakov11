package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;
import ru.avalon.java.dev.j10.commons.*;
import java.util.Date;
public class Application {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	String[] strings = {"The", "Fairmount", "Parkway", "a", "grand", "boulevard", "that", "cut", "diagonally", "across", 
        "the", "grid", "of", "city", "streets", "was", "designed", "to", "terminate", "at"};
	/*
	 * TODO(Студент): Проинициализируйте массив persons
	 *
	 * 1.  Создайте класс, реализующий интерфейс Person.
	 *
	 * 2. Проинициализируйте массив persons 20
	 *    экземплярыми созданного класса.
	 */                        
	Person[] persons = {new ClassPerson ("Adam Smith", new Date(1984,1,14)),
                            new ClassPerson ("Oswald", new Date(1996,2,7)),                
                            new ClassPerson ("John Dow", new Date(1989,2,3)),
                            new ClassPerson ("Alice", new Date(2000,7,16)),
                            new ClassPerson ("Hazel", new Date(1997,8,5)),                                
                            new ClassPerson ("Isaac", new Date(1991,4,6)),                               
                            new ClassPerson ("Bob", new Date(1980,4,16)),
                            new ClassPerson ("Tanya", new Date(1993,02,7)),
                            new ClassPerson ("Naomi", new Date(2001,6,6)),                                
                            new ClassPerson ("Felix", new Date(1985,7,4)),
                            new ClassPerson ("Adam Smith", new Date(1983,06,29)),
                            new ClassPerson ("Laurence", new Date(1988,12,26)),                                
                            new ClassPerson ("Artur", new Date(1989,5,1)),
                            new ClassPerson ("David", new Date(1990,6,2)),
                            new ClassPerson ("Eva", new Date(2003,1,29)),
                            new ClassPerson ("Boris", new Date(1992,2,3)),
                            new ClassPerson ("Mable", new Date(1994,3,4)),
                            new ClassPerson ("George", new Date(1992,4,5)),
                            new ClassPerson ("Robert", new Date(1995,5,6)),
                            new ClassPerson ("Eva", new Date(1986,8,9))
                           };
        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new ClassSort();
        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comparator = new StringComparator();
        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(persons);
        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);
        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, comparator.reversed());     
    }
}
