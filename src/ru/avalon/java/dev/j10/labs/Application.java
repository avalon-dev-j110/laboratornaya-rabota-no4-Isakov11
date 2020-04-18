package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;
import ru.avalon.java.dev.j10.commons.*;
import java.time.*;

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

        Person[] persons = {new PersonImpl ("Adam Smith", LocalDate.of(1984,1,14)),
                            new PersonImpl ("Oswald",  LocalDate.of(1996,2,7)),                
                            new PersonImpl ("John Dow",  LocalDate.of(1989,2,3)),
                            new PersonImpl ("Alice",  LocalDate.of(2000,7,16)),
                            new PersonImpl ("Hazel",  LocalDate.of(1997,8,5)),                                
                            new PersonImpl ("Isaac",  LocalDate.of(1991,4,6)),                               
                            new PersonImpl ("Bob",  LocalDate.of(1980,4,16)),
                            new PersonImpl ("Tanya",  LocalDate.of(1993,02,7)),
                            new PersonImpl ("Naomi",  LocalDate.of(2001,6,6)),                                
                            new PersonImpl ("Felix",  LocalDate.of(1985,7,4)),
                            new PersonImpl ("Adam Smith",  LocalDate.of(1983,06,29)),
                            new PersonImpl ("Laurence",  LocalDate.of(1988,12,26)),                                
                            new PersonImpl ("Artur",  LocalDate.of(1989,5,1)),
                            new PersonImpl ("David",  LocalDate.of(1990,6,2)),
                            new PersonImpl ("Eva",  LocalDate.of(2003,1,29)),
                            new PersonImpl ("Boris",  LocalDate.of(1992,2,3)),
                            new PersonImpl ("Mable",  LocalDate.of(1994,3,4)),
                            new PersonImpl ("George",  LocalDate.of(1992,4,5)),
                            new PersonImpl ("Robert",  LocalDate.of(1995,5,6)),
                            new PersonImpl ("Eva",  LocalDate.of(1986,8,9))
                           };
        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */    
        Sort sort = new SortImpl();
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
        System.out.println("gd");
    }
}
