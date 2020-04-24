package how.jiekou;

public class Demo {
    public static void main(String[] args) {
        AA a1 = new AA();//没有涉及向上转型，只会调用本类中的方法
        AA a2 = new BB();//当父类对象引用变量引用子类对象时
        //a2是类型为A的引用类型，它指向类型为B的对象
        //A父类可调用的方法：只有show(D obj)和show(A obj)。不可调用子类的方法
        BB b = new BB();
        CC c = new CC();
        DD d = new DD();

        //this.show(O),A对象里找不到，就去父类，A没有父类，就第三步this.show((super)O)
        //传入父类的对象A
        System.out.println("1--" + a1.show(b));//A and A,没有涉及向上转型，只会调用本类A中的方法
        //情况同上
        System.out.println("2--" + a1.show(c));//A and A,没有涉及向上转型，只会调用本类A中的方法
        System.out.println("3--" + a1.show(d));//A and D，A对象有，输出A与D



        //a2是类型为A的引用类型,它指向类型为B的对象
        //A确定可调用的方法：show(D obj)和show(A obj)。
        //a2.show(b) ==> this.show(b)，这里this指的是B。
        //在B类中找show（B obj），找到了，可惜没用
        //因为show（B obj）方法不在可调用范围内
        //this.show(O)失败，进入下一级别：super.show(O)，super指的是A。
        //在A 中寻找show（B obj)，失败，因为没用定义这个方法。
        //进入第三级别：this.show((super)O)，this指的是B。
        //在B中找show（（A）O）,找到了：show(A obj)，选择调用该方法
        //输出：B and A
        System.out.println("4--" + a2.show(b));//被引用对象的类型决定了调用谁的成员方法,a2.show(b) ==> this.show(b)，这里this指的是B
       //BandA
        System.out.println("5--" + a2.show(c));//引用变量类型决定可调用的方法。
       //AandD
        System.out.println("6--" + a2.show(d));//如果子类中没有覆盖该方法，那么会去父类中寻找。
        //BandB    在B中寻找show(B obj)，方法
        System.out.println("7--" + b.show(b));
       //BandB   this.show((B)O)
        System.out.println("8--" + b.show(c));


        //首先，b为类型为B的引用对象，指向类型为B的对象
        //没有涉及向上转型，只会调用本类中的方法
        //在B中寻找show(D obj)，方法。找得到是因为B继承了A，只是没显示出来
        //找到了，直接调用该方法。
        //输出 A and D。
        System.out.println("9--" + b.show(d));
        //abcd的关系是这样的：C/D —> B —> A
    }
}
