package top.haw358.freemarkerdemo;

/**
 * Created by Administrator on 2016-12-10.
 */
import junit.framework.TestCase;

public class FreemarkerDemoTest extends TestCase {

    private static FreemarkerDemo freemarkerDemo = new FreemarkerDemo();

    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testFreemarkerDemo() {
        freemarkerDemo.freemarkerDemo();
    }

    public void testPath() {
        freemarkerDemo.path();
    }

    public static void main(String[] args) {
        freemarkerDemo.freemarkerDemo();
        freemarkerDemo.path();
    }

}
