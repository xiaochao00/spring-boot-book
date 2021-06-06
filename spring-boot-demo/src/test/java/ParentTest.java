import org.junit.Test;

/**
 * test parent
 *
 * @author shichao
 * @since 1.0.0
 * 2021/6/6 21:47
 */
public class ParentTest {
    class F {
        F() {
            System.out.println("I am father");
        }
    }

    class S extends F {
        S() {
            System.out.println("I am son.");
        }

        S(int i) {
            System.out.println("I am son constructor with parameter:" + i);
        }
    }

    @Test
    public void test() {
        // 当创建子类对象时，会先调用父类的构造方法
        //子类的无参构造方法或带参构造方法，都会执行父类无参的构造方法
        S s = new S();
        System.out.println("--------------");
        S s1 = new S(123);
    }
}
