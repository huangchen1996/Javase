package Chapter5.FunctionDemo_01;

/**
 * 方法:完成特定功能的代码块
 * 注意:在很多语言里面有函数的定义，而在java中函数被称为方法
 *
 *
 * 格式:
 *   修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2....){
 *       函数体;
 *       return 返回值;
 *   }
 *
 *  详细解释格式:
 *      修饰符:目前就用public static,后面我们再详细的讲解其他的修饰符
 *      返回值类型:就是功能结果的数据类型
 *      方法名:符合命名规则就可以了
 *      参数:
 *          实际参数:就是实际参与运算的
 *          形式参数:就是方法定义上的，用于接收实际参数的
 *
 *      参数类型:就是参数的数据类型
 *      参数名:就是变量名
 *      方法体语句:就是完成功能的代码
 *      return:结束方法
 *      返回值:就是功能的结果，由return带给调用者
 *
 *
 *
 *      要想写好一个方法，就必须明确两个东西
 *           A:返回值类型
 *             结果的数据类型
 *
 *          B:参数列表
 *              你要传递几个参数，以及每个参数的数据类型
 *
 *
 *              需求:求两个数据之和案例
 *
 *
 *              方法的执行特点:
 *                 不调用，不执行
 *
 *                 如何调用呢?(有明确返回值的调用)
 *                 A:单独调用，一般来说没有意义。所以不推荐
 *                 B:输出调用，但是不够好，因为我们可能需要针对结果进行进一步的操作
 *                 C:赋值调用
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class MethodDemo_01 {
    public static void main(String[] args) {
        int a = 80;
        int b = 90;

        //方式1:单独调用
        //sum(a,b);

        //方式2:输出调用
        //System.out.println(sum(a,b));
        //System.out.println(30);

        //方式3:赋值调用
        int result = sum(a,b);



    }
    /**
     * 需求:求两个数据之和
     *
     * 两个明确:
     *     返回值类型:int
     *     参数列表:2个，都是int类型
     */
    public static int sum(int a,int b){
        //如何实现?
        //int c = a + b;
        //return c;
        //c就是a+b,所以我可以直接返回a+b
        return a + b;
    }
}
