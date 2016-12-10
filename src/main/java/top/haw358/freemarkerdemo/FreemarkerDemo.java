package top.haw358.freemarkerdemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.TemplateException;

public class FreemarkerDemo {

    public void freemarkerDemo() {
        freemarker.template.Configuration cf = new freemarker.template.Configuration();
        try {
            String path = System.getProperty("user.dir");
            cf.setDirectoryForTemplateLoading(new File(path + "/templates"));

            Map<String, Object> dataModel = new HashMap<String, Object>();
            dataModel.put("message", "hello");
            dataModel.put("name", "haw");

            Writer out = new FileWriter(new File(path + "/templates/test.html"));

            freemarker.template.Template template = cf.getTemplate("test.ftl");
            template.process(dataModel, out);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }

    public void path(){
        //取得根目录路径
        String currentPath = System.getProperty("user.dir");
        System.out.println(currentPath);
        //当前目录路径
        String rootPath = getClass().getResource("/").getFile().toString();
        System.out.println(rootPath);

        URL url = FreemarkerDemo.class.getClassLoader().getResource("");
        System.out.println(url.toString());
        url = Thread.currentThread().getContextClassLoader().getResource("");
        System.out.println(url.toString());

        //当前目录的上级目录路径
        currentPath = getClass().getResource("../").getFile().toString();
        System.out.println(currentPath);
        currentPath = getClass().getResource(".").getFile().toString();
        System.out.println(currentPath);
        currentPath = getClass().getResource("").getFile().toString();
        System.out.println(currentPath);

    }
}
