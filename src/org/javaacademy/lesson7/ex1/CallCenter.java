package org.javaacademy.lesson7.ex1;

public class CallCenter {

    /**
     * Сделать звонок - функция высшего порядка
     * CallScript - функция низшего порядка
     */
    public void call(CallScript callScript) {
        System.out.println("Здравствуйте!");
        //Исполняем функцию
        callScript.readScript();
    }
}