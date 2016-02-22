package com;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Refleksi {
    public void refl() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class userClass = Class.forName(MyUser.class.getName());
        Object ob1 = userClass.newInstance();
        System.out.println(ob1);

        Constructor[] constructors = userClass.getDeclaredConstructors();
        int count = 1;
        for (Constructor constructor : constructors) {
            System.out.println("Constructor number #" + count++);
            System.out.println("Name ->" + constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType());
            }
            int modifiers = constructor.getModifiers();
            System.out.println(modifiers);
        }

        Constructor conctructor1 = userClass.getDeclaredConstructor(String.class, int.class);
        Object ob2 = conctructor1.newInstance("testName", 1);//смотри - здесь ты создаешь объект какого типа? -
        //исходя из того, что ты берешь "каркас"/метаданные для MyUser.class.getName()), то и объект в 30 строчке ты будешь получать
        //именно типа MyUser - согласен?да
        // в 35 строчке ты проверяешь, является ли созданный объект ob2 -> представителем MyUser [ if (ob2 instanceof MyUser) {]
        System.out.println(ob2);
        if (ob2 instanceof MyUser) {
            //в случае, если ob2 действительно MyUser "представитель"/объект/инстанс, то можем сделать нисходящий кастинг, то-есть
            //от родителя к ребенку <=> от Object к MyUser
            MyUser userTmp = (MyUser) ob2; //собственно говоря - наш кастинг(приведение типа)
            System.out.println("getName invoke -> " + userTmp.getName());//как только у тебя в явном виде появляется объект нужного тебе типа - можешь вызвать его метод)
            System.out.println("getAge --->" + userTmp.getAge());
            getPrivateMethod(userClass, userTmp);
        }

        System.out.println("--->> METOD  <<---");

        Method[] methods = userClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Name method ---> " + method.getName());
        }

    }

    private void getPrivateMethod(Class userClass, MyUser userTmp) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method privateMethod = userClass.getDeclaredMethod("myAge");
        privateMethod.setAccessible(true);
        privateMethod.invoke(userTmp, null);//ты уже не привязываешь здесь к имени, тк указал имя на уровне метаданных
        //смотри строчку 54
        //тебе достаточно теперь просто сделать делегацию/"проталкивание"/делегирование объекта того же типа(класса),
        // где находится твой метод;
        //давай постепенно:
        // ты забираешь метод у класса MyUser - это видно из строчки 54, т.к userClass -> представитель именно типа MyUser
        //Class.forName(MyUser.class.getName()); -> то, когда ты захочешь вызвать метод, тебе нужно следовать следующей съеме
        //1-параметр, это твой объект(объект, которому соответствует это   каркас/метаданные твоего метода - в данном случае метода myAge
        //этот объект ты должен создать где-то выше, и передать параметром в метод
        //2-ой, 3-ий, n--й параметры для invoke - это параметры твоего метода myAge(фактические)


        //как он поймет что это именно тот метод который мне нужен?
        //во-первых в 54 строчке ты конкретно указываешь какой метод тебе нужен
        //во-вторых, когда ты в 56 строчке вызываешь метод, то, исходя из параметров, которые ты указываешь после userTmp - определяется
        //какой метод нужно вызвать; в данном случае, у объекта userTmp который в свою очередь ялвяется представителем класса MyUser
        //будет вызван метод myAge, без параметров, т.к privateMethod.invoke(userTmp, null);--> 2-ой параметр идет null
        //это понятно. в строчке54 - я вызываю все методы класса MyUser? нет, ты пробуешь вызвать только те, которые соответствую названию , если
        //их будет несколько - то не сработает, т.к предполагается, что будет вызван всего-лишь один
        //название в скобках и кавычках? да ок, что-то проясняеться)гуд

    }
}
