package exceptionstudy;

public class ActionInThrow {

    public static void main(String[] args) {
        doubleNestFunction();
    }
    static void function()throws MyException{
        System.out.println("调用函数，然后抛出自定义异常");
        throw new MyException();
    }

    static void nestFunction() throws MyException {
        System.out.println("这句会执行");
        function();
        System.out.println("这句不会执行因为上一句抛出了异常");
    }

    static void doubleNestFunction(){
        try {
            System.out.println("这句会执行，这是try语句块中的第一句还没有出现抛出异常的问题");
            nestFunction();
            System.out.println("这句不会执行，因为在try语句块中上一句出现错误，无法继续执行");
        } catch (MyException e) {
            System.out.println("在双重嵌套中捕捉到了异常 :"+e.getContent() + "\ncatch是用来处理异常的所以一定会执行");
        } finally {
            System.out.println("finally语句块中一定会执行，所以一般用finally做一些善后或是保护的处理");
        }
        System.out.println("捕捉到了异常可以继续执行");
    }
}
