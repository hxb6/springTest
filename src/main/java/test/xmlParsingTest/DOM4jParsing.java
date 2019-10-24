package test.xmlParsingTest;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

/**
 * @Package: test.xmlParsingTest
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/17 17:01
 * @Description:
 **/
public class DOM4jParsing {
    public static String xmlPath = "src\\main\\resource\\xmlTest.xml";
    /**
     * 获取xml文档
     */
    public static void readXml(Document document) throws Exception {
        //获取根节点
        Element rootElement = document.getRootElement();
        //获取根节点下面的所有直接子节点
        List<Element> elements = rootElement.elements();
        //遍历根目录下的直接子节点
        for (Element element : elements) {
            //获取子节点标签名称
            System.out.println(element.getName());
            //获取子节点标签上属性为id的值
            System.out.println(element.attributeValue("id"));
            //获取子节点下的子节点集合
            List<Element> elements1 = element.elements();
            for (Element element1 : elements1) {
                System.out.println(element1.attributeValue("id"));
            }
        }
    }

    /**
     * 修改xml文档
     * @param document
     * @throws Exception
     */
    public static void updateXml(Document document) throws Exception{
        //获取根节点
        Element rootElement = document.getRootElement();
        //获取根节点下面的所有直接子节点
        List<Element> elements = rootElement.elements();
        //遍历根目录下的直接子节点
        for (Element element : elements) {
            element.addAttribute("update", "2019-10-21");
        }
        saveXml(document);
    }

    /**
     * 删除xml文档元素
     * @param document
     * @throws Exception
     */
    public static void removeXml(Document document) throws Exception{
        //获取根节点
        Element rootElement = document.getRootElement();
        //获取根节点下面的所有直接子节点
        List<Element> elements = rootElement.elements();
        //遍历根目录下的直接子节点
        for (Element element : elements) {
            //如果子节点中属性id值为yy,删除此节点
            if("yy".equals(element.attributeValue("id"))){
                //得到此节点的父节点，由父节点进行删除其子节点
                element.getParent().remove(element);
            }
        }
        saveXml(document);
    }

    /**
     * 添加节点
     * @param document
     * @throws Exception
     */
    public static void addXml(Document document) throws Exception{
        //获取根节点
        Element rootElement = document.getRootElement();
        //根节点下添加标签名为addTest的子节点
        Element element = rootElement.addElement("addTest");
        //子节点添加属性name
        element.addAttribute("name", "hxb");
        //设置标签下的值
        element.setText("添加测试");
        saveXml(document);
    }

    /**
     * 保存xml文档
     * @param document
     */
    public static void saveXml(Document document){
        //格式化
        OutputFormat format = OutputFormat.createPrettyPrint();
        //指定字符编码格式
        format.setEncoding("GBK");
        XMLWriter writer = null;
        //将文件按照指定格式输出到指定路径中
        try {
            writer = new XMLWriter(new OutputStreamWriter(new FileOutputStream(xmlPath)),format);
            writer.write(document);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                //关闭服务
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        //创建xml解析器
        SAXReader saxReader = new SAXReader();
        //创建文档对象
        Document document = saxReader.read(xmlPath);
        //readXml(document);
        //updateXml(document);
        //removeXml(document);
        addXml(document);
    }
}
